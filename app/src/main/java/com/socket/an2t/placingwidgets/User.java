package com.socket.an2t.placingwidgets;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    public String username;
    public String password;


    // constructor is a special method
    // 1. Name of Constructor method is same as that of class name
    // 2. It dont have  return type

    // Intent intent = new Intent(MainActivity.this, HomeActivity.class)
    // class Intent extends <T>{

     //   public Intent(Context c, <? extends Activity> T) {


    // }

    // }
    // User user = new User(username, password);
    //

    public User(String username, String password){
        this.username = username;
        this.password = password;

    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.username);
        dest.writeString(this.password);
    }

    protected User(Parcel in) {
        this.username = in.readString();
        this.password = in.readString();
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
