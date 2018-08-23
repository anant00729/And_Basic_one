package com.socket.an2t.placingwidgets.login;


import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.util.Log;

import com.socket.an2t.placingwidgets.home.HomeActivity;
import com.socket.an2t.placingwidgets.login.callback.LoginPresenterImplementation;
import com.socket.an2t.placingwidgets.models.User;

public class LoginPresenter  {

    private LoginPresenterImplementation mPresenter;

    public LoginPresenter(LoginPresenterImplementation mPresenter){
        this.mPresenter = mPresenter;
    }


    private static final String TAG = "LoginPresenter";

    public void checkLoginCredendials(String username, String password){

        if (!username.isEmpty() && !password.isEmpty()) {
            if (password.equals("123")) {
                this.mPresenter.onLoginSuccess(username,password);
            } else {
                mPresenter.onError("Please enter correct password");
            }
        } else {

            mPresenter.onError("Please enter yout username and password");

        }


    }



}
