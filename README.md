# Análise Comparativa de Algoritmos de Ordenação em Java

Este projeto implementa três algoritmos clássicos de ordenação em **Java** — *Bubble Sort*, *Selection Sort* e *Cocktail Sort* — e realiza uma comparação entre eles com base em dois critérios principais:

- **Número de trocas**
- **Número de interações (comparações realizadas)**

Os algoritmos foram aplicados sobre três vetores distintos, com configurações diferentes de ordenação inicial.

---

## Objetivo

Analisar o comportamento dos algoritmos de ordenação em três situações:
1. **Vetor 1:** desordenado de forma aleatória.  
2. **Vetor 2:** já ordenado de forma crescente.  
3. **Vetor 3:** ordenado de forma decrescente.

O foco é entender o impacto da ordenação inicial no desempenho de cada algoritmo.

---

## Estrutura do Código Java

### 1. Classe `Ordenador` (Interface)
Define o contrato comum entre todos os algoritmos:
- Método `ordenar(int[] vetor)` → executa a ordenação e retorna um objeto `Medidas`.
- Método `obterNome()` → retorna o nome do algoritmo.

### 2. Classe `Medidas`
Armazena os resultados obtidos:
- `int trocas` → número de trocas realizadas.
- `int interacoes` → número total de comparações.

### 3. Classes de Ordenação
Cada uma implementa a interface `Ordenador`:

#### `BubbleSort`
Percorre o vetor diversas vezes, trocando elementos adjacentes fora de ordem.  
- Complexidade: **O(n²)**  
- Otimização: nenhuma (versão simples).

#### `SelectionSort`
Seleciona o menor elemento e o coloca na posição correta a cada iteração.  
- Complexidade: **O(n²)**  
- Menor número de trocas em relação ao Bubble Sort.

#### `CocktailSort`
Variação bidirecional do Bubble Sort, que percorre o vetor em ambos os sentidos.  
- Complexidade: **O(n²)**  
- Desempenho semelhante ao Bubble Sort, mas ligeiramente mais eficiente em casos quase ordenados.

### 4. Classe `FerramentasOrdenacao`
Contém métodos utilitários para:
- Copiar vetores antes da ordenação (garantindo independência entre execuções);
- Imprimir resultados no console e no arquivo de saída (`tabelas/saida_java.txt`).

### 5. Classe `Main`
Coordena a execução do programa:
1. Cria os três vetores de teste.  
2. Executa os três algoritmos sobre cada vetor.  
3. Gera a saída formatada com os resultados.

---

## Vetores Utilizados

```java
int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
```
