package jaime.galiana.ejemplo3cicloactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActiviy extends AppCompatActivity {
    private Button btnAbrir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activiy);

        Log.e("ESTADOS","Estoy en el onCreate SECOND");

        btnAbrir = findViewById(R.id.btnAbrirMain);
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActiviy.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override protected void onRestart(){
        super.onRestart();
        Log.e("ESTADOS","7-Estoy en el metodo restart SECOND");
        this.onDestroy();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "6-Estoy en el metodo DESTRUCCION NUCLEAR SECOND");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "5-Estoy en el metodo STOP SECOND");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4-Estoy en el metodo PAUSE");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3-Estoy en el metodo RESUME SECOND");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2-Estoy en el metodo START SECOND");
    }

}