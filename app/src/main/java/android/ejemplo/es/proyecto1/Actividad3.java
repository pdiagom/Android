package android.ejemplo.es.proyecto1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Actividad3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b= getIntent().getExtras();
        assert b != null;
        Log.i("Bundle", Objects.requireNonNull(b.get("username")).toString());
        Log.i("Bundle", Objects.requireNonNull(b.get("num")).toString());
        Log.i("Bundle", Objects.requireNonNull(b.get("numdbl")).toString());
        Log.i("Bundle", Objects.requireNonNull(b.get("correcto")).toString());
        setContentView(R.layout.activity_actividad2);
        Intent ejemplo = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(ejemplo);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Entrada","Estoy en onStart2");
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
        Intent ejemplo= new Intent(Intent.ACTION_VIEW);
        ejemplo.setData(Uri.parse("https://www.google.es"));
        startActivity(ejemplo);
    }

}