package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.AppCompatButton QrPay = (AppCompatButton) findViewById(R.id.QrPay);
        QrPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent QrIntent = new Intent(MainActivity.this, CreateQr.class);
                MainActivity.this.startActivity(QrIntent);
            }
        });

        androidx.appcompat.widget.AppCompatButton PinRegister = (AppCompatButton) findViewById(R.id.PinRegister);
        PinRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PinRegisterIntent = new Intent(MainActivity.this, PinNumber.class);
                MainActivity.this.startActivity(PinRegisterIntent);
            }
        });

        EditText MyPage = (EditText) findViewById(R.id.MyPage);
        MyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MyPageIntent = new Intent(MainActivity.this, MyPage.class);
                MainActivity.this.startActivity(MyPageIntent);
            }
        });

    }

}