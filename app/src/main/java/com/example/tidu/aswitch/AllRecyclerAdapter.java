package com.example.tidu.aswitch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AllRecyclerAdapter extends RecyclerView.Adapter<AllRecyclerAdapter.AllViewHolder> {

    Context context;

    @NonNull
    @Override
    public AllViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from()
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AllViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  class AllViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView1,imageView2;
        TextView textView;
        public AllViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
