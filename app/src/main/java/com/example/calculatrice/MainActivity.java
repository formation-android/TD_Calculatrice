package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculate(View maView){
        EditText txt_x =  (EditText) findViewById(R.id.editText_x);
        EditText txt_y = (EditText) findViewById(R.id.editText_y);
        EditText txt_result = (EditText) findViewById(R.id.result);
        Double x = Double.parseDouble(txt_x.getText().toString());
        Double y = Double.parseDouble(txt_y.getText().toString());

        Double result = x + y;
        txt_result.setText(result.toString());

        History_Activity.list_result.add(result);



    }
    public void History(View maView){

        Intent histroy_activity = new Intent(this, History_Activity.class);

        startActivity(histroy_activity);


    }

}
