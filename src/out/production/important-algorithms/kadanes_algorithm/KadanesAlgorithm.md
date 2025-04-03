# Kadane's Algorithm

O algoritmo de Kadane resolve o problema de encontrar a subsequência contígua com a maior soma dentro de um array de números inteiros.
Ele é eficiente e tem complexidade O(n), percorrendo o array apenas uma vez.

## Variáveis auxiliares

- currentSum: Representa a soma do subarray atual que estamos avaliando. Inicialmente, recebe o primeiro elemtn do array(arr[0]).
- maxSum: Armazena a maior soma encontrada até o momento. Inicialmente, recebe o primeiro elemento do array, (arr[0]).

## Passos do algoritmo

1. Inicializamos maxSum = arr[0] e windowSum = arr[0], assumindo que pelo menos um número existe no array.
2. Percorremos o array a partir do segumento elemento (i = 1 até arr.length)
3. A cada iteração:
- Decidimos se continuamos somando ou reiniciamos o subarray: windowSum = Math.max(arr[i], windowSum + arr[i])
- Se arr[i] for maior que windowSum + arr[i], significa que um novo subarray deve começar.
- Caso contrário, continuamos somando ao subarray atual.
- Atualizamos o valor máximo encontrado: maxSum = Math.max(maxSum, windowSum)