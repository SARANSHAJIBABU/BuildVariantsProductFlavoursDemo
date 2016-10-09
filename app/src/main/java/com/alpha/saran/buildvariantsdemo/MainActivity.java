package com.alpha.saran.buildvariantsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.alpha.saran.buildvariantsdemo.util.Util;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProHelperInterface proHelper = new Util();

        Toast.makeText(this,"Is pro :"+proHelper.isPro(),Toast.LENGTH_SHORT).show();
    }
}
