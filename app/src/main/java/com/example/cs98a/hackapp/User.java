package com.example.cs98a.hackapp;


import android.util.Log;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.TreeMap;

public class User implements Comparable<User> {

    private String  name;
    private String  location;
    private String  UID;

    public static User me;
    private static boolean initialized = false;
    private static DatabaseReference usersDBRef = FirebaseDatabase.getInstance().getReference("users");
    private static TreeMap<String, String> users = new TreeMap<>();

    public User() {

    }

    public User(String name, String location) {
        if (!initialized)
            initializeDB();
        this.name = name;
        this.location = location;
        this.UID = Integer.toString(name.hashCode());
        usersDBRef.child(UID).setValue(this);
    }

    public static void createUser(String name, String location) {
        usersDBRef.child(Integer.toString(name.hashCode())).setValue(new User(name, location));
        users.put(name, location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static void insertUser(String name, String location) {
        users.put(name, location);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String UID() {
        if (UID == null)
            UID = Integer.toString(name.hashCode());
        return UID;
    }

    public int compareTo(User u) {
        return name.compareTo(u.name);
    }

    public boolean isActive(User u) {
        return users.get(u) != null;
    }

    public String locationOf(User u) {
        return users.get(u);
    }

    public void updateLocation(String location) {
        this.location = location;
        usersDBRef.child(UID).setValue(this);
    }

    public String toString() {
        return String.format("%s\t%s", name, location);
    }

    public void remove() {
        usersDBRef.child(UID).removeValue();
    }

    public static void initializeDB() {
        usersDBRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                User user = dataSnapshot.getValue(User.class);
                users.put(user.getName(), user.getLocation());
                Location.CLUBS[Location.indexOf(user.getLocation())].add(user);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                User user = dataSnapshot.getValue(User.class);
                String previous = users.get(user.getName());
                Location.CLUBS[Location.indexOf(previous)].remove(user);
                users.put(user.getName(), user.getLocation());
                Location.CLUBS[Location.indexOf(user.getLocation())].add(user);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                User user = dataSnapshot.getValue(User.class);
                String where = users.get(user.getName());
                users.remove(user.getName());
                Location.CLUBS[Location.indexOf(where)].remove(user);
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
                return;
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w("Error", databaseError.toException());
            }
        });
        initialized = true;
    }

}
