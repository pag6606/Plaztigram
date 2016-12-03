package com.consultoresag.plaztigram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.consultoresag.plaztigram.view.ContainerActivity;
import com.consultoresag.plaztigram.view.CreateAccountActivity;

import static android.R.attr.button;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView registro = (TextView)findViewById(R.id.create_here);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent =  new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });

        Button botonLogin = (Button) findViewById(R.id.login);
        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(LoginActivity.this, ContainerActivity.class);
//                Intent intent =  new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });

    }
}
