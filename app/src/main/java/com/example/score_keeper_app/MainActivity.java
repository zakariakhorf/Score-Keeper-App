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
	int goalt2 = 0;
	int goalt1 = 0;
	int redcardcount1 = 0;
	int yellowcardscount1 = 0;
	int redcardscount2 = 0;
	int yellowcardscount2 = 0;

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
				goalt2++;
				score1.setText(String.valueOf(goalt2));
				break;
			case R.id.button2:
				TextView score2 = findViewById(R.id.editTextNumber);
				goalt1++;
				score2.setText(String.valueOf(goalt1));
				break;
			case R.id.button3:
				TextView scoreteam1 = findViewById(R.id.editTextNumber2);
				TextView scoreteam2 = findViewById(R.id.editTextNumber);
				TextView nbredcardsteam1 = findViewById(R.id.textView22);
				TextView nbyellowcardsteam1 = findViewById(R.id.textView7);
				TextView nbredcardsteam2 = findViewById(R.id.textView5);
				TextView nbyellowcardsteam2 = findViewById(R.id.textView3);
				goalt2 = 0;
				goalt1 = 0;
				redcardcount1 = 0;
				yellowcardscount1 = 0;
				redcardscount2 = 0;
				yellowcardscount2 = 0;
				nbyellowcardsteam2.setText("0");
				nbredcardsteam1.setText("0");
				nbyellowcardsteam1.setText("0");
				nbredcardsteam2.setText("0");
				scoreteam2.setText("0");
				scoreteam1.setText("0");
				break;
			case R.id.imageButton1:
				TextView redcard1 = findViewById(R.id.textView22);
				redcardcount1++;
				redcard1.setText(String.valueOf(redcardcount1));
				break;
			case R.id.imageButton2:
				TextView yellowcard1 = findViewById(R.id.textView3);
				yellowcardscount1++;
				yellowcard1.setText(String.valueOf(yellowcardscount1));
				break;
			case R.id.imageButton3:
				TextView redcard2 = findViewById(R.id.textView7);
				redcardscount2++;
				redcard2.setText(String.valueOf(redcardscount2));
				break;
			case R.id.imageButton4:
				TextView yellowcard2 = findViewById(R.id.textView5);
				yellowcardscount2++;
				yellowcard2.setText(String.valueOf(yellowcardscount2));
				break;
			default:
				break;
		}
	}
}