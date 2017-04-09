package com.example.seoudi.gradproject;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

public class MyDoctorsActivity extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<String> names,specialities,photos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_doctors);
        getSupportActionBar().setTitle("My Doctors");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        rv= (RecyclerView) findViewById(R.id.rv_doctors);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(llm);
        names = new ArrayList<String>();
        photos = new ArrayList<String>();
        specialities = new ArrayList<String>();
        for(int i =0 ; i<5;i++){
            names.add("khaled");
            specialities.add("bateny");
            photos.add("7amada");
        }
        RVAdapter adapter = new RVAdapter(names, specialities, photos);
        rv.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        this.finish();
        return super.onOptionsItemSelected(item);




    }
}
