package com.example.roadoflife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayTwo extends AppCompatActivity {
    TextView one,two,three,one2,two2,three2;
    String identifier="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_two);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent=getIntent();

        String messageone = intent.getStringExtra("header");
        String messageone2 = intent.getStringExtra("content");
        String messagetwo = intent.getStringExtra("header2");
        String messagetwo2 = intent.getStringExtra("content2");
        String messagethree = intent.getStringExtra("header3");
        String messagethree2 = intent.getStringExtra("content3");
        identifier= intent.getStringExtra("identifier");

        String message = intent.getStringExtra("qoutes");

        one = (TextView) findViewById(R.id.quateDisplay);

        one = (TextView) findViewById(R.id.daniheaderone);
        two = (TextView) findViewById(R.id.daniheadertwo);
        three = (TextView) findViewById(R.id.daniheaderthree);
        one2 = (TextView) findViewById(R.id.danicontentDisplayone);
        two2 = (TextView) findViewById(R.id.danicontentDisplaytwo);
        three2 = (TextView) findViewById(R.id.danicontentDisplaythree);

        one.setText(messageone);
        two.setText(messagetwo);
        three.setText(messagethree);

        one2.setText(messageone2);
        two2.setText(messagetwo2);
        three2.setText(messagethree2);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        if (identifier.equals("1"))
        {
            inflater.inflate(R.menu.dani_view,menu);
        }
        else if (identifier.equals("2"))
        {
            inflater.inflate(R.menu.subconcious,menu);
        }
        else
        {
            inflater.inflate(R.menu.love,menu);
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
