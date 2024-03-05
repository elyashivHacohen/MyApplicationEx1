package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etUserName,etUserPassword,etUserPasswordConfirm;
    Button btSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initViews();
    }
    public void initViews(){
        etUserName=findViewById(R.id.etUserName);
        etUserPassword=findViewById(R.id.etUserPassword);
        etUserPasswordConfirm=findViewById(R.id.etUserPasswordConfirm);
        btSignUp=findViewById(R.id.btSignUp);
        btSignUp.setOnClickListener(this);
    }


    public void onClick(View view) {
        if(thePasswordIsSame()){
            String username = etUserName.getText().toString();
            String UserPassword = etUserPassword.getText().toString();
            SharedPreferences sharedPref = this.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString("userName",username);
            editor.putString("UserPassword",UserPassword);
            Intent go = new Intent(this,MainActivity2.class);
            startActivity(go);
        }
        else
            btSignUp.setText("No sames password access not authorized");



    }
    public boolean thePasswordIsSame(){
         return (etUserPassword.getText().toString().equals(etUserPasswordConfirm.getText().toString()));
    }


}