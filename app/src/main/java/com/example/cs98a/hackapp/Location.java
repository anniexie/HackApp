package com.example.cs98a.hackapp;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Location {

    private String                   where;
    private TreeMap<String, String>  visitors;

    public static final String CANNON    = "Cannon Dial Elm Club";
    public static final String CAP       = "Cap and Gown Club";
    public static final String CHARTER   = "Charter Club";
    public static final String CLOISTER  = "Cloister Inn";
    public static final String COLONIAL  = "Colonial Club";
    public static final String COTTAGE   = "Cottage Club";
    public static final String IVY       = "Ivy Club";
    public static final String QUAD      = "Quadrangle Club";
    public static final String TERRACE   = "Terrace Club";
    public static final String TIGER     = "Tiger Inn";
    public static final String TOWER     = "Tower Club";
    public static final String ELSEWHERE = "Elsewhere";

    public static final Location[] CLUBS = { new Location(CANNON), new Location(CAP),
                                             new Location(CHARTER), new Location(CLOISTER),
                                             new Location(COLONIAL), new Location(COTTAGE),
                                             new Location(IVY), new Location(QUAD),
                                             new Location(TERRACE), new Location(TIGER),
                                             new Location(TOWER), new Location(ELSEWHERE) };

    public Location(String where) {
        this.where    = where;
        this.visitors = new TreeMap<String, String>();
    }

    public String where() {
        return where;
    }

    public ArrayList<String> getVisitors() {
        return new ArrayList<String>(visitors.values());
    }

    public boolean isPresent(String name) {
        return visitors.containsValue(name);
    }

    public void add(User u) {
        if (where.equals("Elsewhere"))
            return;
        visitors.put(u.UID(), u.getName());
    }

    public void remove(User u) {
        if (where.equals("Elsewhere"))
            return;
        visitors.remove(u.UID());
    }

    public static int indexOf(String location) {
        for (int i = 0; i < CLUBS.length; i++)
            if (location.equals(CLUBS[i].where))
                return i;
        return CLUBS.length - 1;
    }

    public static ArrayList<String> getVisitors(String club) {
        return CLUBS[indexOf(club)].getVisitors();
    }

}
