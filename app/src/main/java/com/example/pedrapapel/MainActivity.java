package com.example.pedrapapel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String frase;

    public void escolhaPedra(View vew) {
        this.opcaoSelecionada("pedra");

    }

    public void opcaoSelecionada(String opcaoSelecionada) {
        this.frase = "voce escolheu" + opcaoSelecionada;
        mudarTexto();

    }

    public void mudarTexto() {
        TextView textoResultado = findViewById(R.id.escolhaDoUsuario);
        textoResultado.setText(this.frase);
    }


}