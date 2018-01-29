package com.tuankiet.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Khởi tạo biến
    TextView txtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ánh xạ
        txtv = (TextView) findViewById(R.id.label1);
        txtv.setText("My first Android Application");
    }
}
