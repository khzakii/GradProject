package com.example.seoudi.gradproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Register2Activity extends AppCompatActivity {
    String name,email,password,age,mobile,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        name =  getIntent().getStringExtra("name");
        email =  getIntent().getStringExtra("email");
        password =  getIntent().getStringExtra("password");
        age =  getIntent().getStringExtra("age");
        mobile =  getIntent().getStringExtra("mobile");
        gender =  getIntent().getStringExtra("gender");
    }
}
