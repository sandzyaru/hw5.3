package com.example.hw5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {
    private ArrayList<com.example.hw5.ImageView> continents;
    private OnClickListener onClickListener;

    public ContinentAdapter(ArrayList<com.example.hw5.ImageView> continents,OnClickListener onClickListener) {
        this.continents = continents;
        this.onClickListener=onClickListener;
    }
    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_common, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continents.get(position));
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    class ContinentViewHolder extends RecyclerView.ViewHolder{
        private ImageView continent;
        public ContinentViewHolder(@NonNull View itemView) {
            super(itemView);
            continent=itemView.findViewById(R.id.image);
        }

        public void bind(com.example.hw5.ImageView imageView) {
            continent.setImageResource(imageView.getContinent());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClickListener.onClick(continents.get(getLayoutPosition()));
                }
            });

        }
    }
}

