package com.example.restorunt;

import android.os.Parcelable;

import java.io.Serializable;

public class ListItem implements Serializable {
    private String title;
    private int itemCount;
    private String image;

    public ListItem(String title, int itemCount, String image) {
        this.title = title;
        this.itemCount = itemCount;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
