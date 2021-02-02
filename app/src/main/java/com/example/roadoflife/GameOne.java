package com.example.roadoflife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class GameOne extends AppCompatActivity {

    TextView talkview;
    ArrayList<Integer> holder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_one);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        holder=new ArrayList<Integer>();
        talkview = (TextView) findViewById(R.id.talkview);
        talkview.setText(getString(R.string.two19));

        final Random random=new Random();
        final int[] questionsAmharic={R.string.two2,R.string.two3,R.string.two4,
                R.string.two5,R.string.two6,R.string.two7,R.string.two8,
                R.string.two9,R.string.two10,R.string.two11,R.string.two12,
                R.string.two13,R.string.two14,R.string.two15,R.string.two16,
                R.string.two17,R.string.two18,R.string.two19,R.string.two20,
                R.string.two21,R.string.two22,R.string.two23,R.string.two24,
                R.string.two25,R.string.two26,R.string.two27,R.string.two28,
                R.string.two29,R.string.two30,R.string.two31,R.string.two32,
                R.string.two33,R.string.two34,R.string.two35,R.string.two36,
                R.string.two37,R.string.two38,R.string.two39,R.string.two40,
                R.string.two41,R.string.two42,R.string.two43,R.string.two44,
                R.string.two45,R.string.two46,R.string.two47,R.string.two48,
                R.string.two49,R.string.two50,R.string.two51,R.string.two52,
                R.string.two53,R.string.two54,R.string.two55,R.string.two56,
                R.string.two57,R.string.two58,R.string.two59,R.string.two60,
                R.string.two61,R.string.two62,R.string.two63,R.string.two64,
                R.string.two65,R.string.two66,R.string.two67,R.string.two68,
                R.string.two69,R.string.two70,R.string.two71,R.string.two72,
                R.string.two73,R.string.two74,R.string.two75,R.string.two76,
                R.string.two77,R.string.two78,R.string.two79,R.string.two80,
                R.string.two81,R.string.two82,R.string.two83,R.string.two84,
                R.string.two85,R.string.two86,R.string.two87,R.string.two88,
                R.string.two89,R.string.two90,R.string.two91,R.string.two92,
                R.string.two93,R.string.two94,R.string.two95,R.string.two96,
                R.string.two97,R.string.two98,R.string.two99,R.string.two100,
                R.string.two101,R.string.two102,R.string.two103,R.string.two104,
                R.string.two103,R.string.two104,R.string.two105,R.string.two106,
                R.string.two107,R.string.two108,R.string.two109,R.string.two110,
                R.string.two113,R.string.two112,R.string.two113,R.string.two114,
                R.string.two115,R.string.two116,R.string.two117,R.string.two118,
                R.string.two119,R.string.two120,R.string.two121,R.string.two122,
                R.string.two123,R.string.two124,R.string.two125,R.string.two126,
                R.string.two127,R.string.two128,R.string.two129,R.string.two130,
                R.string.two131,R.string.two132,R.string.two133,R.string.two134,
                R.string.two135,R.string.two136,R.string.two137,R.string.two138,
                R.string.two139,R.string.two140,R.string.two141,R.string.two142,
                R.string.two143,R.string.two144,R.string.two145,R.string.two146,
                R.string.two147,R.string.two148,R.string.two149,R.string.two150,
                R.string.two151,R.string.two152,R.string.two153,R.string.two154,
                R.string.two155,R.string.two156,R.string.two157,R.string.two158,
                R.string.two159,R.string.two160,R.string.two161,R.string.two162,
                R.string.two163,R.string.two164,R.string.two165,R.string.two166,
                R.string.two167,R.string.two168,R.string.two169,R.string.two170,
                R.string.two171,R.string.two172,R.string.two173,R.string.two174,
                R.string.two175,R.string.two176,R.string.two177,R.string.two178,
                R.string.two179,R.string.two180,R.string.two181,R.string.two182,
                R.string.two183,R.string.two184,R.string.two185,R.string.two186,
                R.string.two187,R.string.two188,R.string.two189,R.string.two190,
                R.string.two191,R.string.two192,R.string.two193,R.string.two194,
                R.string.two195,R.string.two196,R.string.two197,R.string.two198,
                R.string.two199,R.string.two200,R.string.two201,R.string.two202,
                R.string.two203,R.string.two204,R.string.two205,R.string.two206,
                R.string.two207,R.string.two208,R.string.two209,R.string.two210,
                R.string.two211,R.string.two212,R.string.two213,R.string.two214,
                R.string.two215,R.string.two216,R.string.two217,R.string.two218,
                R.string.two219,R.string.two220,R.string.two221,R.string.two222,
                R.string.two223,R.string.two224,R.string.two225,R.string.two226,
                R.string.two227,R.string.two228,R.string.two229,R.string.two230,
                R.string.two231,R.string.two232,R.string.two233,R.string.two234,
                R.string.two235,R.string.two236,R.string.two237,R.string.two238,
                R.string.two239,R.string.two240,R.string.two241,R.string.two242,
                R.string.two243,R.string.two244,R.string.two245,R.string.two246,
                R.string.two247,R.string.two248,R.string.two249,R.string.two250,
                R.string.two251,R.string.two252,R.string.two253,R.string.two254,
                R.string.two255,R.string.two256,R.string.two257,R.string.two258,
                R.string.two259,R.string.two260,R.string.two261,R.string.two262,
                R.string.two263,R.string.two264,R.string.two265,R.string.two266,
                R.string.two267,R.string.two268,R.string.two269,R.string.two270,
                R.string.two271,R.string.two272,R.string.two273,R.string.two274,
                R.string.two275,R.string.two276,R.string.two27,R.string.two278,
                R.string.two279,R.string.two280,R.string.two281,R.string.two282,
                R.string.two283,R.string.two284,R.string.two285,R.string.two286,
                R.string.two287,R.string.two288,R.string.two289,R.string.two290,
                R.string.two291,R.string.two292,R.string.two293,R.string.two294,
                R.string.two295,R.string.two296,R.string.two297,R.string.two298,
                R.string.two299,R.string.two300,R.string.two301};

        CardView next = (CardView) findViewById(R.id.talknext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int te=generator(holder);
                talkview.setText(questionsAmharic[te]);
            }
        });
    }
    public int generator(ArrayList<Integer> selected)
    {
        Random random=new Random();
        int posi=random.nextInt(301);
        while (selected.contains(posi))
        {
            posi=random.nextInt(301);
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
