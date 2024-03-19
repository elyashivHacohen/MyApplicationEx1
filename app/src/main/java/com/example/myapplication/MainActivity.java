package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etPassword, etConfirmPassword;
    Button butEnter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etUserPasswordConfirm);
        butEnter = findViewById(R.id.btEnter);
        butEnter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(isSamePassword()) {
            butEnter.setText("success");
            Intent go = new Intent(this,MainActivity2.class);
            startActivity(go);
        }
        else
            butEnter.setText("No sames password access not authorized");
    }
    public boolean isSamePassword(){
        return (etPassword.getText().toString().equals(etConfirmPassword.getText().toString()));


    }
}