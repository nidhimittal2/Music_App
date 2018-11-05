package com.example.nidhi.sample_musicapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer[] mediaPlayer = new MediaPlayer[15];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer[0] = MediaPlayer.create(this,R.raw.friends);
        mediaPlayer[1] = MediaPlayer.create(this,R.raw.challa);
        mediaPlayer[2] = MediaPlayer.create(this,R.raw.kabira);
        mediaPlayer[3] = MediaPlayer.create(this,R.raw.loveme);
        mediaPlayer[4] = MediaPlayer.create(this,R.raw.ojane);
        mediaPlayer[5] = MediaPlayer.create(this,R.raw.quamat);
        mediaPlayer[6] = MediaPlayer.create(this,R.raw.shapeofu);
        mediaPlayer[7] = MediaPlayer.create(this,R.raw.tera_yaar);

        Button b1 = (Button) findViewById(R.id.play1);
        Button b2 = (Button) findViewById(R.id.pause1);
        Button b3 = (Button) findViewById(R.id.play2);
        Button b4 = (Button) findViewById(R.id.pause2);
        Button b5 = (Button) findViewById(R.id.play3);
        Button b6 = (Button) findViewById(R.id.pause3);
        Button b7 = (Button) findViewById(R.id.play4);
        Button b8 = (Button) findViewById(R.id.pause4);
        Button b9 = (Button) findViewById(R.id.play5);
        Button b10 = (Button) findViewById(R.id.pause5);
        Button b11 = (Button) findViewById(R.id.play6);
        Button b12 = (Button) findViewById(R.id.pause6);
        Button b13= (Button) findViewById(R.id.play7);
        Button b14 = (Button) findViewById(R.id.pause7);
        Button b15= (Button) findViewById(R.id.play8);
        Button b16 = (Button) findViewById(R.id.pause8);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[0].start();

            }
        });

     b2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             mediaPlayer[0].pause();
         }
     });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[6].start();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[6].pause();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[7].start();

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[7].pause();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[1].start();

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[1].pause();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[2].start();

            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[2].pause();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[4].start();

            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[4].pause();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[5].start();

            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[5].pause();
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[3].start();

            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[3].pause();
            }
        });








}
}