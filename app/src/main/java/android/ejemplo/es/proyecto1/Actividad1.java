package android.ejemplo.es.proyecto1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
//        String mensaje="Hola a todos";
//        Intent correo=new Intent();
//        correo.setAction(Intent.ACTION_SEND);
//        correo.putExtra(Intent.EXTRA_TEXT,mensaje);
//        correo.setType("text/plain");
//        startActivity(correo);

        Log.i("Creado","Estoy en onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Entrada","Estoy en onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Resume","Estoy en onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Pausa","Estoy en onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Parada","Estoy en onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Reinicio","Estoy en onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Destruccion","Estoy en onDestroy");
        Intent ejemplo = new Intent(this, Actividad2.class);
        ejemplo.putExtra("username","Pablodgom");
        ejemplo.putExtra("num",26);
        ejemplo.putExtra("numdbl",26.9);
        ejemplo.putExtra("correcto",true);
        startActivity(ejemplo);
    }

}