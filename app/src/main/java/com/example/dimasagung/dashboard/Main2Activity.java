package com.example.dimasagung.dashboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText b, t;
    Button Ideal;
    Button Hitung;
    TextView Hasil;
    double nilaiberat, nilaitinggi, nilaihasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b = (EditText) findViewById(R.id.txtBERAT);
        t = (EditText) findViewById(R.id.txtTINGGI);
        Hasil = (TextView) findViewById(R.id.txtHasil);
        Hitung = (Button) findViewById(R.id.btnHitung);

        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b.length() == 0) {
                    Toast.makeText(getApplication(), " HARUS MENGISI BERAT BADAN ", Toast.LENGTH_LONG).show();
                }
                if (t.length() == 0) {
                    Toast.makeText(getApplication(), " HARUS MENGISI TINGGI", Toast.LENGTH_SHORT).show();
                }
                if (b.length() == 0 && t.length() == 0) {
                    Toast.makeText(getApplication(), " HARUS MENGISI BERAT DAN TINGGI ", Toast.LENGTH_SHORT).show();
                }else{
                    nilaiberat=Double.parseDouble(b.getText().toString());
                    nilaitinggi=Double.parseDouble(t.getText().toString());
                    nilaihasil=nilaiberat/((nilaitinggi/100)*(nilaitinggi/100));

                    if(nilaihasil<=18.5){
                        Hasil.setText(" TERLALU KURUS ");
                    }else if(nilaihasil>18.5 && nilaihasil<24.99){
                        Hasil.setText(" IDEAL ");
                    }else if (nilaihasil>25 && nilaihasil<29.99){
                        Hasil.setText(" BERATBADAN TERLALU GEMUK");

                    }else {
                        Hasil.setText(" OBESITAS ");
                    }

            }

                nilaiberat=Double.parseDouble(b.getText().toString());
                nilaitinggi=Double.parseDouble(t.getText().toString());
                nilaihasil=nilaiberat/((nilaitinggi/100)*(nilaitinggi/100));

                if(nilaihasil<=18.5){
                    Hasil.setText(" terlalu kurus ");
                }else if(nilaihasil>18.5 && nilaihasil<24.99){
                    Hasil.setText(" IDEAL ");
                }else if (nilaihasil>25 && nilaihasil<29.99){
                    Hasil.setText(" BERATBADAN TERLALU SEDIKIT GEMUK");

                }else {
                    Hasil.setText(" OBESITAS ");
                }
            }
        });
    }
}

