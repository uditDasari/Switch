package com.example.tidu.aswitch;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DollarALLFragment1 extends Fragment {

    RecyclerView recyclerView;
    ArrayList<POJO2> arrayList;
   DollarAllRecyclerViewAdapter dollarAllRecyclerViewAdapter;
    public DollarALLFragment1() {
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
            arrayList.add(new POJO2(R.drawable.grubhubblack, "10", "$157.60", "57"));
            arrayList.add(new POJO2(R.drawable.luftblack, "5", "$60.83", "22"));
            arrayList.add(new POJO2(R.drawable.uberblack, "5", "$52.53", "19"));
        dollarAllRecyclerViewAdapter.notifyDataSetChanged();

    }

}
