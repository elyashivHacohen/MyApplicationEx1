package com.example.myapplication.ui.theme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class signInActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etUserNameKnisa, etUserPasswordKnisa;
    Button btKnisa, btHarshama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initViews();
    }
    public void initViews(){
        etUserNameKnisa = findViewById(R.id.etUserNameKnisa);
        etUserPasswordKnisa = findViewById(R.id.etUserPasswordKnisa1);
        btKnisa = findViewById(R.id.btKnisa);
        btHarshama = findViewById(R.id.btHarshama);
        btHarshama.setOnClickListener(this);

    }
btKnisa.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

    }
}