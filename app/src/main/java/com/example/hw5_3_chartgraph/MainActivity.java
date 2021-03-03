package com.example.hw5_3_chartgraph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView pie = (TextView)findViewById(R.id.PieGraph);
        pie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, PiechartActivity.class);
                startActivity(it);
            }
        });
        TextView line = (TextView)findViewById(R.id.LineGraph);
        line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, LinearaphActivity.class);
                startActivity(it);
            }
        });
        TextView bar = (TextView)findViewById(R.id.BarGraph);
        bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, BarGraph.class);
                it.putExtra("it_tag","3");
                startActivity(it);
            }
        });
    }
}