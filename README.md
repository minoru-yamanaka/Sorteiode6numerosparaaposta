# Sorteio para aposta App Android 

Este é um aplicativo Android simples que gera e exibe seis números sorteados entre 1 e 60, simulando um sorteio de loteria.

1. **Layout e Componentes:**
   - O layout da atividade é definido no arquivo XML (activity_main.xml).
   - O código Java está contido na classe `MainActivity`.

2. **Iniciando a Atividade:**
   - A atividade é iniciada no método `onCreate`.
   - É configurado o layout a ser exibido (`R.layout.activity_main`).
   - Referências são obtidas para o TextView (`resultadoTextView`) e o botão de sorteio (`botaoSorteio`).

3. **Sorteio de Números:**
   - O clique no botão de sorteio (`botaoSorteio`) é configurado para chamar o método `realizarSorteio`.
   - O método `realizarSorteio` utiliza a classe `Random` para gerar números aleatórios.
   - Seis números aleatórios são gerados e armazenados em uma lista (`numerosSorteados`).
   - A lista é ordenada para exibição mais organizada.

4. **Exibição do Resultado:**
   - Os seis números sorteados são formatados em uma string usando um loop.
   - O resultado é exibido no TextView (`resultadoTextView`).

Em resumo, este aplicativo gera aleatoriamente seis números entre 1 e 60 e exibe o resultado organizado em um TextView quando o botão de sorteio é clicado. É um exemplo simples de como usar a classe `Random` e trabalhar com listas em um aplicativo Android.

![image](https://github.com/minoru-yamanaka/Sorteiode6numerosparaaposta/assets/106222007/5233a56c-0992-4ca4-ab0d-eb6e4d31b506)

