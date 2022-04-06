package com.example.restorunt;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    private TextView title, itemsCount;
    private ImageView imageView;
    private ImageView arrowCard;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title_tv);
        itemsCount = itemView.findViewById(R.id.itemCount_tv);
        imageView = itemView.findViewById(R.id.list_item_imageView);
        arrowCard = itemView.findViewById(R.id.arrowCard);
    }

    public void bind(View view, ListItem item, OnItemClickListener onItemClickListener) {
        title.setText(item.getTitle());
        itemsCount.setText(String.valueOf(item.getItemCount()));
        Glide.with(imageView).load(item.getImage()).circleCrop().placeholder(R.drawable.dish).into(imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.OnItemClick(view,item,getAdapterPosition());
            }
        });

    }
}
