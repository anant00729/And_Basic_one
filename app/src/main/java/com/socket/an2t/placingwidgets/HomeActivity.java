package com.socket.an2t.placingwidgets;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity {


    private TextView tvPassedData;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();



        User mUser = intent.getParcelableExtra("user_key");


        tvPassedData = findViewById(R.id.tv_passed_data);

        // we are just displaying the values that are passed from the previose activity
        tvPassedData.setText("Username : " + mUser.username + "\n Password : " + mUser.password);


    }




}
