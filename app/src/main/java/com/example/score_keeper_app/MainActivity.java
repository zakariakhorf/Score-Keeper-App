package com.example.score_keeper_app;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
	int i1 = 0;
	int i2 = 0;
	int i3 = 0;
	int i4 = 0;
	int i5 = 0;
	int i6 = 0;

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
		canvas.drawLine(offset, canvas.getHeight() / 2, canvas.getWidth() - offset, canvas.getHeight() / 2, paint);
		v.setImageBitmap(bitmap);
		Button btngoal2 = findViewById(R.id.button);
		Button btngoal1 = findViewById(R.id.button2);
		Button btnreset = findViewById(R.id.button3);
		Button btnredcard1 = findViewById(R.id.imageButton1);
		Button btnyellow1 = findViewById(R.id.imageButton2);
		Button btnredcard2 = findViewById(R.id.imageButton3);
		Button btnyellow2 = findViewById(R.id.imageButton4);
		btngoal1.setOnClickListener(this);
		btngoal2.setOnClickListener(this);
		btnreset.setOnClickListener(this);
		btnredcard1.setOnClickListener(this);
		btnredcard2.setOnClickListener(this);
		btnyellow1.setOnClickListener(this);
		btnyellow2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.button:
				TextView score1 = findViewById(R.id.editTextNumber2);
				i1++;
				score1.setText(String.valueOf(i1));
				break;
			case R.id.button2:
				TextView score2 = findViewById(R.id.editTextNumber);
				i2++;
				score2.setText(String.valueOf(i2));
				break;
			case R.id.button3:
				TextView t3 = findViewById(R.id.editTextNumber2);
				TextView t4 = findViewById(R.id.editTextNumber);
				TextView t5 = findViewById(R.id.textView22);
				TextView t6 = findViewById(R.id.textView7);
				TextView t7 = findViewById(R.id.textView5);
				TextView t12 = findViewById(R.id.textView3);
				i1 = 0;
				i2 = 0;
				i3 = 0;
				i4 = 0;
				i5 = 0;
				i6 = 0;
				t12.setText("0");
				t5.setText("0");
				t6.setText("0");
				t7.setText("0");
				t4.setText("0");
				t3.setText("0");
				break;
			case R.id.imageButton1:
				TextView redcard1 = findViewById(R.id.textView22);
				i3++;
				redcard1.setText(String.valueOf(i3));
				break;
			case R.id.imageButton2:
				TextView yellowcard1 = findViewById(R.id.textView3);
				i4++;
				yellowcard1.setText(String.valueOf(i4));
				break;
			case R.id.imageButton3:
				TextView redcard2 = findViewById(R.id.textView7);
				i5++;
				redcard2.setText(String.valueOf(i5));
				break;
			case R.id.imageButton4:
				TextView yellowcard2 = findViewById(R.id.textView5);
				i6++;
				yellowcard2.setText(String.valueOf(i6));
				break;
			default:
				break;
		}
	}
}