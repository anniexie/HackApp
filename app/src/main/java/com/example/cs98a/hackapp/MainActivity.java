package com.example.cs98a.hackapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cannon = (Button) findViewById(R.id.can);

                cannon.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ClubActivity.club = Location.CANNON;

                Intent myIntent = new Intent(MainActivity.this, ClubActivity.class);
                myIntent.putExtra("clubName", "Cannon"); //Optional parameters
                startActivity(myIntent);
            }
        });

        Button here1 = (Button) findViewById(R.id.here1);

        here1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                User.me.updateLocation(Location.CANNON);
            }
        });

        Button cap = (Button) findViewById(R.id.cap);

        cap.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ClubActivity.club = Location.CAP;

                Intent myIntent = new Intent(MainActivity.this, ClubActivity.class);
                myIntent.putExtra("clubName", "Cap And Gown"); //Optional parameters
                startActivity(myIntent);
            }
        });

        Button here2 = (Button) findViewById(R.id.here2);

        here2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                User.me.updateLocation(Location.CAP);
            }
        });

        Button charter = (Button) findViewById(R.id.chart);

        charter.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ClubActivity.club = Location.CHARTER;

                Intent myIntent = new Intent(MainActivity.this, ClubActivity.class);
                myIntent.putExtra("clubName", "Charter"); //Optional parameters
                startActivity(myIntent);
            }
        });

        Button here3 = (Button) findViewById(R.id.here3);

        here3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                User.me.updateLocation(Location.CHARTER);
            }
        });

        Button cloister = (Button) findViewById(R.id.cloi);

        cloister.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ClubActivity.club = Location.CLOISTER;

                Intent myIntent = new Intent(MainActivity.this, ClubActivity.class);
                myIntent.putExtra("clubName", "Cloister"); //Optional parameters
                startActivity(myIntent);
            }
        });

        Button here4 = (Button) findViewById(R.id.here4);

        here4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                User.me.updateLocation(Location.CLOISTER);
            }
        });

        Button colonial = (Button) findViewById(R.id.col);

        colonial.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ClubActivity.club = Location.COLONIAL;

                Intent myIntent = new Intent(MainActivity.this, ClubActivity.class);
                myIntent.putExtra("clubName", "Colonial"); //Optional parameters
                startActivity(myIntent);
            }
        });

        Button here5 = (Button) findViewById(R.id.here5);

        here5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                User.me.updateLocation(Location.COLONIAL);
            }
        });

        Button cottage = (Button) findViewById(R.id.cot);

        cottage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ClubActivity.club = Location.COTTAGE;

                Intent myIntent = new Intent(MainActivity.this, ClubActivity.class);
                myIntent.putExtra("clubName", "Cottage"); //Optional parameters
                startActivity(myIntent);
            }
        });

        Button here6 = (Button) findViewById(R.id.here6);

        here6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                User.me.updateLocation(Location.COTTAGE);
            }
        });

        Button ivy = (Button) findViewById(R.id.ivy);

        ivy.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ClubActivity.club = Location.IVY;

                Intent myIntent = new Intent(MainActivity.this, ClubActivity.class);
                myIntent.putExtra("clubName", "Ivy"); //Optional parameters
                startActivity(myIntent);
            }
        });

        Button here7 = (Button) findViewById(R.id.here7);

        here7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                User.me.updateLocation(Location.IVY);
            }
        });

        Button quad = (Button) findViewById(R.id.quad);

        quad.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ClubActivity.club = Location.QUAD;

                Intent myIntent = new Intent(MainActivity.this, ClubActivity.class);
                myIntent.putExtra("clubName", "Quad"); //Optional parameters
                startActivity(myIntent);
            }
        });

        Button here8 = (Button) findViewById(R.id.here8);

        here8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                User.me.updateLocation(Location.QUAD);
            }
        });

        Button terrace = (Button) findViewById(R.id.ter);

        terrace.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ClubActivity.club = Location.TERRACE;

                Intent myIntent = new Intent(MainActivity.this, ClubActivity.class);
                myIntent.putExtra("clubName", "Terrace"); //Optional parameters
                startActivity(myIntent);
            }
        });

        Button here9 = (Button) findViewById(R.id.here9);

        here9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                User.me.updateLocation(Location.TERRACE);
            }
        });

        Button tiger = (Button) findViewById(R.id.tig);

        tiger.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ClubActivity.club = Location.TIGER;

                Intent myIntent = new Intent(MainActivity.this, ClubActivity.class);
                myIntent.putExtra("clubName", "Tiger"); //Optional parameters
                startActivity(myIntent);
            }
        });

        Button here10 = (Button) findViewById(R.id.here10);

        here10.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                User.me.updateLocation(Location.TIGER);
            }
        });

        Button tower = (Button) findViewById(R.id.tow);

        tower.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ClubActivity.club = Location.TOWER;
                Intent myIntent = new Intent(MainActivity.this, ClubActivity.class);
                myIntent.putExtra("clubName", "Tower"); //Optional parameters
                startActivity(myIntent);
            }
        });

        Button here11 = (Button) findViewById(R.id.here11);

        here11.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                User.me.updateLocation(Location.TOWER);
            }
        });

        Button night = (Button) findViewById(R.id.goodNight);

        night.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                User.me.updateLocation(Location.ELSEWHERE);
            }
        });

        User.initializeDB();
    }
}
