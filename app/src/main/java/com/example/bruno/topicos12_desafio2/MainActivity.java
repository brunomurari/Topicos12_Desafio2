package com.example.bruno.topicos12_desafio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String URL = "https://dl.dropboxusercontent.com/s/50vmlj7dhfaibpj/sociais.json";
    private ArrayList<Foo> fooList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
