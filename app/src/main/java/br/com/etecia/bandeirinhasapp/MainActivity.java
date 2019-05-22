package br.com.etecia.bandeirinhasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import model.state;

import java.lang.reflect.Array;

import model.state;

public class MainActivity extends AppCompatActivity {
    state[] State = {new state ("teste","teste","teste","teste") };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
