package com.example.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {
        String[] frase = {"Um pequeno pensamento positivo pela manhã pode" + "mudar todo seu dia.",
                "Que o dia seja leve, que a tristeza seja" + "breve e que o dia seja feliz. Bom dia!",
                "Que o dia comece bem e termine ainda melhor.",
                "Sempre que o sol nasce, voce tem uma noca chance."};


        int numero = new Random().nextInt( frase.length );

        TextView texto = findViewById(R.id.textoResultado);

        texto.setText( frase[numero]);

    }
}
