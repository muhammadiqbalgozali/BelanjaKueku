package com.example.iqbalgozali.projectblankue;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class pilihan extends AppCompatActivity {
    ListView lv;

    String[] listviewvalue = new String[]{"KUE COKLAT - Rp50000","KUE BOLU - Rp30000","KUE REMBO - Rp60000","KUE LAPIS - Rp25000","KUE ORENGE - Rp20000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Pilih Kue");
        getSupportActionBar().setSubtitle("BlanjaKue.com");
        setContentView(R.layout.activity_pilihan);
    lv = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listviewvalue);
        lv.setAdapter(adapter);
        

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                  Intent det = new Intent(pilihan.this,detail.class);
                det.putExtra("kue",listviewvalue[i].toString());
                startActivity(det);
            }
        });

    }
}