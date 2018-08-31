package com.socket.an2t.placingwidgets.recyclerView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.socket.an2t.placingwidgets.R;
import com.socket.an2t.placingwidgets.recyclerView.adapter.CustomRVAdapter;
import com.socket.an2t.placingwidgets.recyclerView.model.Book;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {


    private RecyclerView rv_books;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        rv_books = findViewById(R.id.rv_books);

        //findViewById()

        rv_books.setHasFixedSize(true);


        ArrayList<Book> mList = new ArrayList<>();

        Book b1 = new Book("https://img.indiabookstore.net/9780006381143_small_c95833dbe.jpg", "Harry Potter");
        Book b2 = new Book("https://img.indiabookstore.net/9780671634063_small_6441c36c3.jpg", "Hunger Games");
        Book b3 = new Book("https://img.indiabookstore.net/9780007183128_small_318e47043.jpg", "Divergent");
        Book b4 = new Book("https://img.indiabookstore.net/9780800744366_small_b3eb0bcd5.jpg", "Insergent");

        Book b5 = new Book("https://img.indiabookstore.net/9780006381143_small_c95833dbe.jpg", "Harry Potter");
        Book b6 = new Book("https://img.indiabookstore.net/9780671634063_small_6441c36c3.jpg", "Hunger Games");
        Book b7 = new Book("https://img.indiabookstore.net/9780007183128_small_318e47043.jpg", "Divergent");
        Book b8 = new Book("https://img.indiabookstore.net/9780800744366_small_b3eb0bcd5.jpg", "Insergent");


//        for (int i = 1; i <= 8 ; i++) {
//            mList.add(bi);
//        }


        mList.add(b1);
        mList.add(b2);
        mList.add(b3);
        mList.add(b4);
        mList.add(b5);
        mList.add(b6);
        mList.add(b7);
        mList.add(b8);




        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv_books.setLayoutManager(lm);

        CustomRVAdapter mAdapter = new CustomRVAdapter(this,mList);
        rv_books.setAdapter(mAdapter);


    }
}
