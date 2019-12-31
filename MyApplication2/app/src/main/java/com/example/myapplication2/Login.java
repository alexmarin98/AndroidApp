package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText user,pass;
    Button login;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new DatabaseHelper(this);
        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = user.getText().toString();
                String password = pass.getText().toString();
                Boolean check = db.checkLogin(username,password);
                if (check == true){
                    Toast.makeText(getApplicationContext(),"Login successfully",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Login.this,MainContent.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Wrong username or password",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
