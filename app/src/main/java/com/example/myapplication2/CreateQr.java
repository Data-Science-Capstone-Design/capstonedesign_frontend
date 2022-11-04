package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;


public class CreateQr extends AppCompatActivity {
    ImageView qrcode;
    private String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createqr);

        qrcode = findViewById(R.id.qrcode);
        text = "https://www.naver.com";

        Button create_qrcode_btn = findViewById(R.id.qrcode_btn);
        create_qrcode_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MultiFormatWriter writer = new MultiFormatWriter();
                try{
                    //1. 바코드 생성
                    BitMatrix matrix = writer.encode(text, BarcodeFormat.QR_CODE, 350, 350);
                    //2. 바코드엔코더 생성
                    BarcodeEncoder encoder = new BarcodeEncoder();
                    //3. 엔코더로 생성한 코드를 비트맵 객체에 넣기
                    Bitmap bitmap = encoder.createBitmap(matrix);
                    //4. 비트맵을 이미지뷰에 넣기
                    qrcode.setImageBitmap(bitmap);
                } catch (WriterException e) {
                    e.printStackTrace();
                }

            }
        });


    }
}