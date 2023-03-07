package com.example.cryptowatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView Nome_Menu;
    private Button Botao;
    private EditText Usuario;
    private EditText Senha;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Nome_Menu.setText("CryptoWatch");


        Botao = findViewById(R.id.Botao);
        Usuario = findViewById(R.id.Usuario);
        Senha = findViewById(R.id.Senha);

        Botao.setText("Login");
        Usuario.setText("Usuario");
        Senha.setText("");


    }

    public void logar(View view){
        String usuario_login = Usuario.getText().toString();
        String senha_login = Senha.getText().toString();

        if (usuario_login.equals("usuario") && senha_login.equals("usuario")){
            Toast.makeText(MainActivity.this, "Login correto", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(MainActivity.this, "Login INCORRETO", Toast.LENGTH_LONG).show();
        }
    }

}