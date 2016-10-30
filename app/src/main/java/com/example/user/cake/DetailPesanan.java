package com.example.user.cake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DetailPesanan extends AppCompatActivity {
    TextView cake;
    EditText pesan;
    EditText nama;
    Button ok2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pesanan);
        cake = (TextView)findViewById(R.id.cake1);
        pesan = (EditText) findViewById(R.id.pesan);
        nama = (EditText) findViewById(R.id.nama);
        ok2 = (Button) findViewById(R.id.ok2);
        ok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPesanan.this, UcapanSelamat.class);
                startActivity(intent);
            }
        });
        cake.setText(getIntent().getStringExtra("cake"));
    }
}
