package com.example.stringornek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtMetinBir;
    EditText edtMetinIki;

    Button btnMetinBirlestir;

    TextView birlestirMetin;

    String tutucuBir;
    String tutucuIki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMetinBir=findViewById(R.id.edt_metin_bir);
        edtMetinIki=findViewById(R.id.edt_metin_iki);

        btnMetinBirlestir=findViewById(R.id.btn_metin_birlestirme);

        birlestirMetin=findViewById(R.id.txt_birlesik_metin);

        btnMetinBirlestir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tutucuBir=edtMetinBir.getText().toString();
                tutucuIki=edtMetinIki.getText().toString();

                birlestirMetin.setText(tutucuBir+" "+tutucuIki);
            }
        });
    }
}