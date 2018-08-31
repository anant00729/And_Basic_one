package com.socket.an2t.placingwidgets.recyclerView.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.socket.an2t.placingwidgets.R;
import com.socket.an2t.placingwidgets.recyclerView.model.Book;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class CustomRVAdapter extends RecyclerView.Adapter<CustomRVAdapter.CustomRVViewHolder>{


    private Context mContext;
    private List<Book> mList;
    //Context , mList
    public CustomRVAdapter(Context mContext, ArrayList<Book> mListBooks){
        this.mContext = mContext;
        this.mList = mListBooks;
    }



    @NonNull
    @Override
    public CustomRVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.mContext).inflate(R.layout.list_item,parent,false);

        CustomRVViewHolder v = new CustomRVViewHolder(view);

        return v;
    }


    // when a new cell gets created this method gets called and it takes the date from the list item and place it in the UIViews
    @Override
    public void onBindViewHolder(@NonNull CustomRVViewHolder holder, int position) {


        // here your data meets cell views

        // 1. holder.tv_title -> cell views
        // 1. holder.img -> cell views

        // 2. b.bookTitle
        // 2. b.img

        Book b = this.mList.get(position);

        holder.tv_title.setText(b.bookTitle);
        Picasso.with(this.mContext)
                .load(b.bookImage)
                .into(holder.img);

    }



    //
    @Override
    public int getItemCount() {
        return this.mList.size();
    }

    class CustomRVViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView tv_title;

        public CustomRVViewHolder(View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.tv_title);
            img = itemView.findViewById(R.id.img);

        }
    }
}
