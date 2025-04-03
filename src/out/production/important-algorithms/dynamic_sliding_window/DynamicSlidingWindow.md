# Sliding Window dinâmica

O algoritmo Sliding Window (Janela Deslizante) dinâmica é uma abordagem eficiente para encontrar subarrays que atendam a uma condição específica, ajustando dinamicamente o tamanho da janela durante a execução.

## Variáveis auxiliares:

- left: Marca o início da janela. Começa em 0 e se move conforme necessario para reduzir o tamanho da janela.
- currentSum: Mantém a soma dos elementos dentro da janela atual.
- minLength: Armazena o menor tamanho de subarray encontrado que atende à condição.

## Passos do algoritmo:

1. Inicializamos left = 0, currentSum = 0 e minLength com um valor grande.
2. Percorremos o array com right, expandindo a janela e adicionando arr[right] a currentSum.
3. Enquanto currentSum for maior ou igual ao valor alvo, reduzimos a janela movendo left e subtraindo arr[left] de currentSum
4. A cada reduçao bem-sucedida da janela, atualizamos minLength para armazenar o menor tamanho encontrado.
5. No final, se minLength nao mudou, significa que nenhum subArray atende à condição.