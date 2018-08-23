package com.socket.an2t.placingwidgets.login.callback;

public interface LoginPresenterImplementation {
     void onLoginSuccess(String userName, String password);
     void onError(String message);

}
