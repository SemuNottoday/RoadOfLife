package com.example.roadoflife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class GameThree extends AppCompatActivity {


    TextView orderview;
    ArrayList<Integer> holder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_three);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        holder=new ArrayList<Integer>();
        orderview = (TextView) findViewById(R.id.orderview);
        orderview.setText(getString(R.string.o1));

        final Random random=new Random();
        final int[] orders={R.string.o1,R.string.o2,R.string.o3,R.string.o4,
                R.string.o5,R.string.o6,R.string.o7,R.string.o8,R.string.o9,
                R.string.o10,R.string.o11,R.string.o12,R.string.o13,R.string.o14,
                R.string.o15,R.string.o16,R.string.o17,R.string.o18,R.string.o19,
                R.string.o20,R.string.o21,R.string.o22,R.string.o23,R.string.o24,
                R.string.o25,R.string.o26,R.string.o27,R.string.o28,R.string.o29,
                R.string.o30,R.string.o31,R.string.o32,R.string.o33,R.string.o34,
                R.string.o35,R.string.o36,R.string.o37,R.string.o38,R.string.o39,
                R.string.o40,R.string.o41,R.string.o42,R.string.o43,R.string.o44,
                R.string.o45,R.string.o46,R.string.o47,R.string.o48,R.string.o49,
                R.string.o50,R.string.o51,R.string.o52,R.string.o53,R.string.o54,
                R.string.o55,R.string.o56,R.string.o57,R.string.o58,R.string.o59,
                R.string.o60,R.string.o61,R.string.o62,R.string.o63,R.string.o64,
                R.string.o65,R.string.o66,R.string.o67};

        CardView next = (CardView) findViewById(R.id.ordernext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int te=generator(holder);
                orderview.setText(orders[te]);
            }
        });
    }
    public int generator(ArrayList<Integer> selected)
    {
        Random random=new Random();
        int posi=random.nextInt(67);
        while (selected.contains(posi))
        {
            posi=random.nextInt(67);
        }
        holder.add(posi);
        return posi;
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
