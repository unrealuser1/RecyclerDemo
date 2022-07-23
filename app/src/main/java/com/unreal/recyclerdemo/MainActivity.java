package com.unreal.recyclerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    String s1[], s2[];
    int img[] = {R.drawable.vedas, R.drawable.upanishads, R.drawable.geeta, R.drawable.itihas, R.drawable.puranas,
            R.drawable.shastra, R.drawable.kavya};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        s1 = getResources().getStringArray(R.array.book_names);
        s2 = getResources().getStringArray(R.array.book_description);
        final MyAdapterClass adapter = new MyAdapterClass(this, s1, s2, img);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}