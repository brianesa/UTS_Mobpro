package com.example.user.cake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button ok;
    TextView forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        forgot = (TextView)findViewById(R.id.forgot);
        ok = (Button)findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((username.getText().toString().equals("admin"))&&(password.getText().toString().equals("admin"))){
                    Intent intent = new Intent(MainActivity.this, PilihKue.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "username atau password salah!", Toast.LENGTH_LONG).show();
                }
            }
        });
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "username: admin, password: admin", Toast.LENGTH_LONG).show();
            }
        });

    }
}
