package com.example.erp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView idtext;//MainActivity Global Value

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idtext=(TextView)findViewById(R.id.editText);

    }

    public void login(View v){

        Toast.makeText(getApplicationContext(),idtext.getText().toString()
        +"  has logged in",Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getApplicationContext(),stock.class);//login to go
        startActivity(intent);

    }

    public void signin(View v){

        Toast.makeText(getApplicationContext(),"Please fill contents below",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),Signup.class);
        startActivity(intent);
    }


}
