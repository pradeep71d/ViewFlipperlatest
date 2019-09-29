package com.example.viewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
   private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = findViewById(R.id.view_flipper);
        TextView textView=new TextView(this);
        textView.setText("dynamically added textview");
        textView.setGravity(Gravity.CENTER);
        viewFlipper.addView(textView);
    }

    public void previousView(View v) {
        viewFlipper.showPrevious();
    }

    public void nextView(View v) {
        viewFlipper.showNext();
    }
}
