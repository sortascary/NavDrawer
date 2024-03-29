package com.example.navdrawer.fragments;
// HomeFragment.java
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navdrawer.Items;
import com.example.navdrawer.R;
import com.example.navdrawer.recyclerAdapter;

import java.util.ArrayList;

public class FavFoodFragment extends Fragment {

    private ArrayList<Items> itemArraylist;
    private RecyclerView recyclerview;
    recyclerAdapter adapter;

    public FavFoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favfood, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataInitialized();
        recyclerview = view.findViewById(R.id.Rvlist2);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview.setHasFixedSize(true);
        adapter = new recyclerAdapter(getContext(),itemArraylist);
        recyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void dataInitialized() {

        itemArraylist = new ArrayList<>();

        Items triangle = new Items("Triangle", R.mipmap.ic_launcher_round);
        itemArraylist.add(triangle);
    }
}