package com.example.loginapp.UI_1;

import android.os.Bundle;
import android.widget.TextView;

import com.example.loginapp.MainActivity;
import com.example.loginapp.R;

public class About_Us extends MainActivity {

    TextView tv_About_Us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);

        tv_About_Us = (TextView) findViewById(R.id.tv_Privacy_Policy);
        tv_About_Us.setText("ssstockalerts.in is a service founded by Sudhasoftsolutions with one purpose: to notify you about stock price movement in the Indian stock market. This site provides stock alerts on the Indian stock market for NSE exchange." +
                "\n" +
                "\n" +
                "This site provides the users to do self research by providing all tools which are required for trading analysis.");

    }
}
