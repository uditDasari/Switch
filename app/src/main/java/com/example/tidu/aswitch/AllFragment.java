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
public class AllFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<POJO> arrayList;
    AllRecyclerAdapter allRecyclerAdapter;

    public AllFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        arrayList=new ArrayList<POJO>();
        recyclerView=view.findViewById(R.id.allrecycler);
        allRecyclerAdapter=new AllRecyclerAdapter(getContext(),arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(allRecyclerAdapter);
        arrayList.add(new POJO(R.drawable.grubhubblack,R.drawable.path,"22.00"));
        arrayList.add(new POJO(R.drawable.luftblack,R.drawable.pathgreen,"20.00"));
        arrayList.add(new POJO(R.drawable.uberblack,R.drawable.path,"10.00"));
        arrayList.add(new POJO(R.drawable.taskrabbitblack,R.drawable.pathgreen,"19.00"));
        arrayList.add(new POJO(R.drawable.uberblack,R.drawable.path,"10.00"));
        arrayList.add(new POJO(R.drawable.taskrabbitblack,R.drawable.pathgreen,"19.00"));
        arrayList.add(new POJO(R.drawable.grubhubblack,R.drawable.path,"22.00"));
        arrayList.add(new POJO(R.drawable.luftblack,R.drawable.pathgreen,"20.00"));
        allRecyclerAdapter.notifyDataSetChanged();

    }
}
