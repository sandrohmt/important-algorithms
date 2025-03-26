# Sliding Window

É uma técnica eficiente para resolver problemas envolvendo subconjuntos continuos de uma estrutura de dados, como array ou strings.

Funciona mantendo uma janela dinâmica sobre um conjunto de dados e movendo essa janela para calcular a soluçao de forma mais eficiente do que abordagens ingênuas como força bruta

Ele é especialmente útil em problemas que envolvem:

- Subarrays ou substrings contínuas
- Soma máxima/mínima de um subarray de tamanho fixo
- Número máximo/mínimo de elementos distintos em um subarray

## Tipos de Sliding Window

- Janela Fixa: O tamanho da janela é constante.
- Janela Variavel: O tamanho da janela pode aumentar ou diminuir conforme necessario. 

## Passos para aplicar Slinding Window

Quando o tamanho da janela é constante, seguimos estes passos:

1. Criamos uma janela de tamanho k, incializando os primeiros k elementos.
2. Percorremos o array deslizando a janela:
- Removemos o elemento mais antigo da janela
- Adicionamos o novo elemtno da posiçao.
- Atualizamos a variavel de controle
3. Continuamos ate o final do array.