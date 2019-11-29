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

public class DollarAllRecyclerViewAdapter extends RecyclerView.Adapter<DollarAllRecyclerViewAdapter.dALLViewHolder> {

    Context context;
    ArrayList<POJO2> arrayList;

    public DollarAllRecyclerViewAdapter(Context context, ArrayList<POJO2> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public dALLViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.card2,parent,false);
        return new dALLViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dALLViewHolder holder, int position) {
        Picasso.with(context).load(arrayList.get(position).getImage()).into(holder.imageView);
        holder.days.setText(arrayList.get(position).getJobs());
        holder.dollar.setText(arrayList.get(position).getDollar());
        holder.percent.setText(arrayList.get(position).getPercent());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class dALLViewHolder extends RecyclerView.ViewHolder
        {
            ImageView imageView;
            TextView days,dollar,percent;

            public dALLViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView=itemView.findViewById(R.id.imageView17);
                days=itemView.findViewById(R.id.textView7);
                dollar=itemView.findViewById(R.id.textView9);
                percent=itemView.findViewById(R.id.textview100);
            }
        }
}
