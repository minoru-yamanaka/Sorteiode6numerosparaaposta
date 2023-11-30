package com.example.sorte;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Referência ao TextView que exibirá o resultado
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa o TextView e o botão de sorteio
        resultadoTextView = findViewById(R.id.resultadoTextView);
        Button botaoSorteio = findViewById(R.id.botaoSorteio);

        // Configura o ouvinte de clique para o botão de sorteio
        botaoSorteio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Método para realizar o sorteio de 6 números
                realizarSorteio();
            }
        });
    }

    // Método para realizar o sorteio de 6 números usando o método Random
    private void realizarSorteio() {
        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Lista para armazenar os números sorteados
        List<Integer> numerosSorteados = new ArrayList<>();

        // Realiza o sorteio de 6 números
        for (int i = 0; i < 6; i++) {
            // Gera um número aleatório entre 1 e 60 (inclusive)
            int numeroSorteado = random.nextInt(60) + 1;

            // Adiciona o número sorteado à lista
            numerosSorteados.add(numeroSorteado);
        }

        // Ordena a lista para exibição mais organizada
        Collections.sort(numerosSorteados);

        // Constrói uma string com os 6 números sorteados
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            resultado.append(numerosSorteados.get(i)).append(" ");
        }

        // Exibe o resultado no TextView
        resultadoTextView.setText("Números Sorteados: \n" + resultado.toString());

    }
}
