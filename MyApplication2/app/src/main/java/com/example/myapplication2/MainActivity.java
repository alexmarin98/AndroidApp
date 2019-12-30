package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user,pass,cpass;
    Button register,login;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DatabaseHelper(this);
        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        cpass = (EditText) findViewById(R.id.cpass);
        register = (Button) findViewById(R.id.register);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Login.class);
                startActivity(i);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = user.getText().toString();
                String s2 = pass.getText().toString();
                String s3 = cpass.getText().toString();
                if(s1.equals("")|| s2.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields are empty",Toast.LENGTH_SHORT).show();
                }
                else{
                    if (s2.equals(s3)){
                        Boolean check = db.checkUsername(s1);
                        if(check == true){
                            Boolean insert = db.insert(s1,s2);
                            if (insert == true){
                                Toast.makeText(getApplicationContext(),"Registered Successfully",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"Username allready exists",Toast.LENGTH_SHORT).show();
                        }

                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Password doesn't match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
