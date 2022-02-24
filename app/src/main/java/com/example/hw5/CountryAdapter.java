package com.example.hw5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {
    private ArrayList<ImageView> country;
    private OnClickListener onClickListener;

    public CountryAdapter(ArrayList<com.example.hw5.ImageView> country,OnClickListener onClickListener) {
        this.country = country;
        this.onClickListener=onClickListener;
    }



    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryAdapter.CountryViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_common, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(country.get(position));
    }

    @Override
    public int getItemCount() {
        return country.size();
    }

    static class CountryViewHolder extends RecyclerView.ViewHolder {
        private android.widget.ImageView country;
        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            country=itemView.findViewById(R.id.image);
        }

        public void bind(ImageView imageView) {
            this.country.setImageResource(imageView.getCountry());
        }
    }
}
