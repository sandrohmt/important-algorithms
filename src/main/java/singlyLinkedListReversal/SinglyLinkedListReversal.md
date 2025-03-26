# Singly Linked List Reversal

O algoritmo de reversão de uma lista ligada simples envolve a alteração dos ponteiros dos nós de forma que, ao final, o último nó da lista se torne o primeiro. Aqui estão os principais passos:

## Estruturas de dados utilizadas:
- Node: Representa um nó na lista com um valor (data) e um ponteiro (next) para o próximo nó.
- SinglyLinkedList: Representa a lista ligada, contendo o nó cabeça (head), que é o primeiro nó da lista.

## Reversão da lista:
### Variáveis auxiliares:
- prev: Inicialmente é null, pois o novo vó final da lista terá seu ponteiro next apontando para null.
- current: Aponta para o nó atual sendo processado. Inicialmente, é o nó cabeça.
- next: Armazena o próximo nó antes de alterarmos o ponteiro de current.

### Passos para reversão:
1. Iteramos pela lista com current, enquanto ele não for null.
2. Em cada iteração, armazenamos o próximo nó (next = current.next antes de alterar o ponteiro de current.
3. Atualizamos o ponteiro de current.next para prev (inverte a direção).
4. Movemos prev para current, e current para next, avançando um nó na lista.
5. Quando current se torna null, a lista foi totalmente revertida, e o novo cabeçalho da lista é prev.
