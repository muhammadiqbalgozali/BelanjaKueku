package com.example.iqbalgozali.projectblankue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class detail extends AppCompatActivity {
    TextView kue,uang;
    EditText nama,add,psn;
    Button pesen;
    Bundle dataExtra;
    String tampil;

    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setTitle("Detail Pemesanan");
        getSupportActionBar().setSubtitle("BlanjaKue.com");

        nama = (EditText) findViewById(R.id.editText3);
        add = (EditText) findViewById(R.id.editText4);
        kue = (TextView) findViewById(R.id.textView);
        uang = (TextView) findViewById(R.id.textView4);
        psn = (EditText) findViewById(R.id.textView2);

        dataExtra = getIntent().getExtras();
        pesen = (Button) findViewById(R.id.button5);
        tampil = dataExtra.getString("kue");

        if (tampil.equals("KUE COKLAT - Rp50000")) {
            kue.setText("KUE COKLAT");
            uang.setText("Rp 50.000");
            a = 50000;
        }

        else
        if (tampil.equals("KUE BOLU - Rp30000")) {
            kue.setText("KUE BOLU");
            uang.setText("Rp 30.000");
            a = 30000;
        }
        else
        if (tampil.equals("KUE REMBO - Rp60000")) {
            kue.setText("KUE REMBO");
            uang.setText("Rp 60.000");
            a = 60000;
        }
        else
        if (tampil.equals("KUE LAPIS - Rp25000")) {
            kue.setText("KUE LAPIS");
            uang.setText(" Rp 25.000");
            a = 25000;
        }
        else  {
            kue.setText("KUE ORENGE");
            uang.setText(" Rp 20.000");
            a = 20000;
        }


pesen .setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
int jmps = Integer.parseInt(psn.getText().toString());

        final int C = a * jmps;

        Intent hasil = new Intent(detail.this,datpesanan.class);
        hasil.putExtra("nama_pesan",nama.getText().toString());
        hasil.putExtra("alamat_pesan",add.getText().toString());
        hasil.putExtra("nama_kue",kue.getText().toString());
        hasil.putExtra("total",Integer.toString(C));
        startActivity(hasil);

    }
});


    }
}
