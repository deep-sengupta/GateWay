package com.example.gateway;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private boolean PasswordShowing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        final EditText UsernameET = findViewById(R.id.UsernameET);
        final EditText PasswordET = findViewById(R.id.PasswordET);
        final ImageView PasswordIcon = findViewById(R.id.PasswordIcon);
        final TextView SignUpBtn = findViewById(R.id.SignUpBtn);
        final TextView SignInBtn = findViewById(R.id.SignInBtn);

        PasswordIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PasswordShowing) {
                    PasswordShowing = false;
                    PasswordET.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    PasswordIcon.setImageResource(R.drawable.show);
                } else {
                    PasswordShowing = true;
                    PasswordET.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    PasswordIcon.setImageResource(R.drawable.hide);
                }
                PasswordET.setSelection(PasswordET.length());
            }
        });

        SignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, OTPVerification.class));
            }
        });

        SignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Register.class));
            }
        });
    }
}
