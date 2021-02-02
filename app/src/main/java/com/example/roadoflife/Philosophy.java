package com.example.roadoflife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Philosophy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philosophy);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CardView cardView=(CardView) findViewById(R.id.aboutbook);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.philointrocontent);
                final String header= getString(R.string.headerintro);
                final String qoutes= getString(R.string.love);
                Intent intent=new Intent(Philosophy.this,PhiloDisplay.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("header",header+"");
                intent.putExtra("qoutes",qoutes+"");
                startActivity(intent);
            }
        });
        CardView cardView2=(CardView) findViewById(R.id.philoone);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.philochapteronecontent);
                final String header= getString(R.string.philochapteroneheader);
                final String qoutes= getString(R.string.love);
                Intent intent=new Intent(Philosophy.this,PhiloDisplay.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("header",header+"");
                intent.putExtra("qoutes",qoutes+"");
                startActivity(intent);
            }
        });
        CardView cardView3=(CardView) findViewById(R.id.philotwo);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.philochaptertwocontent);
                final String header= getString(R.string.philochaptertwoheader);
                final String qoutes= getString(R.string.love);
                Intent intent=new Intent(Philosophy.this,PhiloDisplay.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("header",header+"");
                intent.putExtra("qoutes",qoutes+"");
                startActivity(intent);
            }
        });
        CardView cardView4=(CardView) findViewById(R.id.philothree);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.philochapterthreecontent);
                final String header= getString(R.string.philochapterthreeheader);
                final String qoutes= getString(R.string.love);
                Intent intent=new Intent(Philosophy.this,PhiloDisplay.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("header",header+"");
                intent.putExtra("qoutes",qoutes+"");
                startActivity(intent);
            }
        });
        CardView cardView5=(CardView) findViewById(R.id.philofour);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.philochapterfourcontent);
                final String header= getString(R.string.philochapterfourheader);
                final String qoutes= getString(R.string.love);
                Intent intent=new Intent(Philosophy.this,PhiloDisplay.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("header",header+"");
                intent.putExtra("qoutes",qoutes+"");
                startActivity(intent);
            }
        });
        CardView cardView6=(CardView) findViewById(R.id.philofive);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.philochapterfivecontent);
                final String header= getString(R.string.philochapterfiveheader);
                final String qoutes= getString(R.string.love);
                Intent intent=new Intent(Philosophy.this,PhiloDisplay.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("header",header+"");
                intent.putExtra("qoutes",qoutes+"");
                startActivity(intent);
            }
        });
        CardView cardView7=(CardView) findViewById(R.id.philosix);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.philochaptersixcontent);
                final String header= getString(R.string.philochaptersixheader);
                final String qoutes= getString(R.string.love);
                Intent intent=new Intent(Philosophy.this,PhiloDisplay.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("header",header+"");
                intent.putExtra("qoutes",qoutes+"");
                startActivity(intent);
            }
        });
        CardView cardView8=(CardView) findViewById(R.id.philoseven);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.philochaptersevencontent);
                final String header= getString(R.string.philochaptersevenheader);
                final String qoutes= getString(R.string.love);
                Intent intent=new Intent(Philosophy.this,PhiloDisplay.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("header",header+"");
                intent.putExtra("qoutes",qoutes+"");
                startActivity(intent);
            }
        });
        CardView cardView9=(CardView) findViewById(R.id.philoeight);
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.philochaptereightcontent);
                final String header= getString(R.string.philochaptereightheader);
                final String qoutes= getString(R.string.love);
                Intent intent=new Intent(Philosophy.this,PhiloDisplay.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("header",header+"");
                intent.putExtra("qoutes",qoutes+"");
                startActivity(intent);
            }
        });

        CardView cardView10=(CardView) findViewById(R.id.philonine);
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.philochapterninecontent);
                final String header= getString(R.string.philochapternineheader);
                final String qoutes= getString(R.string.love);
                Intent intent=new Intent(Philosophy.this,PhiloDisplay.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("header",header+"");
                intent.putExtra("qoutes",qoutes+"");
                startActivity(intent);
            }
        });
        CardView cardView11=(CardView) findViewById(R.id.philoten);
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.philochaptertencontent);
                final String header= getString(R.string.philochaptertenheader);
                final String qoutes= getString(R.string.love);
                Intent intent=new Intent(Philosophy.this,PhiloDisplay.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("header",header+"");
                intent.putExtra("qoutes",qoutes+"");
                startActivity(intent);
            }
        });
        CardView cardView12=(CardView) findViewById(R.id.philoeleven);
        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.philochapterelevencontent);
                final String header= getString(R.string.philochapterelevenheader);
                final String qoutes= getString(R.string.love);
                Intent intent=new Intent(Philosophy.this,PhiloDisplay.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("header",header+"");
                intent.putExtra("qoutes",qoutes+"");
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.philo,menu);
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
