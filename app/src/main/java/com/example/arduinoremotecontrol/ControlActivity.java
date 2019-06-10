package com.example.arduinoremotecontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ControlActivity extends AppCompatActivity {
    Button up_btn;
    Button down_btn;
    Button left_btn;
    Button right_btn;
    Button stop_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        up_btn = (Button) findViewById(R.id.up_btn);
        down_btn = (Button) findViewById(R.id.down_btn);
        left_btn = (Button) findViewById(R.id.left_btn);
        right_btn = (Button) findViewById(R.id.right_btn);
        stop_btn = (Button) findViewById(R.id.stop_btn);
    }
}
