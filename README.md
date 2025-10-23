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

## Resultados Obtidos
A execução do código gerou o arquivo `saida_java.txt`, com os seguintes resultados consolidados:

### Vetor 1 (desordenado)

| Algoritmo      | Trocas | Interações |
|:---------------:|:------:|:-----------:|
| Bubble Sort    | 78     | 180        |
| Selection Sort | 18     | 190        |
| Cocktail Sort  | 78     | 154        |

> **Melhor resultado:** Selection Sort (menos trocas, custo de interação aceitável).

### Vetor 2 (ordenado)

|    Algoritmo   | Trocas | Interações |
| :------------: | :----: | :--------: |
|   Bubble Sort  |    0   |     19     |
| Selection Sort |    0   |     190    |
|  Cocktail Sort |    0   |     19     |

> **Melhor resultado:** Bubble Sort e Cocktail Sort empataram, pois nenhum precisou trocar elementos (apenas realizaram comparações mínimas).

### Vetor 3 (decrescente)

| Algoritmo      | Trocas | Interações |
| -------------- | ------ | ---------- |
| Bubble Sort    | 190    | 190        |
| Selection Sort | 10     | 190        |
| Cocktail Sort  | 190    | 190        |

> **Melhor resultado:** Selection Sort, pois fez apenas 10 trocas (contra 190 dos demais).

## Análise dos Resultados

### Bubble Sort
- Simples, mas ineficiente em vetores grandes ou desordenados.
- Quando o vetor já está ordenado, se destaca pela quantidade reduzida de iterações.

### Selection Sort
- Consistente: sempre faz o mesmo número de comparações, mas com poucas trocas.
- Melhor desempenho geral nos vetores desordenado e decrescente.

### Cocktail Sort
- Pouco mais otimizado que o Bubble Sort em alguns cenários.
- Igualou o desempenho do Bubble Sort no vetor já ordenado.

## Conclusão Geral

| Vetor   | Melhor Algoritmo  | Justificativa                    |
| ------- | ----------------- | -------------------------------- |
| Vetor 1 | Selection Sort    | Menor número de trocas (18)      |
| Vetor 2 | Bubble / Cocktail | Nenhuma troca e menos interações |
| Vetor 3 | Selection Sort    | Muito menos trocas (10)          |

> **Conclusão final:** O Selection Sort apresentou o melhor desempenho médio entre os três algoritmos, com destaque para a baixa quantidade de trocas mesmo que tenha mantido o mesmo número de interações nos três casos.

## Desenvolvido por
**Guilherme Felippe Lazari**
**Curso:** Ciência da Computação – PUCPR
**Disciplina:** Resolução de Problemas Estruturados em Computação
**Professor:** Andrey Cabral Meira


