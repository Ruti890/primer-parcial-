package com.example.parcial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText etUsuario, etContrasena;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario = findViewById(R.id.etUsuario);
        etContrasena = findViewById(R.id.etContrasena);
        btnIngresar = findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validar();

            }

            private void validar() {
                String Usuario = etUsuario.getText().toString();
                String Contraseña = etContrasena.getText().toString();
                String Ingresar = btnIngresar.getText().toString();

                if (!Usuario.equals("uac123") && !Contraseña.equals("12345678")) {
                    Toast.makeText(MainActivity.this, "Por favor, rellene todos los campos", Toast.LENGTH_LONG).show();
                } else {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("Dato", "1)\nC\n\n2)\nC\n\n3)\nC\n\n4)\nB\n\n5)\nC\n\n6)\nA\n\n7)\nC\n\n8)\nB");
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}