package com.example.loginapp.UI_1;

import android.os.Bundle;
import android.widget.TextView;

import com.example.loginapp.MainActivity;
import com.example.loginapp.R;

public class Disclaimer extends MainActivity {

    TextView tv_Disclaimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disclaimer);

        tv_Disclaimer = (TextView) findViewById(R.id.tv_Privacy_Policy);
        tv_Disclaimer.setText("We are not registered with SEBI under SEBI (Research Analysts) Regulations, 2014. As per the clarifications provided by SEBI: 'Any person who makes recommendation or offers an opinion concerning securities or public offers only through public media is not required to obtain registration as research analyst under RA Regulations.'" +
                "\n" +
                "\n" +
                "This website is solely for educational & academic discussions and is not a recommendation to buy or sell. All information given here is largely based on indicator analysis which is highly dynamic in nature and relevant only at a particular point of time." +
                "\n" +
                "\n" +
                "Readers are advised to consult professional financial / investment advisors before they buy/sell any stock mentioned in this website.\n" +
                "\n" +
                "Furthermore, it's safe to assume that I/relatives might or might not have any vested interest in any stocks discussed on this website." +
                "\n" +
                "\n" +
                "Your use of the Service is at your sole risk. The Service is provided on an \"AS IS\" and \"AS AVAILABLE\" basis. The Service is provided without warranties of any kind, whether express or implied, including, but not limited to, implied warranties of merchantability, fitness for a particular purpose, non-infringement or course of performance. You are responsible for any stock trades you may make! sudhasoftsolutions its subsidiaries, affiliates, and its licensors do not warrant that" +
                "\n" +
                "\n" +
                "\t" +
                "The Service will function uninterrupted, secure or available at any particular time or location;" +
                "\n" +
                "\t" +
                "Any errors or defects will be corrected;" +
                "\n" +
                "\t" +
                "The Service is free of viruses or other harmful components; or" +
                "\n" +
                "\t" +
                "The results of using the Service will meet your requirements.");

    }
}
