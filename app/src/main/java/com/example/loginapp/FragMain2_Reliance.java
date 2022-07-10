package com.example.loginapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.loginapp.UI_2.FragmentClients;
import com.example.loginapp.UI_2.FragmentDeals;
import com.example.loginapp.UI_3_Reliance.FragmentOverview1;
import com.example.loginapp.UI_3_Reliance.FragmentPatterns2;
import com.example.loginapp.UI_3_Reliance.FragmentReliance3;
import com.example.loginapp.UI_3_Reliance.FragmentReliance4;
import com.example.loginapp.UI_3_Reliance.FragmentReliance5;
import com.example.loginapp.UI_3_Reliance.FragmentReliance6;
import com.example.loginapp.UI_3_Reliance.FragmentReliance7;
import com.example.loginapp.UI_3_Reliance.FragmentReliance8;
import com.example.loginapp.UI_3_Reliance.FragmentReliance9;
import com.example.loginapp.UI_3_Reliance.FragmentReliance_10;
import com.example.loginapp.UI_3_Reliance.FragmentResults;

public class FragMain2_Reliance extends AppCompatActivity {

    ConstraintLayout reliance_constraint_Fragment;
    TextView textView115,textView116,textView117,textView118,textView119,Fundamentals,Options,Futures,Performance,Deals;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reliance_main_frag);

        reliance_constraint_Fragment = (ConstraintLayout) findViewById(R.id.reliance_constraint_Fragment);
        textView115 = (TextView) findViewById(R.id.textView115);
        textView116 = (TextView) findViewById(R.id.textView116);
        textView117 = (TextView) findViewById(R.id.textView117);
        textView118 = (TextView) findViewById(R.id.textView118);
        textView119 = (TextView) findViewById(R.id.textView119);



        Fundamentals = (TextView) findViewById(R.id.Fundamentals);
        Options = (TextView) findViewById(R.id.Options);
        Futures = (TextView) findViewById(R.id.Futures);
        Performance = (TextView) findViewById(R.id.Performance);
        Deals = (TextView) findViewById(R.id.Deals);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentResults fragment1 = new FragmentResults();
        fragmentTransaction.replace(R.id.reliance_constraint_Fragment,fragment1);
        fragmentTransaction.commit();

        textView115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView115.setBackgroundResource(R.color.dark_blue);
                textView115.setTextColor(Color.WHITE);

                textView116.setBackgroundResource(R.color.white);
                textView116.setTextColor(Color.BLACK);
                textView117.setBackgroundResource(R.color.white);
                textView117.setTextColor(Color.BLACK);
                textView118.setBackgroundResource(R.color.white);
                textView118.setTextColor(Color.BLACK);
                textView119.setBackgroundResource(R.color.white);
                textView119.setTextColor(Color.BLACK);
                Fundamentals.setBackgroundResource(R.color.white);
                Fundamentals.setTextColor(Color.BLACK);
                Options.setBackgroundResource(R.color.white);
                Options.setTextColor(Color.BLACK);
                Futures.setBackgroundResource(R.color.white);
                Futures.setTextColor(Color.BLACK);
                Performance.setBackgroundResource(R.color.white);
                Performance.setTextColor(Color.BLACK);
                Deals.setBackgroundResource(R.color.white);
                Deals.setTextColor(Color.BLACK);

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentOverview1 fragment1 = new FragmentOverview1();
                fragmentTransaction.replace(R.id.reliance_constraint_Fragment,fragment1);
                fragmentTransaction.commit();
            }
        });

        textView116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView116.setBackgroundResource(R.color.dark_blue);
                textView116.setTextColor(Color.WHITE);

                textView115.setBackgroundResource(R.color.white);
                textView115.setTextColor(Color.BLACK);
                textView117.setBackgroundResource(R.color.white);
                textView117.setTextColor(Color.BLACK);
                textView118.setBackgroundResource(R.color.white);
                textView118.setTextColor(Color.BLACK);
                textView119.setBackgroundResource(R.color.white);
                textView119.setTextColor(Color.BLACK);
                Fundamentals.setBackgroundResource(R.color.white);
                Fundamentals.setTextColor(Color.BLACK);
                Options.setBackgroundResource(R.color.white);
                Options.setTextColor(Color.BLACK);
                Futures.setBackgroundResource(R.color.white);
                Futures.setTextColor(Color.BLACK);
                Performance.setBackgroundResource(R.color.white);
                Performance.setTextColor(Color.BLACK);
                Deals.setBackgroundResource(R.color.white);
                Deals.setTextColor(Color.BLACK);


                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentPatterns2 fragment1 = new FragmentPatterns2();
                fragmentTransaction.replace(R.id.reliance_constraint_Fragment,fragment1);
                fragmentTransaction.commit();
            }
        });



        textView117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView117.setBackgroundResource(R.color.dark_blue);
                textView117.setTextColor(Color.WHITE);

                textView115.setBackgroundResource(R.color.white);
                textView115.setTextColor(Color.BLACK);
                textView116.setBackgroundResource(R.color.white);
                textView116.setTextColor(Color.BLACK);
                textView118.setBackgroundResource(R.color.white);
                textView118.setTextColor(Color.BLACK);
                textView119.setBackgroundResource(R.color.white);
                textView119.setTextColor(Color.BLACK);
                Fundamentals.setBackgroundResource(R.color.white);
                Fundamentals.setTextColor(Color.BLACK);
                Options.setBackgroundResource(R.color.white);
                Options.setTextColor(Color.BLACK);
                Futures.setBackgroundResource(R.color.white);
                Futures.setTextColor(Color.BLACK);
                Performance.setBackgroundResource(R.color.white);
                Performance.setTextColor(Color.BLACK);
                Deals.setBackgroundResource(R.color.white);
                Deals.setTextColor(Color.BLACK);


                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentReliance3 fragment1 = new FragmentReliance3();
                fragmentTransaction.replace(R.id.reliance_constraint_Fragment,fragment1);
                fragmentTransaction.commit();
            }
        });


        textView118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView118.setBackgroundResource(R.color.dark_blue);
                textView118.setTextColor(Color.WHITE);

                textView115.setBackgroundResource(R.color.white);
                textView115.setTextColor(Color.BLACK);
                textView117.setBackgroundResource(R.color.white);
                textView117.setTextColor(Color.BLACK);
                textView116.setBackgroundResource(R.color.white);
                textView116.setTextColor(Color.BLACK);
                textView119.setBackgroundResource(R.color.white);
                textView119.setTextColor(Color.BLACK);
                Fundamentals.setBackgroundResource(R.color.white);
                Fundamentals.setTextColor(Color.BLACK);
                Options.setBackgroundResource(R.color.white);
                Options.setTextColor(Color.BLACK);
                Futures.setBackgroundResource(R.color.white);
                Futures.setTextColor(Color.BLACK);
                Performance.setBackgroundResource(R.color.white);
                Performance.setTextColor(Color.BLACK);
                Deals.setBackgroundResource(R.color.white);
                Deals.setTextColor(Color.BLACK);


                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentReliance4 fragment1 = new FragmentReliance4();
                fragmentTransaction.replace(R.id.reliance_constraint_Fragment,fragment1);
                fragmentTransaction.commit();
            }
        });


        textView119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView119.setBackgroundResource(R.color.dark_blue);
                textView119.setTextColor(Color.WHITE);

                textView115.setBackgroundResource(R.color.white);
                textView115.setTextColor(Color.BLACK);
                textView117.setBackgroundResource(R.color.white);
                textView117.setTextColor(Color.BLACK);
                textView118.setBackgroundResource(R.color.white);
                textView118.setTextColor(Color.BLACK);
                textView116.setBackgroundResource(R.color.white);
                textView116.setTextColor(Color.BLACK);
                Fundamentals.setBackgroundResource(R.color.white);
                Fundamentals.setTextColor(Color.BLACK);
                Options.setBackgroundResource(R.color.white);
                Options.setTextColor(Color.BLACK);
                Futures.setBackgroundResource(R.color.white);
                Futures.setTextColor(Color.BLACK);
                Performance.setBackgroundResource(R.color.white);
                Performance.setTextColor(Color.BLACK);
                Deals.setBackgroundResource(R.color.white);
                Deals.setTextColor(Color.BLACK);


                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentReliance5 fragment1 = new FragmentReliance5();
                fragmentTransaction.replace(R.id.reliance_constraint_Fragment,fragment1);
                fragmentTransaction.commit();
            }
        });




        Fundamentals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fundamentals.setBackgroundResource(R.color.dark_blue);
                Fundamentals.setTextColor(Color.WHITE);

                textView115.setBackgroundResource(R.color.white);
                textView115.setTextColor(Color.BLACK);
                textView117.setBackgroundResource(R.color.white);
                textView117.setTextColor(Color.BLACK);
                textView118.setBackgroundResource(R.color.white);
                textView118.setTextColor(Color.BLACK);
                textView116.setBackgroundResource(R.color.white);
                textView116.setTextColor(Color.BLACK);
                textView119.setBackgroundResource(R.color.white);
                textView119.setTextColor(Color.BLACK);
                Options.setBackgroundResource(R.color.white);
                Options.setTextColor(Color.BLACK);
                Futures.setBackgroundResource(R.color.white);
                Futures.setTextColor(Color.BLACK);
                Performance.setBackgroundResource(R.color.white);
                Performance.setTextColor(Color.BLACK);
                Deals.setBackgroundResource(R.color.white);
                Deals.setTextColor(Color.BLACK);


                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentReliance6 fragment1 = new FragmentReliance6();
                fragmentTransaction.replace(R.id.reliance_constraint_Fragment,fragment1);
                fragmentTransaction.commit();
            }
        });


        Options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Options.setBackgroundResource(R.color.dark_blue);
                Options.setTextColor(Color.WHITE);

                textView115.setBackgroundResource(R.color.white);
                textView115.setTextColor(Color.BLACK);
                textView117.setBackgroundResource(R.color.white);
                textView117.setTextColor(Color.BLACK);
                textView118.setBackgroundResource(R.color.white);
                textView118.setTextColor(Color.BLACK);
                textView116.setBackgroundResource(R.color.white);
                textView116.setTextColor(Color.BLACK);
                textView119.setBackgroundResource(R.color.white);
                textView119.setTextColor(Color.BLACK);
                Fundamentals.setBackgroundResource(R.color.white);
                Fundamentals.setTextColor(Color.BLACK);
                Futures.setBackgroundResource(R.color.white);
                Futures.setTextColor(Color.BLACK);
                Performance.setBackgroundResource(R.color.white);
                Performance.setTextColor(Color.BLACK);
                Deals.setBackgroundResource(R.color.white);
                Deals.setTextColor(Color.BLACK);


                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentReliance7 fragment1 = new FragmentReliance7();
                fragmentTransaction.replace(R.id.reliance_constraint_Fragment,fragment1);
                fragmentTransaction.commit();
            }
        });


        Futures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Futures.setBackgroundResource(R.color.dark_blue);
                Futures.setTextColor(Color.WHITE);

                textView115.setBackgroundResource(R.color.white);
                textView115.setTextColor(Color.BLACK);
                textView117.setBackgroundResource(R.color.white);
                textView117.setTextColor(Color.BLACK);
                textView118.setBackgroundResource(R.color.white);
                textView118.setTextColor(Color.BLACK);
                textView116.setBackgroundResource(R.color.white);
                textView116.setTextColor(Color.BLACK);
                textView119.setBackgroundResource(R.color.white);
                textView119.setTextColor(Color.BLACK);
                Fundamentals.setBackgroundResource(R.color.white);
                Fundamentals.setTextColor(Color.BLACK);
                Options.setBackgroundResource(R.color.white);
                Options.setTextColor(Color.BLACK);
                Performance.setBackgroundResource(R.color.white);
                Performance.setTextColor(Color.BLACK);
                Deals.setBackgroundResource(R.color.white);
                Deals.setTextColor(Color.BLACK);


                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentReliance8 fragment1 = new FragmentReliance8();
                fragmentTransaction.replace(R.id.reliance_constraint_Fragment,fragment1);
                fragmentTransaction.commit();
            }
        });


        Performance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Performance.setBackgroundResource(R.color.dark_blue);
                Performance.setTextColor(Color.WHITE);

                textView115.setBackgroundResource(R.color.white);
                textView115.setTextColor(Color.BLACK);
                textView117.setBackgroundResource(R.color.white);
                textView117.setTextColor(Color.BLACK);
                textView118.setBackgroundResource(R.color.white);
                textView118.setTextColor(Color.BLACK);
                textView116.setBackgroundResource(R.color.white);
                textView116.setTextColor(Color.BLACK);
                textView119.setBackgroundResource(R.color.white);
                textView119.setTextColor(Color.BLACK);
                Fundamentals.setBackgroundResource(R.color.white);
                Fundamentals.setTextColor(Color.BLACK);
                Options.setBackgroundResource(R.color.white);
                Options.setTextColor(Color.BLACK);
                Futures.setBackgroundResource(R.color.white);
                Futures.setTextColor(Color.BLACK);
                Deals.setBackgroundResource(R.color.white);
                Deals.setTextColor(Color.BLACK);


                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentReliance9 fragment1 = new FragmentReliance9();
                fragmentTransaction.replace(R.id.reliance_constraint_Fragment,fragment1);
                fragmentTransaction.commit();
            }
        });


        Deals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Deals.setBackgroundResource(R.color.dark_blue);
                Deals.setTextColor(Color.WHITE);

                textView115.setBackgroundResource(R.color.white);
                textView115.setTextColor(Color.BLACK);
                textView117.setBackgroundResource(R.color.white);
                textView117.setTextColor(Color.BLACK);
                textView118.setBackgroundResource(R.color.white);
                textView118.setTextColor(Color.BLACK);
                textView116.setBackgroundResource(R.color.white);
                textView116.setTextColor(Color.BLACK);
                textView119.setBackgroundResource(R.color.white);
                textView119.setTextColor(Color.BLACK);
                Fundamentals.setBackgroundResource(R.color.white);
                Fundamentals.setTextColor(Color.BLACK);
                Options.setBackgroundResource(R.color.white);
                Options.setTextColor(Color.BLACK);
                Futures.setBackgroundResource(R.color.white);
                Futures.setTextColor(Color.BLACK);
                Performance.setBackgroundResource(R.color.white);
                Performance.setTextColor(Color.BLACK);


                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentReliance_10 fragment1 = new FragmentReliance_10();
                fragmentTransaction.replace(R.id.reliance_constraint_Fragment,fragment1);
                fragmentTransaction.commit();
            }
        });

    }
}
