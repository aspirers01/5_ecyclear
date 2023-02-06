package com.example.a5recyclear;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   ArrayList<Contact_model>cnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rc = findViewById(R.id.rc1);
        rc.setLayoutManager(new LinearLayoutManager(this));
        cnt.add( new Contact_model("pankaj", "123455"));
        cnt.add( new Contact_model("a", "12"));
        cnt.add( new Contact_model("B", "1"));
        cnt.add( new Contact_model("C", "125"));
        cnt.add( new Contact_model("D", "12345"));
        cnt.add( new Contact_model("E", "1233242123455"));
        cnt.add( new Contact_model("pankaF", "1212233455"));
        cnt.add( new Contact_model("F", "12334123455"));
        cnt.add( new Contact_model("g", "1890723455"));
        cnt.add( new Contact_model("h", "0987123455"));
        cnt.add( new Contact_model("I", "657123455"));
        cnt.add( new Contact_model("J", "980123455"));
        cnt.add( new Contact_model("K", "435123455"));
        cnt.add( new Contact_model("l", "546123455"));
        cnt.add( new Contact_model("M", "345123455"));
        cnt.add( new Contact_model("M", "345123455"));
        cnt.add( new Contact_model("N", "76123455"));
        cnt.add( new Contact_model("O", "234123455"));
        cnt.add( new Contact_model("P", "34123455"));
        cnt.add( new Contact_model("pankaj", "12123455"));
        cnt.add( new Contact_model("X", "34123455"));
        cnt.add( new Contact_model("Y", "65123455"));
        cnt.add( new Contact_model("J", "18723455"));
        cnt.add( new Contact_model("panka", "8123455"));


       Recycler_contact adapter=new Recycler_contact(this,cnt);
        rc.setAdapter(adapter);



    }
}
