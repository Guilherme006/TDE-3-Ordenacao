# Análise Comparativa de Algoritmos de Ordenação em Java

Este projeto implementa e compara seis algoritmos clássicos de ordenação em Java, medindo o desempenho com base em:

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

### `CombSort`
Otimização do Bubble Sort que compara elementos separados por uma distância (gap). O gap diminui a cada iteração, acelerando o processo em vetores grandes.
- **Complexidade:** O(n²), média próxima a O(n log n).
- **Destaque:** excelente desempenho médio, sendo mais rápido que Bubble e Cocktail.

### `GnomeSort`
Semelhante ao Insertion Sort, mas troca elementos adjacentes e “volta” sempre que há um elemento fora de ordem.
- **Complexidade:** O(n²).
- **Destaque:** implementação simples, boa didaticamente, mas menos eficiente.

### `BucketSort`
Versão adaptada baseada em contagem de frequência (Counting Sort). Conta quantas vezes cada número aparece e reescreve o vetor em ordem crescente.
- **Complexidade:** O(n + k), onde k é o intervalo de valores.
- **Destaque:** extremamente rápido quando os números estão em um intervalo pequeno.

### 4. Classe `FerramentasOrdenacao`
Contém métodos utilitários para:
- Copiar vetores antes da ordenação (garantindo independência entre execuções);
- Imprimir resultados no console e no arquivo de saída (`tabelas/saida_java.txt`).

### 5. Classe `Util`
Contém métodos auxiliares que são utilizados por todos os algoritmos.
- `copiarVetor(int[] origem, int[] destino, int tamanho)` → copia manualmente os elementos de um vetor para outro.
- `imprimirVetor(int[] vetor, int tamanho)` → imprime o conteúdo do vetor no console, formatado.
- `imprimirVetor(int[] vetor, int tamanho)` → imprime o conteúdo do vetor no console, formatado.

### 6. Classe `Execucao`
Responsável por executar os algoritmos de ordenação e exibir os resultados no console. Garante que cada algoritmo receba uma cópia independente do vetor original, evitando interferências entre execuções.

### 7. Classe `Main`
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
| -------------- | ------ | ---------- |
| Bubble Sort    | 78     | 180        |
| Selection Sort | 18     | 190        |
| Cocktail Sort  | 78     | 154        |
| Comb Sort      | 22     | 129        |
| Gnome Sort     | 78     | 175        |
| Bucket Sort    | 20     | 38         |

> 🥇 **Melhor resultado:** Bucket Sort (menor número total de operações, pois não compara elementos).
> 🥈 Comb Sort teve o melhor desempenho entre os algoritmos de comparação tradicionais.
> 🥉 Selection Sort ficou logo atrás, com pouquíssimas trocas.### Vetor 2 (ordenado)

### Vetor 2 (crescende)

| Algoritmo      | Trocas | Interações |
| -------------- | ------ | ---------- |
| Bubble Sort    | 0      | 19         |
| Selection Sort | 0      | 190        |
| Cocktail Sort  | 0      | 19         |
| Comb Sort      | 0      | 110        |
| Gnome Sort     | 0      | 19         |
| Bucket Sort    | 20     | 38         |

> 🥇 **Melhor resultado:** Bubble Sort, Cocktail Sort e Gnome Sort empataram (sem trocas e pouquíssimas interações).
> 🥈 Comb Sort manteve boa eficiência.Bucket Sort fez trocas por reescrita, mas sem comparações significativas.

### Vetor 3 (decrescente)

| Algoritmo      | Trocas | Interações |
| -------------- | ------ | ---------- |
| Bubble Sort    | 190    | 190        |
| Selection Sort | 10     | 190        |
| Cocktail Sort  | 190    | 190        |
| Comb Sort      | 18     | 129        |
| Gnome Sort     | 190    | 399        |
| Bucket Sort    | 20     | 38         |

> 🥇 **Melhor resultado:** Selection Sort (apenas 10 trocas no pior caso).
> 🥈 Comb Sort teve desempenho competitivo, com menos interações. Bucket Sort manteve eficiência estável por não depender da ordem inicial.

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

| Vetor   | Melhor Algoritmo                   | Justificativa                                   |
| ------- | ---------------------------------- | ----------------------------------------------- |
| Vetor 1 | **Bucket Sort** / Comb Sort        | Não depende da ordem e realiza menos operações. |
| Vetor 2 | **Bubble / Cocktail / Gnome Sort** | Nenhuma troca e poucas interações.              |
| Vetor 3 | **Selection Sort**                 | Pouquíssimas trocas no pior caso.               |


> **Conclusão final:**
> O Selection Sort foi o mais consistente entre os algoritmos de comparação.
> O Comb Sort apresentou excelente eficiência média.
> O Bucket Sort foi o mais rápido em geral, por não realizar comparações diretas.

## Desenvolvido por
**Guilherme Felippe Lazari**

**Curso:** Ciência da Computação – PUCPR

**Disciplina:** Resolução de Problemas Estruturados em Computação

**Professor:** Andrey Cabral Meira


