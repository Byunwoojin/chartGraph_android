package com.example.hw5_3_chartgraph;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

public class PiechartActivity extends AppCompatActivity {
    PieChart pieChart;
    int[] colorArray = new int[]{Color.rgb(227,222,153),Color.rgb(227,177,174), Color.rgb(208,186,228), Color.rgb(140,193,152)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piechart);

        pieChart = findViewById(R.id.piechart1);
        PieDataSet pieDataSet = new PieDataSet(data1(), "파이차트");
        pieDataSet.setColors(colorArray);
        PieData pieData = new PieData(pieDataSet);
        pieChart.setUsePercentValues(true);
        pieChart.setDrawEntryLabels(true);
        pieData.setValueTextSize(15);
        pieData.setValueTextColor(Color.BLACK);
        pieChart.setCenterText("개별 과일 판매량");
        pieChart.setCenterTextSize(20);
        pieChart.setData(pieData);
        pieChart.setHoleRadius(30);

        pieChart.invalidate();

    }

    protected ArrayList<PieEntry> data1() {
        ArrayList<PieEntry> datavalue = new ArrayList<>();
        datavalue.add(new PieEntry(45, "사과"));
        datavalue.add(new PieEntry(27, "체리"));
        datavalue.add(new PieEntry(16, "딸기"));
        datavalue.add(new PieEntry(7, "자두"));
        return datavalue;
    }
}