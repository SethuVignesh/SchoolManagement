package com.newtra.srikumaranpublicschool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.newtra.srikumaranpublicschool.activity.MainActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View v){
        Intent intent= new Intent(LoginActivity.this,MainActivity.class);
        startActivity(intent);
    }


}
