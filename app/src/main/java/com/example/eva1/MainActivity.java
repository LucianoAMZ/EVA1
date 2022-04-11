package com.example.eva1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText usuario;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.txtplnsUsuario);
        password = findViewById(R.id.txtpswdPassword);
    }

    public void iniciarSesion(View view){
        String user = usuario.getText().toString();
        String pass = password.getText().toString();

        if (user.equals("Luciano") && pass.equals("12345")){
            Intent i = new Intent(this, Bienvenida.class);
            startActivity(i);
        }
    }
}