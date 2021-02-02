package com.example.roadoflife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Display extends AppCompatActivity {
    TextView one,two,two2,two3,two4,two5,three,three2,three3,three4,three5;
    String identifier="";
    ImageView fav,fav2,fav3,fav4,fav5;
    int[] favImages={R.drawable.ic_favorite,R.drawable.ic_favorite_border_black_24dp};
    int favone=0,favtwo=0,favthree=0,favfour=0,favfive=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent=getIntent();

        String messageone = intent.getStringExtra("content");
        String messageone2 = intent.getStringExtra("content2");
        String messageone3 = intent.getStringExtra("content3");
        String messageone4 = intent.getStringExtra("content4");
        String messageone5 = intent.getStringExtra("content5");
        String messagetwo = intent.getStringExtra("header");
        String messagetwo2 = intent.getStringExtra("header2");
        String messagetwo3 = intent.getStringExtra("header3");
        String messagetwo4 = intent.getStringExtra("header4");
        String messagetwo5 = intent.getStringExtra("header5");
        String messagethree = intent.getStringExtra("qoutes");
        identifier = intent.getStringExtra("identifier");

        one = (TextView) findViewById(R.id.quateDisplay);
        two = (TextView) findViewById(R.id.header);
        two2 = (TextView) findViewById(R.id.header2);
        two3 = (TextView) findViewById(R.id.header3);
        two4 = (TextView) findViewById(R.id.header4);
        two5 = (TextView) findViewById(R.id.header5);
        three = (TextView) findViewById(R.id.contentDisplay);
        three2 = (TextView) findViewById(R.id.contentDisplay2);
        three3 = (TextView) findViewById(R.id.contentDisplay3);
        three4 = (TextView) findViewById(R.id.contentDisplay4);
        three5 = (TextView) findViewById(R.id.contentDisplay5);

        fav=(ImageView)findViewById(R.id.favorie1);
        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (favone==0){
                    fav.setImageResource(favImages[0]);
                    favone=1;
                }else {
                    fav.setImageResource(favImages[1]);
                    favone=0;
                }
            }
        });
        fav2=(ImageView)findViewById(R.id.favorie2);
        fav2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (favtwo==0){
                    fav2.setImageResource(favImages[0]);
                    favtwo=1;
                }else {
                    fav2.setImageResource(favImages[1]);
                    favtwo=0;
                }
            }
        });
        fav3=(ImageView)findViewById(R.id.favorie3);
        fav3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (favthree==0){
                    fav3.setImageResource(favImages[0]);
                    favthree=1;
                }else {
                    fav3.setImageResource(favImages[1]);
                    favthree=0;
                }
            }
        });
        fav4=(ImageView)findViewById(R.id.favorie4);
        fav4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (favfour==0){
                    fav4.setImageResource(favImages[0]);
                    favfour=1;
                }else {
                    fav4.setImageResource(favImages[1]);
                    favfour=0;
                }
            }
        });
        fav5=(ImageView)findViewById(R.id.favorie5);
        fav5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (favfive==0){
                    fav5.setImageResource(favImages[0]);
                    favfive=1;
                }else {
                    fav5.setImageResource(favImages[1]);
                    favfive=0;
                }
            }
        });

        one.setText(messagethree);
        two.setText(messagetwo);
        two2.setText(messagetwo2);
        two3.setText(messagetwo3);
        two4.setText(messagetwo4);
        two5.setText(messagetwo5);
        three.setText(messageone);
        three2.setText(messageone2);
        three3.setText(messageone3);
        three4.setText(messageone4);
        three5.setText(messageone5);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        if (identifier.equals("1"))
        {
            inflater.inflate(R.menu.love,menu);
        }
        else if (identifier.equals("2"))
        {
            inflater.inflate(R.menu.happy,menu);
        }
        else if (identifier.equals("3"))
        {
            inflater.inflate(R.menu.peace,menu);
        }
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
