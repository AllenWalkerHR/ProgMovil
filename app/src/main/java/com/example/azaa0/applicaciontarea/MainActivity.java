package com.example.azaa0.applicaciontarea;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnAgregar;
    ListView ldv;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ldv=(ListView) findViewById(R.id.listView);
        btnAgregar=(Button) findViewById(R.id.btnAgregar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 i= new Intent(getApplication(),otraactividad.class);
               // i.putStringArrayListExtra("arr",list);
                startActivityForResult(i,2);
            }
        });
        Contacto contacto = new Contacto("AllenWalker", "@allenwalker_hCR","allenwalkerhr@mail.com","5553902281","4/11/96");
        cargarListView(contacto);




    }
    ArrayList <String> list=new ArrayList<>();
    ArrayList <Contacto> list2=new ArrayList<>();
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (RESULT_OK == resultCode)
        {
            Contacto objeto;
            objeto= (Contacto) data.getExtras().getSerializable("contacto");
            try {
                cargarListView(objeto);
            }catch (Exception ex) {}

        }
        else
        {

        }
    }
    public void cargarListView(Contacto objeto){
        list.add(objeto.getUsuario()+"\n"+objeto.getEmail());
        ArrayAdapter adp = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        ldv.setAdapter(adp);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CICLO", "Paso por el metodo onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CICLO", "Paso por el metodo onResume(), puedes interactuar");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("CICLO", "Paso por el metodo onPause(), No esta visible la actividad");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CICLO", "Paso por el metodo onStop(), puede que se destruya la actividad");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("CICLO", "Paso por el metodo onRestart(), resucito la actividad");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("CICLO", "Paso por el metodo onDestroy(), lo sentimos! Actividad destruida");
    }
}
