package com.example.hw5_3_chartgraph;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.os.Bundle;
import android.widget.ImageView;

public class LinearaphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linegraph);

        Path p = new Path();
        p.moveTo(10,90);
        p.lineTo(90,90);
        p.moveTo(10,90);
        p.lineTo(10,10);

        p.moveTo(10,90);
        p.lineTo(25,70);
        p.lineTo(40,80);
        p.lineTo(55,55);
        p.lineTo(70,50);
        p.lineTo(85,35);
        p.moveTo(85,35);

        p.moveTo(85,35);
        p.lineTo(80,36);
        p.moveTo(85,35);
        p.lineTo(85,40);
        p.moveTo(85,35);

        p.moveTo(25,89);
        p.lineTo(25,91);

        p.moveTo(40,89);
        p.lineTo(40,91);

        p.moveTo(55,89);
        p.lineTo(55,91);

        p.moveTo(70,89);
        p.lineTo(70,91);

        p.moveTo(85,89);
        p.lineTo(85,91);

        p.moveTo(25,89);
        p.lineTo(25,91);

        ShapeDrawable d = new ShapeDrawable(new PathShape(p,100,100));
        d.setIntrinsicWidth(400);
        d.setIntrinsicHeight(400);
        d.getPaint().setColor(Color.DKGRAY);
        d.getPaint().setStrokeWidth((float)0.5);

        d.getPaint().setStyle(Paint.Style.STROKE);
        setShapeByDrawable(d);
    }
    private void setShapeByDrawable(Drawable drawable){
        ImageView reusableImageView = (ImageView)findViewById(R.id.linearGraph);
        reusableImageView.setImageDrawable(drawable);
    }
}