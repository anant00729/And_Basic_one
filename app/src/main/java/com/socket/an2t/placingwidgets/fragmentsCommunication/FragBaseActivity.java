package com.socket.an2t.placingwidgets.fragmentsCommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.socket.an2t.placingwidgets.R;

public class FragBaseActivity extends AppCompatActivity {


    private FrameLayout container;

    private AFragment mAF;
    private BFragment mBF;

    private EditText in_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_base);

        container = findViewById(R.id.container);
        in_msg = findViewById(R.id.in_msg);


        mAF = new AFragment();

        String message  = "Hello All to fragment B";
        mBF = BFragment.newInstance(message);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container_one, mBF)
                .commit();

    }

    public void onAddBtnClicked(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, mAF)
                .commit();
    }

    public void onRemoveBtnClicked(View view) {


        getSupportFragmentManager()
                .beginTransaction()
                .remove(mAF)
                .commit();

    }

    public void onSubmitClicked(View view) {

//        String numbr = "1";
//        // converting string to int
//        int i = Integer.parseInt(numbr);
//        Integer i1 = Integer.parseInt(numbr);


        String message  = in_msg.getText().toString();

        if(!message.isEmpty()){
            mAF.getDataFromActivity(message);
            //Toast.makeText(this, "the message is " + message, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Please type something ^%$^%&^*^(*&(" , Toast.LENGTH_SHORT).show();
        }





    }

    public void onSubmitClicked_ForB(View view) {
        String message  = in_msg.getText().toString();

        if(!message.isEmpty()){
            mBF.getDataFromActivity(message);
            //Toast.makeText(this, "the message is " + message, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Please type something ^%$^%&^*^(*&(" , Toast.LENGTH_SHORT).show();
        }
    }
}
