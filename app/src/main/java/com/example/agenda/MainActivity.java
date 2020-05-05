package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText nome;
    private TextInputEditText codigo;
    private TextInputEditText turma;
    private Button limpar;
    private Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editTextNome);
        codigo = findViewById(R.id.editTextCodigo);
        turma = findViewById(R.id.editTextTurma);
        limpar = findViewById(R.id.buttonLimpar);
        cadastrar = findViewById(R.id.buttonCadastrar);
    }
}
