package com.example.restorunt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private View view;
    private ArrayList<ListItem> items;
    private static OnItemClickListener onItemClickListener;

    public RecyclerAdapter(ArrayList<ListItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ListItem listItem = items.get(position);

        holder.bind(view,listItem,onItemClickListener);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
}
