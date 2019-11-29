package com.example.tidu.aswitch;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DollarALLFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<POJO2> arrayList;
   DollarAllRecyclerViewAdapter dollarAllRecyclerViewAdapter;
    public DollarALLFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dollar_all, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        arrayList=new ArrayList<POJO2>();
        recyclerView=view.findViewById(R.id.dollarrecyclerview);
        dollarAllRecyclerViewAdapter=new DollarAllRecyclerViewAdapter(getContext(),arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(dollarAllRecyclerViewAdapter);
        arrayList.add(new POJO2(R.drawable.grubhubblack,"6","$19.00","55.56"));
        arrayList.add(new POJO2(R.drawable.luftblack,"6","$19.00","55.56"));
        arrayList.add(new POJO2(R.drawable.uberblack,"6","$19.00","55.56"));
        arrayList.add(new POJO2(R.drawable.taskrabbitblack,"6","$19.00","55.56"));
        dollarAllRecyclerViewAdapter.notifyDataSetChanged();

    }

}
