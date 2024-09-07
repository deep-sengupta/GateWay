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
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {

    private boolean PasswordShowing = false;
    private boolean ConfirmPasswordShowing = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        final EditText Email = findViewById(R.id.EmailET);
        final EditText Mobile = findViewById(R.id.MobileET);

        final EditText Password = findViewById(R.id.PasswordET);
        final EditText ConfirmPassword = findViewById(R.id.ConfirmPasswordET);
        final ImageView PasswordIcon = findViewById(R.id.PasswordIcon);
        final ImageView ConfirmPasswordIcon = findViewById(R.id.ConfirmPasswordIcon);
        final AppCompatButton SignUpBtn = findViewById(R.id.SignUpBtn);
        final TextView SignInBtn = findViewById(R.id.SignInBtn);

        PasswordIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(PasswordShowing){
                    PasswordShowing = false;

                    Password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    PasswordIcon.setImageResource(R.drawable.show);
                }
                else{
                    PasswordShowing = true;

                    Password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    PasswordIcon.setImageResource(R.drawable.hide);
                }
                Password.setSelection(Password.length());
            }
        });

        ConfirmPasswordIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ConfirmPasswordShowing){
                    ConfirmPasswordShowing = false;

                    ConfirmPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    ConfirmPasswordIcon.setImageResource(R.drawable.show);
                }
                else{
                    ConfirmPasswordShowing = true;

                    ConfirmPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    ConfirmPasswordIcon.setImageResource(R.drawable.hide);
                }
                ConfirmPassword.setSelection(ConfirmPassword.length());
            }
        });

        SignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String getMobileTxt = Mobile.getText().toString();
                final String getEmailTxt = Email.getText().toString();

                Intent intent = new Intent(Register.this, OTPVerification.class);

                intent.putExtra("mobile", getMobileTxt);
                intent.putExtra("email", getEmailTxt);

                startActivity(intent);
            }
        });

        SignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}