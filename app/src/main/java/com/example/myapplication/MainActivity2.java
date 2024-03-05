package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    EditText etGess;
    TextView info;
    Button btCheck;
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        num=random();
        initViews();
    }
    public void initViews(){
        etGess=findViewById(R.id.etGess);
        info=findViewById(R.id.info);
        btCheck=findViewById(R.id.btCheck);
        btCheck.setOnClickListener(this);
    }
    public int random(){
        int num;
        num=(int)(Math.random()*10)+1;
        return num;
    }

    @Override
    public void onClick(View view) {
        int numToGess = Integer.parseInt(etGess.getText().toString());
        if (numToGess==num)
            info.setText("הצלחת!");
        else
            info.setText("טעות");
    }
}