# Binary Tree Depth First Search

Em árvores binárias, o DFS pode ser implementado de três formas principais:

1. Pré-ordem (Preorder Traversal - Root, Left, Right)
2. Em-ordem (Inorder Traversal - Left, Root, Right)
3. Pós-ordem (Postorder Traversal - Left, Right, Root)

## Variáveis auxiliares

- root: Representa a raiz da árvore.
- left e right: Referenciam os filhos do nó atual.
- dfs(root): Função recursiva para percorrer a árvore.

## Explicação do Código

1. Criamos a classe TreeNode para representar cada nó da árvore.
2. Implementamos dfs(root), que:
- Processa o nó atual (exibe seu valor).
- Chama recursivamente o DFS no filho esquerdo.
- Chama recursivamente o DFS no filho direito.
3. Construímos a árvore manualmente e chamamos dfs(root).