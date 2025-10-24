public class BubbleSort {
    public static Medidas ordenar(int[] vetor, int tamanho) {
        Medidas medidas = new Medidas();
        int i = 0;
        while (i < tamanho) {
            boolean houveTroca = false;
            int j = 0;
            while (j < (tamanho - i - 1)) {
                medidas.interacoes = medidas.interacoes + 1;
                if (vetor[j] > vetor[j + 1]) {
                    Util.trocar(vetor, j, j + 1, medidas);
                    houveTroca = true;
                }
                j = j + 1;
            }
            if (!houveTroca) {
                break;
            }
            i = i + 1;
        }
        return medidas;
    }
}
