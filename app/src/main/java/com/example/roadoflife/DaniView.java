package com.example.roadoflife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class DaniView extends AppCompatActivity {
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dani_view);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView cardView=(CardView) findViewById(R.id.danione);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.danichapteronecontent1);
                final String paragraph2= getString(R.string.danichapteronecontent2);
                final String paragraph3= getString(R.string.danichapteronecontent3);
                final String header= getString(R.string.danichapteroneheader1);
                final String header2= getString(R.string.danichapteroneheader2);
                final String header3= getString(R.string.danichapteroneheader3);
                Intent intent=new Intent(DaniView.this,DisplayTwo.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("content2",paragraph2+"");
                intent.putExtra("content3",paragraph3+"");
                intent.putExtra("header",header+"");
                intent.putExtra("header2",header2+"");
                intent.putExtra("header3",header3+"");
                intent.putExtra("identifier","1");
                startActivity(intent);
            }
        });
        CardView cardView2=(CardView) findViewById(R.id.danitwo);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.danichaptertwocontet1);
                final String paragraph2= getString(R.string.danichaptertwocontet2);
                final String paragraph3= getString(R.string.danichaptertwocontet3);
                final String header= getString(R.string.danichaptertwoheader1);
                final String header2= getString(R.string.danichaptertwoheader2);
                final String header3= getString(R.string.danichaptertwoheader3);
                Intent intent=new Intent(DaniView.this,DisplayTwo.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("content2",paragraph2+"");
                intent.putExtra("content3",paragraph3+"");
                intent.putExtra("header",header+"");
                intent.putExtra("header2",header2+"");
                intent.putExtra("header3",header3+"");
                intent.putExtra("identifier","1");
                startActivity(intent);
            }
        });
        CardView cardView3=(CardView) findViewById(R.id.danithree);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.danichapterthreecontent1);
                final String paragraph2= getString(R.string.danichapterthreecontent2);
                final String paragraph3= getString(R.string.danichapterthreecontent3);
                final String header= getString(R.string.danichapterthreeheader1);
                final String header2= getString(R.string.danichapterthreeheader2);
                final String header3= getString(R.string.danichapterthreeheader3);
                Intent intent=new Intent(DaniView.this,DisplayTwo.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("content2",paragraph2+"");
                intent.putExtra("content3",paragraph3+"");
                intent.putExtra("header",header+"");
                intent.putExtra("header2",header2+"");
                intent.putExtra("header3",header3+"");
                intent.putExtra("identifier","1");
                startActivity(intent);
            }
        });
        CardView cardView4=(CardView) findViewById(R.id.danifour);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.danichapterfourcontent1);
                final String paragraph2= getString(R.string.danichapterfourcontent2);
                final String paragraph3= getString(R.string.danichapterfourcontent3);
                final String header= getString(R.string.danichapterfourheader1);
                final String header2= getString(R.string.danichapterfourheader2);
                final String header3= getString(R.string.danichapterfourheader3);
                Intent intent=new Intent(DaniView.this,DisplayTwo.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("content2",paragraph2+"");
                intent.putExtra("content3",paragraph3+"");
                intent.putExtra("header",header+"");
                intent.putExtra("header2",header2+"");
                intent.putExtra("header3",header3+"");
                intent.putExtra("identifier","1");
                startActivity(intent);
            }
        });
        CardView cardView5=(CardView) findViewById(R.id.danifive);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.danichapterfivecontent1);
                final String paragraph2= getString(R.string.danichapterfivecontent2);
                final String paragraph3= getString(R.string.danichapterfivecontent3);
                final String header= getString(R.string.danichapterfiveheader1);
                final String header2= getString(R.string.danichapterfiveheader2);
                final String header3= getString(R.string.danichapterfiveheader3);
                Intent intent=new Intent(DaniView.this,DisplayTwo.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("content2",paragraph2+"");
                intent.putExtra("content3",paragraph3+"");
                intent.putExtra("header",header+"");
                intent.putExtra("header2",header2+"");
                intent.putExtra("header3",header3+"");
                intent.putExtra("identifier","1");
                startActivity(intent);
            }
        });
        CardView cardView6=(CardView) findViewById(R.id.danisix);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.danichaptersixcontent1);
                final String paragraph2= getString(R.string.danichaptersixcontent2);
                final String paragraph3= getString(R.string.danichaptersixcontent3);
                final String header= getString(R.string.danichaptersixheader1);
                final String header2= getString(R.string.danichaptersixheader2);
                final String header3= getString(R.string.danichaptersixheader3);
                Intent intent=new Intent(DaniView.this,DisplayTwo.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("content2",paragraph2+"");
                intent.putExtra("content3",paragraph3+"");
                intent.putExtra("header",header+"");
                intent.putExtra("header2",header2+"");
                intent.putExtra("header3",header3+"");
                intent.putExtra("identifier","1");
                startActivity(intent);
            }
        });
        CardView cardView7=(CardView) findViewById(R.id.daniseven);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.danichaptersevencontent1);
                final String paragraph2= getString(R.string.danichaptersevencontent2);
                final String paragraph3= getString(R.string.danichaptersevencontent3);
                final String header= getString(R.string.danichaptersevenheader1);
                final String header2= getString(R.string.danichaptersevenheader2);
                final String header3= getString(R.string.danichaptersevenheader3);
                Intent intent=new Intent(DaniView.this,DisplayTwo.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("content2",paragraph2+"");
                intent.putExtra("content3",paragraph3+"");
                intent.putExtra("header",header+"");
                intent.putExtra("header2",header2+"");
                intent.putExtra("header3",header3+"");
                intent.putExtra("identifier","1");
                startActivity(intent);
            }
        });
        CardView cardView8=(CardView) findViewById(R.id.danieight);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.danichaptereightcontent1);
                final String paragraph2= getString(R.string.danichaptereightcontent2);
                final String paragraph3= getString(R.string.danichaptereightcontent3);
                final String header= getString(R.string.danichaptereightheader1);
                final String header2= getString(R.string.danichaptereightheader2);
                final String header3= getString(R.string.danichaptereightheader3);
                Intent intent=new Intent(DaniView.this,DisplayTwo.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("content2",paragraph2+"");
                intent.putExtra("content3",paragraph3+"");
                intent.putExtra("header",header+"");
                intent.putExtra("header2",header2+"");
                intent.putExtra("header3",header3+"");
                intent.putExtra("identifier","1");
                startActivity(intent);
            }
        });
        CardView cardView9=(CardView) findViewById(R.id.daninine);
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.danichapterninecontent1);
                final String paragraph2= getString(R.string.danichapterninecontent2);
                final String paragraph3= getString(R.string.danichapterninecontent3);
                final String header= getString(R.string.danichapternineheader1);
                final String header2= getString(R.string.danichapternineheader2);
                final String header3= getString(R.string.danichapternineheader3);
                Intent intent=new Intent(DaniView.this,DisplayTwo.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("content2",paragraph2+"");
                intent.putExtra("content3",paragraph3+"");
                intent.putExtra("header",header+"");
                intent.putExtra("header2",header2+"");
                intent.putExtra("header3",header3+"");
                intent.putExtra("identifier","1");
                startActivity(intent);
            }
        });
        CardView cardView10=(CardView) findViewById(R.id.daniten);
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.danichaptertencontent1);
                final String paragraph2= getString(R.string.danichaptertencontent2);
                final String paragraph3= getString(R.string.danichaptertencontent3);
                final String header= getString(R.string.danichaptertenheader1);
                final String header2= getString(R.string.danichaptertenheader2);
                final String header3= getString(R.string.danichaptertenheader3);
                Intent intent=new Intent(DaniView.this,DisplayTwo.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("content2",paragraph2+"");
                intent.putExtra("content3",paragraph3+"");
                intent.putExtra("header",header+"");
                intent.putExtra("header2",header2+"");
                intent.putExtra("header3",header3+"");
                intent.putExtra("identifier","1");
                startActivity(intent);
            }
        });
        CardView cardView11=(CardView) findViewById(R.id.daniIntro);
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String paragraph= getString(R.string.daniaboutcontent);
                final String header= getString(R.string.daniaboutheader);
                Intent intent=new Intent(DaniView.this,AboutDisplay.class);
                intent.putExtra("content",paragraph+"");
                intent.putExtra("header",header+"");
                intent.putExtra("identifier","1");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.dani_view,menu);
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
