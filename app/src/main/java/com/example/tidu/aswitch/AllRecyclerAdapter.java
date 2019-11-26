package com.example.tidu.aswitch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AllRecyclerAdapter extends RecyclerView.Adapter<AllRecyclerAdapter.AllViewHolder> {

    Context context;
    ArrayList<POJO> arrayList;

    public AllRecyclerAdapter(Context context, ArrayList<POJO> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public AllViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_view_market,parent,false);
        return new AllViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllViewHolder holder, int position) {
        Picasso.with(context).load("R.drawable.lyfylogo").into(holder.imageView1);
        Picasso.with(context).load(arrayList.get(position).getArrrow()).into(holder.imageView2);
        holder.textView.setText(arrayList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public  class AllViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView1,imageView2;
        TextView textView;
        public AllViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1=itemView.findViewById(R.id.item_company);
            imageView2=itemView.findViewById(R.id.item_arrow);
            textView=itemView.findViewById(R.id.item_dollar);

        }
    }
}
