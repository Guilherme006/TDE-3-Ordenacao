public class CocktailSort implements Ordenador {

    private void trocar(int[] vetor, int i, int j, Medidas medidas) {
        int temporario = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temporario;
        medidas.trocas++;
    }

    @Override
    public String obterNome() {
        return "Cocktail Sort";
    }

    @Override
    public Medidas ordenar(int[] vetor) {
        Medidas medidas = new Medidas();
        int inicio = 0;
        int fim = vetor.length - 1;
        boolean houveTroca = true;

        while (houveTroca) {
            houveTroca = false;
            for (int i = inicio; i < fim; i++) {
                medidas.interacoes++; // comparação esquerda → direita
                if (vetor[i] > vetor[i + 1]) {
                    trocar(vetor, i, i + 1, medidas);
                    houveTroca = true;
                }
            }
            if (!houveTroca) break;

            houveTroca = false;
            fim--;

            for (int i = fim - 1; i >= inicio; i--) {
                medidas.interacoes++; // comparação direita → esquerda
                if (vetor[i] > vetor[i + 1]) {
                    trocar(vetor, i, i + 1, medidas);
                    houveTroca = true;
                }
            }
            inicio++;
        }
        return medidas;
    }
}
