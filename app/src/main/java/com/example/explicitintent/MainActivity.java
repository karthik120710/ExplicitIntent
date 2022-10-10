package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String NAME;
    public static String EMAIL="email";
    private EditText editTextName,editTextEmail;
    public void OnClickButton(View view){
        String name=editTextName.getText().toString();
        String email=editTextEmail.getText().toString();
        Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
        intent.putExtra(NAME,name);
        intent.putExtra(EMAIL,email);
        Log.i("Name :",name);
        Log.i("Email:",email);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName=findViewById(R.id.editTextName);
        editTextEmail=findViewById(R.id.editTextEmail);
    }
}