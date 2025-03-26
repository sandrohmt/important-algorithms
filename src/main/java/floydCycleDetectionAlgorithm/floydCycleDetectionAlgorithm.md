# Floyd's cycle detection algorithm

O algoritmo de Floyd é utilizado para detectar ciclos em uma lista ligada. Ele funciona com dois ponteiros que percorrem a lista em velocidades diferentes. 
Se houver um ciclo, esses ponteiros eventualmente se encontrarão.
Também é possível saber onde o ciclo se inicia.

## Estrutura de dados utilizadas

- Node: Representa um nó na lista com um valor (data) e um ponteiro (next) para o próximo nó.
- SinglyLinkedList: Representa a lista ligada, contendo o nó cabeça (head), que é o primeiro nó da lista.

## Detecção de ciclo na Lista

- Variáveis Auxiliares
    - slow: Ponteiro lento, que avança um nó por vez.
    - fast: Ponteiro rápido, que avança dois nós por vez.
    - count: Contador para encontrar a posição do início do ciclo.

### Passos para detectar um ciclo

1. Inicializamos slow e fast apontando para head.
2. Iteramos sobre a lista enquanto fast e fast.next não forem null.
- Movemos slow um passo à frente
- Movemos fast dois passos à frente.
3. Se slow for igual a fast em algum momento, existe um ciclo.
4. Para encontrar o ponto de entrada do ciclo:
- Reiniciamos slow para head.
- Movemos slow e fast um nó por vez até se encontrarem novamente.
- O nó onde eles se encontram é o ponto de entrada do ciclo.
