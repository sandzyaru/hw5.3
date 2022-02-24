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

public class CountryFragment extends Fragment implements OnClickListener{
    private RecyclerView recyclerView;
    private ArrayList<ImageView> imageViews;
    private CountryAdapter countryAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LoadData();
        countryAdapter = new CountryAdapter(imageViews, this::onClick);
        recyclerView.setAdapter(countryAdapter);

    }

    public void onClick(ImageView imageView) {
    }


    private void LoadData() {
        imageViews=new ArrayList<>();
        Bundle bundle = getArguments();
        Integer val = bundle.getInt(getString(Integer.parseInt("key")));
        //Africa
        switch (val) {
            case 1:
            imageViews.add(new ImageView(R.drawable.ic_chad));
            imageViews.add(new ImageView(R.drawable.ic_senegal));
            imageViews.add(new ImageView(R.drawable.ic_sudan));
            imageViews.add(new ImageView(R.drawable.ic_togo));
            imageViews.add(new ImageView(R.drawable.ic_tunis));
            break;
            //Asia
            case 2:
            imageViews.add(new ImageView(R.drawable.ic_india));
            imageViews.add(new ImageView(R.drawable.ic_japan));
            imageViews.add(new ImageView(R.drawable.ic_kazahstan));
            imageViews.add(new ImageView(R.drawable.ic_kyrgyzstan));
            imageViews.add(new ImageView(R.drawable.ic_south_korea));
            break;
            //Australia
            case 3:
            imageViews.add(new ImageView(R.drawable.ic_flag_australia));
            break;
            //Europe
            case 4:
            imageViews.add(new ImageView(R.drawable.ic_chehia));
            imageViews.add(new ImageView(R.drawable.ic_deutschland));
            imageViews.add(new ImageView(R.drawable.ic_ispania));
            imageViews.add(new ImageView(R.drawable.ic_italia));
            imageViews.add(new ImageView(R.drawable.ic_russia));
            break;
            //North America
            case 5:
            imageViews.add(new ImageView(R.drawable.ic_canada));
            imageViews.add(new ImageView(R.drawable.ic_mexica));
            imageViews.add(new ImageView(R.drawable.ic_usa));
            break;
            //South America
            case 6:
            imageViews.add(new ImageView(R.drawable.ic_argentina));
            imageViews.add(new ImageView(R.drawable.ic_brazil));
            imageViews.add(new ImageView(R.drawable.ic_chili));
            imageViews.add(new ImageView(R.drawable.ic_urugvay));
            imageViews.add(new ImageView(R.drawable.ic_venesuela));
            break;
        }
    }
}