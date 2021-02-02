package com.example.roadoflife;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.Toolbar;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.ActionBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);/*
        toolbar=findViewById(R.id.toolBarHeader);
        setSupportActionBar(toolbar);*/

        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        final ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
/*
        */
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.bookOne:
                        Intent intent = new Intent(MainActivity.this, Subconcious.class);
                        startActivity(intent);
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.bookTwo:
                        Intent intent2 = new Intent(MainActivity.this, Fruits.class);
                        startActivity(intent2);
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.bookThree:
                        Intent intent3 = new Intent(MainActivity.this, Philosophy.class);
                        startActivity(intent3);
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.bookFour:
                        Intent intent4 = new Intent(MainActivity.this, DaniView.class);
                        startActivity(intent4);
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.aboutus:
                        Intent intent5 = new Intent(MainActivity.this, AboutDisplay.class);
                        startActivity(intent5);
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.share:
                        menuItem.setChecked(true);
                        Intent myIntent = new Intent(Intent.ACTION_SEND);
                        myIntent.setType("text/plain");
                        String sharebody="Your Body Here";
                        String sharesub="Your Subject Here";
                        myIntent.putExtra(Intent.EXTRA_TEXT,sharebody);
                        myIntent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                        startActivity(Intent.createChooser(myIntent,"Share using"));
                        drawerLayout.closeDrawers();
                        break;

                }
                return false;
            }
        });
        CardView cardView = (CardView) findViewById(R.id.fruit);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fruits.class);
                startActivity(intent);
            }
        });
        CardView cardView3 = (CardView) findViewById(R.id.philo);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Philosophy.class);
                startActivity(intent);
            }
        });
        CardView cardView4 = (CardView) findViewById(R.id.dani);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DaniView.class);
                startActivity(intent);
            }
        });
        CardView cardView5 = (CardView) findViewById(R.id.finote);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Subconcious.class);
                startActivity(intent);
            }
        });
        CardView cardView6 = (CardView) findViewById(R.id.game);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Game.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.drawable.images);
        builder.setMessage("Do You Want to Exit?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert=builder.create();
        alert.show();
    }
}





























        /*

*/

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

