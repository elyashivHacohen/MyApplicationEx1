package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etPassword, etConfirmPassword;
    Button btEnter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etUserPasswordConfirm);
        btEnter = findViewById(R.id.btEnter);
        btEnter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(isSamePassword()) {
            btEnter.setText("success");
            Intent go = new Intent(this,MainActivity2.class);
            startActivity(go);
        }
        else
            btEnter.setText("No sames password access not authorized");
    }
    public boolean isSamePassword(){
        return (etPassword.getText().toString().equals(etConfirmPassword.getText().toString()));


    }
}