package com.example.loginapp.UI_1;

import android.os.Bundle;
import android.widget.TextView;

import com.example.loginapp.MainActivity;
import com.example.loginapp.R;

public class Privacy_Policy extends MainActivity {

    TextView tv_Privacy_Policy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.privacy_policy);

        tv_Privacy_Policy = (TextView) findViewById(R.id.tv_Privacy_Policy);
        tv_Privacy_Policy.setText("What information do we collect?\n" +
                "We collect information from you when you register on our site or fill out a form. Any data we request that is not required will be specified as voluntary or optional. When registering on our site, as appropriate, you may be asked to enter your: name, e-mail address. You may, however, visit our site anonymously.\n" +
                "\n" +
                "What do we use your information for?\n" +
                "Any of the information we collect from you may be used in one of the following ways: To personalize your experience (your information helps us to better respond to your individual needs) To improve our website (we continually strive to improve our service based on the information and feedback we receive from you) To improve customer service (your information helps us to more effectively respond to your customer service and support needs)\n" +
                "\n" +
                "Do we use cookies?\n" +
                "Yes. Cookies are small files that a site or its service provider transfers to your computers hard drive through your Web browser (if you allow) that enables the sites or service providers systems to recognize your browser and capture and remember certain information.\n" +
                "\n" +
                "Do we disclose any information to outside parties?\n" +
                "We do not sell, trade, or otherwise transfer your personal information except in accordance with this policy. This does not include trusted third parties who assist us in operating our website, conducting our business, or servicing you, so long as those parties agree to keep this information confidential. We may also release your information when we believe release is appropriate to comply with the law, enforce our site policies, or protect ours or others’ rights, property, or safety. However, non-personally identifiable visitor information may be provided to other parties for marketing, advertising, or other uses.");
    }
}
