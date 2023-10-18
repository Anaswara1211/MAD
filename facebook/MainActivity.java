package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.name);
        loginButton = (Button) findViewById(R.id.button);
    }
    public void clickme(View view)
    {
    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
    String str= user.getText().toString();
    intent.putExtra("username",str);
    startActivity(intent);
    }
}
