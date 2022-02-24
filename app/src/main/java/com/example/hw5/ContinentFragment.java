package com.example.hw5;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ContinentFragment extends Fragment implements OnClickListener {
    private RecyclerView recyclerView;
    private ArrayList<ImageView> imageViews;
    private CommonAdapter continentAdapter;
    public final static String KEY_INTENT="key";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_continent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LoadData();
        recyclerView=view.findViewById(R.id.recycler_continent);
        continentAdapter = new CommonAdapter(imageViews, this::onClick);
        recyclerView.setAdapter(continentAdapter);
    }


    private void LoadData() {
        imageViews=new ArrayList<>();
        imageViews.add(new ImageView(R.drawable.ic_africa,1));
        imageViews.add(new ImageView(R.drawable.ic_asia,2));
        imageViews.add(new ImageView(R.drawable.ic_australia,3));
        imageViews.add(new ImageView(R.drawable.ic_europe,4));
        imageViews.add(new ImageView(R.drawable.ic_north_america,5));
        imageViews.add(new ImageView(R.drawable.ic_south_america,6));
    }
    @Override
    public void onClick(ImageView imageView) {
        Bundle bundle = new Bundle();
        bundle.putInt("key",imageView.getKeyId());
        Fragment fragment = new CountryFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.container, fragment).addToBackStack(null).commit();
    }
}