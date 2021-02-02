package com.example.roadoflife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;

public class Subconcious extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subconcious);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView cardView=(CardView)findViewById(R.id.finoteone);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String quationone=getString(R.string.chapteronequationone);
                final String answearone=getString(R.string.chapteroneanswearone);
                final String quationtwo=getString(R.string.chapteronequationtwo);
                final String answeartwo=getString(R.string.chapteroneansweartwo);
                final String quationthree=getString(R.string.chapteronequationthree);
                final String answearthree=getString(R.string.chapteroneanswearthree);

                Intent intent=new Intent(Subconcious.this,DisplayTwo.class);
                intent.putExtra("content",answearone);
                intent.putExtra("content2",answeartwo);
                intent.putExtra("content3",answearthree);
                intent.putExtra("header",quationone);
                intent.putExtra("header2",quationtwo);
                intent.putExtra("header3",quationthree);
                intent.putExtra("identifier","2");
                startActivity(intent);
            }
        });
        CardView cardView3=(CardView)findViewById(R.id.finotethree);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String quationone=getString(R.string.chapterthreequationone);
                final String answearone=getString(R.string.chapterthreeanswearone);
                final String quationtwo=getString(R.string.chapterthreequationtwo);
                final String answeartwo=getString(R.string.chapterthreeansweartwo);
                final String quationthree=getString(R.string.chapterthreequationthree);
                final String answearthree=getString(R.string.chapterthreeanswearthree);

                Intent intent=new Intent(Subconcious.this,DisplayTwo.class);
                intent.putExtra("content",answearone);
                intent.putExtra("content2",answeartwo);
                intent.putExtra("content3",answearthree);
                intent.putExtra("header",quationone);
                intent.putExtra("header2",quationtwo);
                intent.putExtra("header3",quationthree);
                intent.putExtra("identifier","2");
                startActivity(intent);
            }
        });
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
