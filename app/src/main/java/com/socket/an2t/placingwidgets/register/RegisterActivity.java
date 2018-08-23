package com.socket.an2t.placingwidgets.register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.socket.an2t.placingwidgets.home.HomeActivity;
import com.socket.an2t.placingwidgets.R;
import com.socket.an2t.placingwidgets.models.User;


public class RegisterActivity extends AppCompatActivity {


    private EditText inUsername,inPassword,fName,lName;
    private Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        linkAllXMLIds();
        setListeners();


    }


    private void linkAllXMLIds(){
        inUsername = findViewById(R.id.in_username);
        inPassword = findViewById(R.id.in_password);
        fName = findViewById(R.id.in_f_name);
        lName = findViewById(R.id.in_l_name);
        btnReg = findViewById(R.id.btn_reg);
    }

    private void setListeners(){
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = inUsername.getText().toString();
                String pass = inPassword.getText().toString();
                String f_Name = fName.getText().toString();
                String l_Name = lName.getText().toString();


                if (!userName.isEmpty() &&
                    !pass.isEmpty() &&
                    !f_Name.isEmpty() &&
                    !l_Name.isEmpty()){

                    User user = new User(userName,pass,f_Name,l_Name);
                    Intent intent = new Intent(RegisterActivity.this, HomeActivity.class);
                    intent.putExtra("user_key_reg", user);
                    startActivity(intent);

                }else {
                    Toast.makeText(RegisterActivity.this, "Enter all the Fields %^$$&%&^(*", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
































}
