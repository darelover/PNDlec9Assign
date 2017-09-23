package com.example.atulsachdeva.pndlec9assign;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;


public class MainActivity extends AppCompatActivity {

    RecyclerView rvFaces;
    FrameLayout flFragConatiner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFaces = (RecyclerView) findViewById(R.id.rvFaces);
        flFragConatiner = (FrameLayout) findViewById(R.id.flFragContainer);

        FragmentManager fragmentManager = getSupportFragmentManager();

        rvFaces.setLayoutManager(new LinearLayoutManager(this));
        UsersAdapter usersAdapter = new UsersAdapter(User.generateList(), this, fragmentManager);
        rvFaces.setAdapter(usersAdapter);

    }

}
