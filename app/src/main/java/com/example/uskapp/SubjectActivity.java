package com.example.uskapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SubjectActivity extends AppCompatActivity {


    RecyclerView recycler;
    Adapter adapter;
    ArrayList<String> subjectTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        //connect bottons with their ids
        recycler = findViewById(R.id.recylerview);

        subjectTitle = new ArrayList<String>();
        subjectTitle.add("a");
        subjectTitle.add("b");
        subjectTitle.add("c");
        subjectTitle.add("d");
        subjectTitle.add("e");
        //creating recylcerview adapter
        Adapter adapter = new Adapter(this, subjectTitle);

        //setting the adapter
        recycler.setAdapter(adapter);

        //setting the layout manager for the recyclerview
        recycler.setLayoutManager(new GridLayoutManager(this,3));

    }
}