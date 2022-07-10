package com.example.loginapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.loginapp.UI_2.FragmentClients;
import com.example.loginapp.UI_2.FragmentDeals;

public class FragMain1_Deals extends AppCompatActivity {

    Button clients_btn,deals_btn;
    ConstraintLayout deals_page_frag;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deals_page);

        deals_page_frag = (ConstraintLayout) findViewById(R.id.deals_page_frag);
        deals_btn = (Button) findViewById(R.id.deals_btn);
        clients_btn = (Button) findViewById(R.id.clients_btn);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentDeals fragment1 = new FragmentDeals();
        fragmentTransaction.replace(R.id.deals_page_frag,fragment1);
        fragmentTransaction.commit();



        clients_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentClients fragment2 = new FragmentClients();
                fragmentTransaction.replace(R.id.deals_page_frag,fragment2);
                fragmentTransaction.commit();

            }
        });

        deals_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentDeals fragment1 = new FragmentDeals();
                fragmentTransaction.replace(R.id.deals_page_frag,fragment1);
                fragmentTransaction.commit();
            }
        });



    }
}
