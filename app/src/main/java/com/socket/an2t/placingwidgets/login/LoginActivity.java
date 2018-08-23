package com.socket.an2t.placingwidgets.login;

import android.app.ListActivity;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
//import android.support.design.widget.Snackbar;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.socket.an2t.placingwidgets.R;
import com.socket.an2t.placingwidgets.home.HomeActivity;
import com.socket.an2t.placingwidgets.login.callback.LoginPresenterImplementation;
import com.socket.an2t.placingwidgets.register.RegisterActivity;
import com.socket.an2t.placingwidgets.models.User;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener,LoginPresenterImplementation{

    // logt
    private static final String TAG = "LoginActivity";


    //private Button

    private Button btnLogin;
    private Button btnReg;

    private Button btn_show_list;
    private EditText inUsername;
    private EditText inPassword;
    private LoginPresenter mLoginPresenter;
    private LinearLayout llMainFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // layout R.layout.filename
        // id R.id.widgetId
        // drawable R.drawable.fileName
        // string R.string.item
        // dimens R.dimens.dimens
        // color R.color.colorName

        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        btnReg = findViewById(R.id.btn_reg);
        btn_show_list = findViewById(R.id.btn_show_list);

        inUsername = findViewById(R.id.in_username);
        inPassword = findViewById(R.id.in_password);
        llMainFrame = findViewById(R.id.ll_main_frame);



        btn_show_list.setOnClickListener(this);
        btnReg.setOnClickListener(this);
        btn_show_list.setOnClickListener(this);

  }


    private void showSnackbar(String s, int SNACK_TYPE) {
        Snackbar snackbar = Snackbar
                .make(llMainFrame, s, SNACK_TYPE);
        snackbar.show();
    }



    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btn_login:
                // we are getting the values from the user
                String username = inUsername.getText().toString();
                String password = inPassword.getText().toString();
                LoginPresenter lp = new LoginPresenter(LoginActivity.this);
                lp.checkLoginCredendials(username,password);
                break;
            case R.id.btn_reg:
                intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_show_list:
                intent = new Intent(LoginActivity.this, ListActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onLoginSuccess(String userName, String password) {
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        User user = new User(userName, password);
        intent.putExtra("user_key", user);
        startActivity(intent);
    }

    @Override
    public void onError(String message) {
        showSnackbar(message, Snackbar.LENGTH_SHORT);
    }
}
