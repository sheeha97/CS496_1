package com.example.q.cs496_1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    public class  MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewName;
        public TextView mTextViewPhone;
        public TextView mTextViewHome;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextViewName = itemView.findViewById(R.id.text_view_name);
            mTextViewHome = itemView.findViewById(R.id.text_view_number);

        }
    }
}
