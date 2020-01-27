package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class History_Activity extends AppCompatActivity {

    public static ArrayList<Double> list_result = new ArrayList<Double>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        TextView txt_result =  (TextView) findViewById(R.id.txt_history);

        String history =  list_result.toString();

        txt_result.setText(history);


    }
}
