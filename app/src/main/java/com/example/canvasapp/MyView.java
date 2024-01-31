package com.example.canvasapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

import androidx.annotation.NonNull;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        Paint paint = new Paint();
        Paint paint1 = new Paint();
        Paint paint2 = new Paint();
        paint.setColor(Color.GREEN); // цвет маркера
        paint1.setColor(Color.YELLOW);
        paint2.setColor(Color.WHITE);


        paint.setStyle(Paint.Style.FILL);
        paint1.setStyle(Paint.Style.FILL);
        paint2.setStyle(Paint.Style.FILL);

        paint.setStrokeWidth(10);
        paint2.setStrokeWidth(10);
        paint1.setStrokeWidth(10);

        paint.setTextSize(100);
        paint.setAntiAlias(true);

        paint1.setAntiAlias(true);
        paint2.setAntiAlias(true);

        //grass
        RectF rectGr = new RectF(getLeft(),1600,getRight(), getBottom());
        canvas.drawRect(rectGr, paint);

        //tree
        RectF rectTree = new RectF(getLeft() / 3,900,getRight() / 3, 1600);
        canvas.drawRect(rectTree, paint1);

        canvas.drawLine(0, 900, getRight() / 3, 1250, paint2);
        canvas.drawLine(100, 900, getRight() / 3, 1150, paint2);
        canvas.drawLine(200, 900, getRight() / 3, 1050, paint2);
        canvas.drawLine(300, 900, getRight() / 3, 950, paint2);

        canvas.drawLine(0, 1000, getRight() / 3, 1350, paint2);
        canvas.drawLine(0, 1100, getRight() / 3, 1450, paint2);
        canvas.drawLine(0, 1200, getRight() / 3, 1550, paint2);

        canvas.drawLine(0, 1300, getRight() / 3 - 50, 1600, paint2);
        canvas.drawLine(0, 1400, getRight() / 3 - 150, 1600, paint2);
        canvas.drawLine(0, 1500, getRight() / 3 - 250, 1600, paint2);
        //canvas.drawLine(0, 1250, getRight() / 3, 1600, paint2);
        //canvas.drawLine(400, 900, getRight() / 3, 950, paint2);

        //canvas.drawColor(Color.YELLOW); // Фон
        //canvas.drawCircle(getWidth()/2,getHeight()/2,300,paint);


//        Path path = new Path();
//        path.moveTo(100,100);
//        path.lineTo(500,500);
//        path.lineTo(100,400);
//        paint.setColor(Color.GREEN);
//        canvas.drawPath(path,paint);

    }
}