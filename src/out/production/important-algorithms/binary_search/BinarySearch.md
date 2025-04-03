# Busca binária

A busca binária é um algoritmo eficiente para encontrar um elemento em uma lista ordenada. 
Em vez de percorrer a lista sequencialmente (O(N) no pior caso), ela reduz o espaço de busca pela metade a cada iteração, alcançando O(log(n)) de complexidade.

## Variáveis auxiliares
- left: Índice que representa o iníco do intervalo de busca.
- right: Índice que representa o final do intervalo de busca.
- mid: Índice central do intervalo, calculado como (left + right) / 2.

## Passos da busca binária:
1. Definimos left = 0 e right = tamanho do array - 1
2. Enquanto left <= right:
- Calculamos o índice do mid.
- Se arr[mid] == target, encontramos o elemento e retornamos mid.
- Se arr[mid] < target, o elemento está à direita -> Atualizamos left = mid + 1.
- Se arr[mid] > target, o elemento está à esquerda -> Atualizamos right = mid - 1.
3. Se o loop terminar sem encontrar o elemento, retornamos -1 (indicando que o elemento não está na lista).