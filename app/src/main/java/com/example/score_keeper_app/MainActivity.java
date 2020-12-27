package com.example.score_keeper_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int i1,i2,i3,i4,i5,i6 = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView v = findViewById(R.id.imageView);
        Bitmap bitmap = Bitmap.createBitmap(10, 700, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(Color.DKGRAY);
        Paint paint = new Paint();
        paint.setColor(Color.DKGRAY);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(8);
        paint.setAntiAlias(true);
        int offset = 50;

        canvas.drawLine(
                offset, canvas.getHeight() / 2, canvas.getWidth() - offset, canvas.getHeight() / 2, paint);
        v.setImageBitmap(bitmap);
        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.imageButton1);
        Button b5 = (Button) findViewById(R.id.imageButton2);
        Button b6 = (Button) findViewById(R.id.imageButton3);
        Button b7 = (Button) findViewById(R.id.imageButton4);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                TextView t = (TextView) findViewById(R.id.editTextNumber2);
                i1 ++ ;
                t.setText(String.valueOf(i1));
                break;
            case R.id.button2:
                TextView t2 = (TextView) findViewById(R.id.editTextNumber);
                i2 ++ ;
                t2.setText(String.valueOf(i2));
                break;



            case R.id.button3:
                TextView t3 = (TextView) findViewById(R.id.editTextNumber2);
                TextView t4 = (TextView) findViewById(R.id.editTextNumber);
                TextView t5 = (TextView) findViewById(R.id.textView22);
                TextView t6 = (TextView) findViewById(R.id.textView7);
                TextView t7 = (TextView) findViewById(R.id.textView5);

                i1 = 0 ;
                i2 = 0 ;
                i3 = 0 ;
                i4 = 0 ;
                i5 = 0 ;
                i6 = 0 ;


                t5.setText("0");
                t6.setText("0");
                t7.setText("0");

                t4.setText("0");
                t3.setText("0");


                break;
            case R.id.imageButton1:
                TextView t8 = (TextView) findViewById(R.id.textView22);
                i3 ++ ;
                t8.setText(String.valueOf(i3));
                break;
            case R.id.imageButton2:
                TextView t9 = (TextView) findViewById(R.id.textView3);
                i4 ++ ;
                t9.setText(String.valueOf(i4));
                break;
            case R.id.imageButton3:
                TextView t10 = (TextView) findViewById(R.id.textView7);
                i5 ++ ;
                t10.setText(String.valueOf(i5));
                break;
            case R.id.imageButton4:
                TextView t11 = (TextView) findViewById(R.id.textView5);
                i6 ++ ;
                t11.setText(String.valueOf(i6));
                break;
            default:
                break;
        }
    }
}