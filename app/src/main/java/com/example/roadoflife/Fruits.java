package com.example.roadoflife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Fruits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);/*
        final int identif=1;
        final String identifier=getString(identif);*/

        CardView cardView=(CardView) findViewById(R.id.fruitone);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.lovecontent);
                final String paragraph2= getString(R.string.lovecontent2);
                final String paragraph3= getString(R.string.lovecontent3);
                final String paragraph4= getString(R.string.lovecontent4);
                final String paragraph5= getString(R.string.lovecontent5);
                final String header= getString(R.string.loveheaderone);
                final String header2= getString(R.string.loveheadertwo);
                final String header3= getString(R.string.loveheaderthree);
                final String header4= getString(R.string.loveheaderfour);
                final String header5= getString(R.string.loveheaderfive);
                final String qoutes= getString(R.string.love);
                Intent intent=new Intent(Fruits.this,Display.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("content2",paragraph2+"");
                intent.putExtra("content3",paragraph3+"");
                intent.putExtra("content4",paragraph4+"");
                intent.putExtra("content5",paragraph5+"");
                intent.putExtra("header",header+"");
                intent.putExtra("header2",header2+"");
                intent.putExtra("header3",header3+"");
                intent.putExtra("header4",header4+"");
                intent.putExtra("header5",header5+"");
                intent.putExtra("qoutes",qoutes+"");
                intent.putExtra("identifier","1");
                startActivity(intent);
            }
        });
        CardView cardView2=(CardView) findViewById(R.id.fruittwo);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.happycontent);
                final String paragraph2= getString(R.string.happycontent2);
                final String paragraph3= getString(R.string.happycontent3);
                final String paragraph4= getString(R.string.happycontent4);
                final String paragraph5= getString(R.string.happycontent5);
                final String header= getString(R.string.happyheaderone);
                final String header2= getString(R.string.happyheadertwo);
                final String header3= getString(R.string.happyheaderthree);
                final String header4= getString(R.string.happyheaderfour);
                final String header5= getString(R.string.happyheaderfive);
                final String qoutes= getString(R.string.happy);
                Intent intent=new Intent(Fruits.this,Display.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("content2",paragraph2+"");
                intent.putExtra("content3",paragraph3+"");
                intent.putExtra("content4",paragraph4+"");
                intent.putExtra("content5",paragraph5+"");
                intent.putExtra("header",header+"");
                intent.putExtra("header2",header2+"");
                intent.putExtra("header3",header3+"");
                intent.putExtra("header4",header4+"");
                intent.putExtra("header5",header5+"");
                intent.putExtra("qoutes",qoutes+"");
                intent.putExtra("identifier","2");
                startActivity(intent);
            }
        });
        CardView cardView3=(CardView) findViewById(R.id.fruitthree);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.peacecontent);
                final String paragraph2= getString(R.string.peacecontent2);
                final String paragraph3= getString(R.string.peacecontent3);
                final String paragraph4= getString(R.string.peacecontent4);
                final String paragraph5= getString(R.string.peacecontent5);
                final String header= getString(R.string.peaceheaderone);
                final String header2= getString(R.string.peaceheadertwo);
                final String header3= getString(R.string.peaceheaderthree);
                final String header4= getString(R.string.peaceheaderfour);
                final String header5= getString(R.string.peaceheaderfive);
                final String qoutes= getString(R.string.peace);
                Intent intent=new Intent(Fruits.this,Display.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("content2",paragraph2+"");
                intent.putExtra("content3",paragraph3+"");
                intent.putExtra("content4",paragraph4+"");
                intent.putExtra("content5",paragraph5+"");
                intent.putExtra("header",header+"");
                intent.putExtra("header2",header2+"");
                intent.putExtra("header3",header3+"");
                intent.putExtra("header4",header4+"");
                intent.putExtra("header5",header5+"");
                intent.putExtra("qoutes",qoutes+"");
                intent.putExtra("identifier","3");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.fruit,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
