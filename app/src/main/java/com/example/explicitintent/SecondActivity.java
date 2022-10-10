package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewName,textViewEmail;

    public void OnHomeButton(View view){
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
      Bundle bundle=getIntent().getExtras();
      String name=bundle.getString(MainActivity.NAME);
      String email=bundle.getString(MainActivity.EMAIL);
      textViewName=findViewById(R.id.textViewName);
      textViewEmail=findViewById(R.id.textViewEmail);
      textViewName.setText(name);
      textViewEmail.setText(email);
    }
}