package com.example.loginpage;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View  ;
import  android.widget.Button;
import  android.widget.EditText;
import  android.widget.TextView;
import android.widget.Toast;

import javax.net.ssl.SSLContext;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button butn;
    String correct_user = "qwertyui";
    String correct_password = "qwertyuio";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.edit_user);
        password = (EditText) findViewById(R.id.edit_password);
        butn = (Button) findViewById(R.id.btn);
    }
    public void btnSub(View view) {
        if (username.getText().toString().isEmpty() &&  password.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Username and Password is Empty!  ", Toast.LENGTH_LONG).show();
        }
        else if (password.length() == 0 || password.length() < 8)
        {
            Toast.makeText(this, "Use 8 or more characters  in  password   ", Toast.LENGTH_SHORT).show();
        }
        else if (username.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please Enter Username", Toast.LENGTH_SHORT).show();
        }
        else if (username.getText().toString().equals(correct_user)) {
            if (password.getText().toString().equals(correct_password)) {
                Toast.makeText(this, "LogIn Succces", Toast.LENGTH_SHORT).show();
            }
        }
        else
            Toast.makeText(this, "Invalid Account", Toast.LENGTH_SHORT).show();
    }

}