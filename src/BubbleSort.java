public class BubbleSort implements Ordenador {

    private void trocar(int[] vetor, int i, int j, Medidas medidas) {
        int temporario = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temporario;
        medidas.trocas++;
    }

    @Override
    public String obterNome() {
        return "Bubble Sort";
    }

    @Override
    public Medidas ordenar(int[] vetor) {
        Medidas medidas = new Medidas();
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho; i++) {
            boolean houveTroca = false;
            for (int j = 0; j < tamanho - i - 1; j++) {
                medidas.interacoes++;
                if (vetor[j] > vetor[j + 1]) {
                    trocar(vetor, j, j + 1, medidas);
                    houveTroca = true;
                }
            }
            if (!houveTroca) break;
        }
        return medidas;
    }
}
