package com.example.navdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MViewHolder> {

    Context context;
    List<Items> itemsArraylist;

    public recyclerAdapter(Context context, List<Items> items) {
        this.context = context;
        this.itemsArraylist = items;
    }

    @NonNull
    @Override
    public MViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.row, parent, false);

        return new recyclerAdapter.MViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MViewHolder holder, int position) {

        Items items = itemsArraylist.get(position);
        holder.name.setText(items.name);
        holder.image.setImageResource(items.images);

    }

    @Override
    public int getItemCount() {
        return itemsArraylist.size();
    }

    public static class MViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name;

        public MViewHolder(@NonNull View itemView){
            super(itemView);

            image = itemView.findViewById(R.id.profile);
            name = itemView.findViewById(R.id.tvName);
        }

    }


}
