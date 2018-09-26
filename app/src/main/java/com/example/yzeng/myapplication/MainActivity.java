package com.example.yzeng.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        int i;
        TextView MyFirstName=findViewById(R.id.MyFirstName);
        MyFirstName.setText("Yixin Zeng");

    }
    private void whatever(){
        int i=1+1;
    }
}
