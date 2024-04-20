package com.example.miapp2;

import android.os.Bundle;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public void sumar(View view){
        Log.i("app", "funciona");
        TextView displayText = findViewById(R.id.displayText);
        displayText.setText(R.string.sumar);
    }

    public void restar(View view){
        Log.i("app", "funciona");
        TextView displayText = findViewById(R.id.displayText);
        displayText.setText(R.string.restar);
    }

    public void multiplicar(View view){
        Log.i("app", "funciona");
        TextView displayText = findViewById(R.id.displayText);
        displayText.setText(R.string.multiplicar);
    }

    public void dividir(View view){
        Log.i("app", "funciona");
        TextView displayText = findViewById(R.id.displayText);
        displayText.setText(R.string.dividir);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView displayText = findViewById(R.id.displayText);
        displayText.setText("Probando pantalla");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}