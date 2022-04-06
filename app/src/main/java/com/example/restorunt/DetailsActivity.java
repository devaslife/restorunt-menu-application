package com.example.restorunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {
    private TextView text;
    private ListItem listItem;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        text = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageViewDetails);

        // i need to make full screen in my application
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        listItem = (ListItem) getIntent().getSerializableExtra("obj");
        text.setText(listItem.getTitle());
        Glide.with(this).load(listItem.getImage()).centerCrop().placeholder(R.drawable.dish).into(imageView);
    }
}