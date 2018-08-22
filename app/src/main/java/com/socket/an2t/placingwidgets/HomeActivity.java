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



        /*

            //1 . Login
            //2 . Register

            1.1 username, password
            2.1 username, password, fName , lName

        */
        User user_login = intent.getParcelableExtra("user_key");
        User user_reg = intent.getParcelableExtra("user_key_reg");


        tvPassedData = findViewById(R.id.tv_passed_data);

        // we are just displaying the values that are passed from the previose activity
        if(user_login != null){
            //1.1 username, password
            tvPassedData.setText("Username : " + user_login.username + "\n Password : " + user_login.password);
        }else if(user_reg != null){
            //2.1 username, password, fName , lName
            tvPassedData.setText("Username : " + user_reg.username + "\n Password : " + user_reg.password +
                    "\nFName : " + user_reg.fName+ "\n LName : " + user_reg.lName
                );
        }



    }




}
