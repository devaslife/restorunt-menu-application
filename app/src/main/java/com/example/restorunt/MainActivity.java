package com.example.restorunt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.SurfaceControl;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {
    private RecyclerView recyclerView;
    RecyclerAdapter adapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.list_item_imageView);

        // i need to make full screen in my application
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // if you need to make Shared Element animation image to intent recyclerView use it
        //         <item name="android:windowContentTransitions">true</item>
        // and you need to add ( android:transitionName="image_transitions" ) in the image xml

        recyclerView = findViewById(R.id.rc);
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        adapter = new RecyclerAdapter(DataSource.getItems());
        adapter.setOnItemClickListener(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void OnItemClick(View view, ListItem listItem, int position) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.
                makeSceneTransitionAnimation(MainActivity.this,view,"image_transitions");
        intent.putExtra("obj", listItem);
        startActivity(intent,optionsCompat.toBundle());

    }
}