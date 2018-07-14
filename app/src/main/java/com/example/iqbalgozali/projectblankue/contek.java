package com.example.iqbalgozali.projectblankue;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.text.AlteredCharSequence;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.view.ViewGroup.LayoutParams;

public class contek extends AppCompatActivity {
    private Context mcontext;
    private Activity mactivity;
    private RelativeLayout mreal;
    private Button pilih, pengaplikasian, about;

    private PopupWindow mpopup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contek);
        getSupportActionBar().setTitle("CONTEKS");
        getSupportActionBar().setSubtitle("BlanjaKue.com");
        mcontext = getApplication();
        mactivity = contek.this;
        mreal = (RelativeLayout) findViewById(R.id.rl);
        pilih = (Button) findViewById(R.id.button2);
        pengaplikasian = (Button) findViewById(R.id.button3);
        about = (Button) findViewById(R.id.button4);


        pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(contek.this, pilihan.class);
                startActivity(i);
            }
        });


        pengaplikasian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = (LayoutInflater) mcontext.getSystemService(LAYOUT_INFLATER_SERVICE);
                View customView = inflater.inflate(R.layout.popup_window_aplikasi,null);


                mpopup = new PopupWindow(
                        customView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT
                );
                if(Build.VERSION.SDK_INT>=21){
                    mpopup.setElevation(5.0f);
                }
                ImageButton closeButton = (ImageButton) customView.findViewById(R.id.ib_close);
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mpopup.dismiss();

                    }
                });

                mpopup.showAtLocation(mreal, Gravity.CENTER,0,0);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = (LayoutInflater) mcontext.getSystemService(LAYOUT_INFLATER_SERVICE);
                View customView = inflater.inflate(R.layout.popup_window_about,null);


                mpopup = new PopupWindow(
                        customView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT
                );
                if(Build.VERSION.SDK_INT>=22){
                    mpopup.setElevation(5.0f);
                }

                ImageButton closeButton = (ImageButton) customView.findViewById(R.id.ib_close);
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mpopup.dismiss();

                    }
                });
                mpopup.showAtLocation(mreal, Gravity.CENTER,0,0);
            }
        });
    }
}






