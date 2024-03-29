package com.example.mad_ppt_expense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView Shower,sumShower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Shower = (TextView) findViewById(R.id.Shower);
        sumShower = (TextView) findViewById(R.id.sumShower) ;
        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        String sum = intent.getStringExtra("sum");
        Shower.setText(data);
        sumShower.setText(sum);
    }
    public void back(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}