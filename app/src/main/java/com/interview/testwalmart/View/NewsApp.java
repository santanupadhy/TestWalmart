package com.interview.testwalmart.View;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.interview.testwalmart.R;
import com.interview.testwalmart.ViewModel.NewsViewModel;

public class NewsApp extends AppCompatActivity {

    RecyclerView recyclerView;
    NewsViewModel newsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_app);

        recyclerView = findViewById(R.id.rc_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(NewsApp.this));
       // newsViewModel = ViewModelProviders.of(NewsApp.this).get(NewsViewModel.class);

        newsViewModel.getNewsList();

    }
}