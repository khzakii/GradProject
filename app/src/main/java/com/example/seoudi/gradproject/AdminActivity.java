package com.example.seoudi.gradproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class AdminActivity extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<String> names,posts,photos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        rv= (RecyclerView) findViewById(R.id.rv_doctor_admin);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(llm);
        names = new ArrayList<String>();
        photos = new ArrayList<String>();
        posts = new ArrayList<String>();
        for(int i =0 ; i<5;i++){
            names.add("khaled");
            posts.add("kan hena");
            photos.add("7amada");
        }
       AdminRVAdapter adapter = new AdminRVAdapter(names, posts, photos);
        rv.setAdapter(adapter);
    }
}
