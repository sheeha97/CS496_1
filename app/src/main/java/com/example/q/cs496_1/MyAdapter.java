package com.example.q.cs496_1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context mContext;
    private ArrayList<Item> mList;
    //Item item1 = new Item("Sha", "010111111", "031111111");

    public MyAdapter(Context context, ArrayList<Item> myList) {
        mContext = context;
        mList = myList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.number_item, viewGroup, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        //mList.add(item1);
        Item currentItem = mList.get(position);

        String name = currentItem.getName();
        String home = currentItem.getHome();
        String phone = currentItem.getPhone();

        myViewHolder.mTextViewName.setText("Name: " + name);
        myViewHolder.mTextViewHome.setText("Home: " + home);
        myViewHolder.mTextViewPhone.setText("Phone: " + phone);
    }

    @Override
    public int getItemCount() {
        return mList.size();

    }

    public class  MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewName;
        public TextView mTextViewPhone;
        public TextView mTextViewHome;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextViewName = itemView.findViewById(R.id.text_view_name);
            mTextViewPhone = itemView.findViewById(R.id.text_view_phone_number);
            mTextViewHome = itemView.findViewById(R.id.text_view_home_number);
            //mList.add(item1);
        }
    }
}
