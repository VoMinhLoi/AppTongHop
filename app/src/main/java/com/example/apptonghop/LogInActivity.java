package com.example.apptonghop;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LogInActivity extends AppCompatActivity {
    EditText nameETAX, passETAX;
    Button loginBTAX, signUpBTAX;
    String nameSU = "";
    String passSU = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        AnhXa();
        //        GetDataBundleIntent(nameSU, passSU);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getBundleExtra("bundleCL");
        if(bundle!=null){
            nameSU = bundle.getString("nameCL");
            passSU = bundle.getString("passCL");
        }

        loginBTAX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nameSU.isEmpty())
                    LogInMain();
                else {
                    String name = nameETAX.getText().toString();
                    String pass = passETAX.getText().toString();
                    if(name.isEmpty() || pass.isEmpty())
                        Toast.makeText(LogInActivity.this,"Không được bỏ trống!!!",Toast.LENGTH_SHORT).show();
                    else
                    if(name.equals(nameSU))
                        if(pass.equals(passSU))
                            LogInMain();
                        else
                            Toast.makeText(LogInActivity.this,"Sai mật khẩu!!!",Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(LogInActivity.this, "Tài khoản không tồn tại!!!", Toast.LENGTH_SHORT).show();

                }
            }
        });

        signUpBTAX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    public void AnhXa(){
        nameETAX = (EditText) findViewById(R.id.nameETLG);
        passETAX = (EditText) findViewById(R.id.passETLG);
        loginBTAX = (Button) findViewById(R.id.logInBTLG);
        signUpBTAX = (Button) findViewById(R.id.signUpBTLG);
    }

    public void GetDataBundleIntent(String nameSU, String passSU){
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getBundleExtra("bundleCL");
        nameSU = bundle.getString("nameCL");
        passSU = bundle.getString("passCL");
    }

    public void LogInMain(){
        Intent intent = new Intent(LogInActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
