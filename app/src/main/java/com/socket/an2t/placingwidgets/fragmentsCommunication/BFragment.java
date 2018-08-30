package com.socket.an2t.placingwidgets.fragmentsCommunication;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.socket.an2t.placingwidgets.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BFragment extends Fragment {


    public BFragment() {
        // Required empty public constructor
    }

    public static BFragment newInstance(String msg){
        BFragment fragment = new BFragment();

        Bundle b = new Bundle();
        b.putString("in_message", msg);
        fragment.setArguments(b);

        return  fragment;
    }

    private TextView tv_message;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tv_message = getView().findViewById(R.id.tv_message);

        Bundle b = this.getArguments();

        String msg = b.getString("in_message");
        tv_message.setText(msg);
    }

    public void getDataFromActivity(String message){
        if (tv_message != null) {
            tv_message.setText("The message is : " + message);
        }else {
            //Toast.makeText(getContext(), "You have not add the fragment", Toast.LENGTH_SHORT).show();
        }

    }
}
