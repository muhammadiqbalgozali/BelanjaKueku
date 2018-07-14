package com.example.iqbalgozali.projectblankue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText user,kunci;
Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("LOGIN");
        getSupportActionBar().setSubtitle("BlanjaKue.com");

        user = (EditText) findViewById(R.id.editText);
kunci = (EditText) findViewById(R.id.editText2);
        login = (Button) findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
if (user.getText().toString().equals("iqbal")&& kunci.getText().toString().equals("1234")) {
    Intent contak = new Intent(MainActivity.this, contek.class);
    startActivity(contak);

}else
    Toast.makeText(MainActivity.this,"Login/sandi salah silahkan masukan kembali lagi", Toast.LENGTH_SHORT).show();

            }
        });
    }
}

