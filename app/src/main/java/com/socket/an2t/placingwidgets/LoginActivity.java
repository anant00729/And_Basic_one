package com.socket.an2t.placingwidgets;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
//import android.support.design.widget.Snackbar;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    // logt
    private static final String TAG = "LoginActivity";


    //private Button

    private Button btnLogin;
    private EditText inUsername;
    private EditText inPassword;

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
        inUsername = findViewById(R.id.in_username);
        inPassword = findViewById(R.id.in_password);
        llMainFrame = findViewById(R.id.ll_main_frame);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = inUsername.getText().toString();
                String password = inPassword.getText().toString();

                if (!username.isEmpty() && !password.isEmpty()){
                    if (password.equals("123")){
                        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                    }else {
                        showSnackbar("Please enter correct password");
                    }
                }else {
                    showSnackbar("Please enter yout username and password");
                }
            }
        });

    }

    private void showSnackbar(String s) {
        Snackbar snackbar = Snackbar
                .make(llMainFrame, s, Snackbar.LENGTH_LONG);
        snackbar.show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: " );

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: " );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: " );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: " );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart: " );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: " );
    }

//    public static void hideKeyboard() {
//        val view = activity.currentFocus?: View(activity)
//        val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
//        imm.hideSoftInputFromWindow(view.windowToken, 0)
//    }
}
