package com.example.iqbalgozali.projectblankue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.TextView;
import android.widget.Toast;

public class Pesanan extends AppCompatActivity {
TextView namapemesan,alamatpemesan,namakue,hargapemesanan;
    Bundle datke3;
    String nama_pemesan,alamat_pemesan,nama_kue,harga_pemesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);
        getSupportActionBar().setTitle("Pemesanan Anda");
        getSupportActionBar().setSubtitle("BlanjaKue.com");

        namapemesan = (TextView) findViewById(R.id.nama);
        alamatpemesan = (TextView) findViewById(R.id.alamat);
        namakue = (TextView) findViewById(R.id.kue);
        hargapemesanan = (TextView) findViewById(R.id.harga);

        datke3 = getIntent().getExtras();

        nama_pemesan = datke3.getString("nama_pemesan");
        alamat_pemesan = datke3.getString("alamat_penerima");
        nama_kue = datke3.getString("nama_kue");
        harga_pemesan = datke3.getString("total");

        namapemesan.setText(nama_pemesan);
        alamatpemesan.setText(alamat_pemesan);
        namakue.setText(nama_kue);
        hargapemesanan.setText(harga_pemesan);

        sendSmsByManager(nama_pemesan);
        sendSmsByManager(alamat_pemesan);
        sendSmsByManager(nama_kue);
        sendSmsByManager(harga_pemesan);



    }

    public void sendSmsByManager(String isipesan) {

        try {

            // Get the default instance of the SmsManager

            SmsManager smsManager = SmsManager.getDefault();

            smsManager.sendTextMessage("085921834711",null,isipesan,

                    null,

                    null);

            Toast.makeText(getApplicationContext(), "Your sms has successfully sent!",

                    Toast.LENGTH_LONG).show();

        } catch (Exception ex) {

            Toast.makeText(getApplicationContext(),"Your sms has failed...",

                    Toast.LENGTH_LONG).show();

            ex.printStackTrace();

        }
    }
}
