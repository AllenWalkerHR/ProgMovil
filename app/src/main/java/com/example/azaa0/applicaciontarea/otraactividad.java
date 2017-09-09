package com.example.azaa0.applicaciontarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class otraactividad extends AppCompatActivity {

    Button btnGuardar;
    EditText txtUsuario;
    EditText txtTwitter;
    EditText txtPhone;
    EditText txtDate;
    EditText txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otraactividad);
        btnGuardar=(Button) findViewById(R.id.btnGuardar);
        txtDate=(EditText) findViewById(R.id.txtDate);
        txtEmail=(EditText) findViewById(R.id.txtEmail);
        txtPhone=(EditText) findViewById(R.id.txtPhone);
        txtTwitter=(EditText) findViewById(R.id.txtTwitter);
        txtUsuario=(EditText) findViewById(R.id.txtUsuario);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getIntent();

                String usuario=txtUsuario.getText().toString();
                String email=txtEmail.getText().toString();
                String twitter=txtTwitter.getText().toString();
                String phone=txtPhone.getText().toString();
                String fechaNac=txtDate.getText().toString();
                Contacto objeto =new Contacto(usuario,twitter,email,phone,fechaNac);
                i.putExtra("contacto",objeto);
                setResult(RESULT_OK,i);
                finish();

            }
        });
    }
}
