package com.example.interfaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

  private  EditText user, password;
    private Button ingresar, registrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.editTextUser);
        password = findViewById(R.id.editTextPassword);

        ingresar = findViewById(R.id.btnIngresar);
        registrar = findViewById(R.id.btnRegistrar);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, registro.class);
                startActivity(intent);

            }
        });
    }
    public void Validar (View view){
        String usuario = user.getText().toString();
        String pass = password.getText().toString();
        if(usuario.isEmpty() || pass.isEmpty()){
            Toast.makeText(getApplicationContext() , "Usuario o clave vasios", Toast.LENGTH_SHORT).show();
        }else if(usuario.equals("iud2023") && pass.equals("moviles")){
            Intent intent = new Intent(this, Pajina.class );
            startActivity(intent);

            //Toast.makeText(getApplicationContext() , "Bienvenido...", Toast.LENGTH_SHORT).show();

        }else {
           Toast.makeText(getApplicationContext() , "Usuario o clave incorrecta", Toast.LENGTH_SHORT).show();
        }




    }
}