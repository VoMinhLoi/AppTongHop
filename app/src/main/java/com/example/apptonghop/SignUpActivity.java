package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    EditText nameETAX, passETAX, confirmPassETAX;
    Button logInBTAX, signUpBTAX;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        AnhXa();
        signUpBTAX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameETAX.getText().toString();
                String pass = passETAX.getText().toString();
                String confirmPass = confirmPassETAX.getText().toString();
                if(name.isEmpty() || pass.isEmpty() || confirmPass.isEmpty())
                    Toast.makeText(SignUpActivity.this,"Ô trống!!!",Toast.LENGTH_SHORT).show();
                else
                    if(pass.equals(confirmPass))
                        SetByBundle(name, pass);
                    else
                        Toast.makeText(SignUpActivity.this, "Mật khẩu không trùng khớp!!!", Toast.LENGTH_SHORT).show();
            }
        });
        logInBTAX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, LogInActivity.class);
                startActivity(intent);
            }
        });
    }

    public void AnhXa(){
        nameETAX = (EditText) findViewById(R.id.nameET);
        passETAX = (EditText) findViewById(R.id.passET);
        confirmPassETAX = (EditText) findViewById(R.id.passConfirmET);
        signUpBTAX = (Button) findViewById(R.id.signUpBT);
        logInBTAX = (Button) findViewById(R.id.logInBT);
    }

    public void SetByBundle(String name, String pass){
        Intent intent = new Intent(SignUpActivity.this, LogInActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("nameCL", name);
        bundle.putString("passCL",pass);
        intent.putExtra("bundleCL",bundle);
        startActivity(intent);
    }
}