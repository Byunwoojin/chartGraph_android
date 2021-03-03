package com.example.hw5_3_chartgraph;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.graphics.drawable.shapes.RectShape;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class BarGraph extends AppCompatActivity {
    ImageView line1, line2, barGraph1, barGraph2, barGraph3, barGraph4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_graph);

        line1 = (ImageView)findViewById(R.id.line1);
        Path p1 = new Path();
        p1.moveTo(50,-150);
        p1.lineTo(50,330);
        p1.moveTo(50,-150);


        p1.moveTo(40,-50);
        p1.lineTo(60,-50);

        p1.moveTo(40,50);
        p1.lineTo(60,50);

        p1.moveTo(40,150);
        p1.lineTo(60,150);

        p1.moveTo(40,250);
        p1.lineTo(60,250);



        ShapeDrawable d1 = new ShapeDrawable(new PathShape(p1,100,100));
        d1.setIntrinsicWidth(400);
        d1.setIntrinsicHeight(400);
        d1.getPaint().setColor(Color.BLACK);
        d1.getPaint().setStyle(Paint.Style.STROKE);
        d1.getPaint().setStrokeWidth(1);
        setShapeByDrawable(d1,line1);
        


        line2 = (ImageView)findViewById(R.id.line2);
        Path p2 = new Path();
        p2.moveTo(-310,10);
        p2.lineTo(800,10);
        p2.moveTo(-310,10);

        ShapeDrawable d2 = new ShapeDrawable(new PathShape(p2,100,100));
        d2.setIntrinsicHeight(400);
        d2.setIntrinsicWidth(400);
        d2.getPaint().setColor(Color.BLACK);
        d2.getPaint().setStyle(Paint.Style.STROKE);
        d2.getPaint().setStrokeWidth(1);
        setShapeByDrawable(d2,line2);

        // bar Graph1
        barGraph1 = (ImageView)findViewById(R.id.barGraph1);
        ShapeDrawable d3 = new ShapeDrawable(new RectShape());
        d3.setIntrinsicHeight(20);
        d3.setIntrinsicWidth(5);
        d3.getPaint().setColor(Color.rgb(140,193,152));
        setShapeByDrawable(d3,barGraph1);

        // bar Graph1
        barGraph2 = (ImageView)findViewById(R.id.barGraph2);
        ShapeDrawable d4 = new ShapeDrawable(new RectShape());
        d4.setIntrinsicHeight(15);
        d4.setIntrinsicWidth(5);
        d4.getPaint().setColor(Color.rgb(227,222,153));
        setShapeByDrawable(d4,barGraph2);

        // bar Graph3
        barGraph3 = (ImageView)findViewById(R.id.barGraph3);
        ShapeDrawable d5 = new ShapeDrawable(new RectShape());
        d5.setIntrinsicHeight(30);
        d5.setIntrinsicWidth(5);
        d5.getPaint().setColor(Color.rgb(227,177,174));
        setShapeByDrawable(d5,barGraph3);

        // bar Graph4
        barGraph4 = (ImageView)findViewById(R.id.barGraph4);
        ShapeDrawable d6 = new ShapeDrawable(new RectShape());
        d6.setIntrinsicHeight(20);
        d6.setIntrinsicWidth(5);
        d6.getPaint().setColor(Color.rgb(208,186,228));
        setShapeByDrawable(d6,barGraph4);
    }
    private void setShapeByDrawable(Drawable drawable, ImageView reusableImageView){
        reusableImageView.setImageDrawable(drawable);
    }
}