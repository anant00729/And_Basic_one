package com.socket.an2t.placingwidgets.models;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    public String username;
    public String password;
    public String fName;
    public String lName;


    public User(String username, String password){
        this.username = username;
        this.password = password;

    }

    public User(String u_name, String pass, String f_name , String l_name){
        this.username = u_name;
        this.password = pass;
        this.fName = f_name;
        this.lName = l_name;
    }

    public String getFulltName(String fName , String lName){
        String full_name = fName + " " + lName;
        return full_name;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.username);
        dest.writeString(this.password);
        dest.writeString(this.fName);
        dest.writeString(this.lName);
    }

    protected User(Parcel in) {
        this.username = in.readString();
        this.password = in.readString();
        this.fName = in.readString();
        this.lName = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
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


/*  class Login {
      public String u_name;
      public String pass;

      public Login(String username, String password){
           this.u_name = username;
           this.pass = password;
      }
    }

    class Register {
      public String u_name;
      public String pass;
      public String fName;
      public String lName;

      public Login(String u_name, String pass, String f_name , String l_name){
           this.u_name = username;
           this.pass = password;
           this.fName = f_name;
           this.lName = l_name;
      }
    }


    class User {
      public String u_name;
      public String pass;
      public String fName;
      public String lName;

      // First, Constructor for Login
      public User(String username , String password){
        this.u_name = username;
        this.pass = password;
      }

      // Second, Constructor for Register
        public User(String u_name, String pass, String f_name , String l_name){
           this.u_name = username;
           this.pass = password;
           this.fName = f_name;
           this.lName = l_name;
      }


      // 1. Both are constructors
      // 2. Both have the same method name
      // 3. ie. Constructor Method OverLoading


    }


*/

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

