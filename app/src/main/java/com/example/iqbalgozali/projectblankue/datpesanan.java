package com.example.iqbalgozali.projectblankue;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class datpesanan extends AppCompatActivity {
    TextView nama,alamat,namakue,hasil;
    Button pesan;
Bundle datake2;

    String Nama_pemesan,Alamat_kue,Nama_kue,Total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Data Pemesanan");
        getSupportActionBar().setSubtitle("BlanjaKue.com");
        setContentView(R.layout.activity_datpesanan);
        nama = (TextView) findViewById(R.id.namapemesan);
        alamat = (TextView) findViewById(R.id.alamat);
        namakue = (TextView) findViewById(R.id.namkue);
        hasil = (TextView) findViewById(R.id.hrgkue);
        pesan = (Button) findViewById(R.id.button6);
datake2 = getIntent().getExtras();
Nama_pemesan = datake2.getString("nama_pesan");
        Alamat_kue = datake2.getString("alamat_pesan");
        Nama_kue = datake2.getString("nama_kue");
        Total = datake2.getString("total");

        nama.setText(Nama_pemesan);
        alamat.setText(Alamat_kue);
        namakue.setText(Nama_kue);
        hasil.setText(Total);

pesan.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
Intent layarpesan = new Intent(datpesanan.this,Pesanan.class);
        layarpesan.putExtra("nama_pemesan",nama.getText().toString());
        layarpesan.putExtra("alamat_penerima",alamat.getText().toString());
        layarpesan.putExtra("nama_kue",namakue.getText().toString());
        layarpesan.putExtra("total",hasil.getText().toString());
        startActivity(layarpesan);




    }


});
    }


        }








