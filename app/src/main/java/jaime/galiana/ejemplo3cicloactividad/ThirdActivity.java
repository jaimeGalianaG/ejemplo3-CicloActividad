package jaime.galiana.ejemplo3cicloactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.e("ESTADOS","Estamos en el onCreate Third");


    }
    @Override protected void onRestart(){
        super.onRestart();
        Log.e("ESTADOS","7-Estoy en el metodo restart THIRD");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "6-Estoy en el metodo DESTRUCCION NUCLEAR THIRD");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "5-Estoy en el metodo STOP THIRD");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4-Estoy en el metodo PAUSE THIRD");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3-Estoy en el metodo RESUME THIRD");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2-Estoy en el metodo START THIRD");
    }
}