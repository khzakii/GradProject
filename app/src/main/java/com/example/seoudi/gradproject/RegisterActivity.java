package com.example.seoudi.gradproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class RegisterActivity extends AppCompatActivity {
    EditText name,email,password,confirmPass,age,mobile;
    Button cont;
    private MaterialBetterSpinner gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);
        getSupportActionBar().setTitle("Personal Information");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        name =(EditText)findViewById(R.id.register_full_name);
        email =(EditText)findViewById(R.id.register_email);
        password =(EditText)findViewById(R.id.register_password);
        confirmPass =(EditText)findViewById(R.id.register_confirm_password);
        age =(EditText)findViewById(R.id.register_age);
        mobile =(EditText)findViewById(R.id.register_mobile);
        gender = (MaterialBetterSpinner)findViewById(R.id.gender_spinner);
        cont = (Button) findViewById(R.id.btn_register_cont);
        buildGenderSpinnerData();
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().isEmpty()) {
                    name.setError("Please enter in your full name");
                } else if (email.getText().toString().isEmpty()) {
                    email.setError("Please enter your email");
                } else if (password.getText().toString().isEmpty()) {
                    password.setError("Please enter your password");
                } else if (password.getText().length()< 6) {
                    password.setError("Password Should Contain 6 or more Characters");
                } else if (confirmPass.getText().toString().isEmpty()) {
                    confirmPass.setError("Please confirm your password");
                } else if (!confirmPass.getText().toString().equals(password.getText().toString())) {
                    confirmPass.setError("Your password does not match");
                } else if (age.getText().toString().isEmpty()) {
                    age.setError("Please type your age");
                } else if(gender.getText().toString().equals("")){
                    gender.setError("Please specify your gender");
                }else{
                    Intent intent = new Intent(RegisterActivity.this,Register2Activity.class);
                    intent.putExtra("name",name.getText().toString());
                    intent.putExtra("email",email.getText().toString());
                    intent.putExtra("password",password.getText().toString());
                    intent.putExtra("age",age.getText().toString());
                    intent.putExtra("mobile",mobile.getText().toString());
                    intent.putExtra("gender",gender.getText().toString());
                    startActivity(intent);
                }
            }
        });

    }
    public void buildGenderSpinnerData() {
        String[] skills = new String[]{ "Male", "Female"};
        ArrayAdapter<String> arrayAdapter = new CreateGenderSpinnerAdapter(this,
                R.layout.create_spinner_item, skills);
        gender.setAdapter(arrayAdapter);
    }
}
