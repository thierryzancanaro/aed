# Exercício 1
## Tipos de Armazenamento
### Vector
Essa classe é um tipo de estrutura de dados que implementa uma array crescente de objetos, podendo acessar seus componentes através de seu índice.
Implementa a interface List, possuindo diversos métodos para sua manipulação.
Seu tamanho pode aumentar ou diminuir conforme itens são adicionados ou removidos.
Exemplo de uso: armazenar lista de nomes de pessoas presentes em um evento.
### ArrayList
Semelhante a classe Vector, essa estrutura de dados também implementa uma lista de objetos que cresce dinamicamente.
Entretanto, a classe ArrayList é mais utilizada por apresentar maior velocidade e ocupar menos memória.
Exemplo de uso: armazenar itens do carrinho de compras de uma loja online.
### LinkedList
Essa classe também é uma implementação da interface List, e consiste em uma sequência de nós, onde cada nó armazena um objeto e também a localização do próximo elemento da sequência.
Em comparação ao ArrayList, devido ao seu funcionamento interno diferente, possui melhor performance nos métodos add e remove, porém uma pior performance nos métodos get e set.
Exemplo de uso: armazenar histórico do navegador, onde cada página pode ser representada por um nó.
### HashMap
Essa classe é uma implementação da interface Map, e é caracterizada pelo armazenamento de pares chave-valor, onde cada chave é única e mapeada para um valor correspondente.
O HashMap apresenta uma boa performance em operações como get e put, e em grandes estruturas de dados apresenta desempenho superior aos tipos de armazenamento anteriormente citados.
Exemplo de uso: armazenar informações de pessoas com base em seu CPF.
