package com.example.roadoflife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PhiloDisplay extends AppCompatActivity {
    TextView one,two,three,one2,two2,three2;
    ImageView fav;
    int[] favImages={R.drawable.ic_favorite_border_black_24dp,R.drawable.ic_favorite};
    int favone=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philo_display);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent=getIntent();

        String messageone = intent.getStringExtra("header");
        String messageone2 = intent.getStringExtra("content");

        one = (TextView) findViewById(R.id.philoheaderone);
        one2 = (TextView) findViewById(R.id.philocontentDisplayone);
        fav = (ImageView)findViewById(R.id.phfavorie1);

        one.setText(messageone);
        one2.setText(messageone2);

        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (favone==0)
                {
                    fav.setImageResource(favImages[1]);
                    favone=1;
                }
                else {
                    fav.setImageResource(favImages[0]);
                    favone=0;
                }
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