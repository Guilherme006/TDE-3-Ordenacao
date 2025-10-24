public class CocktailSort {
    public static Medidas ordenar(int[] vetor, int tamanho) {
        Medidas medidas = new Medidas();
        int inicio = 0;
        int fim = tamanho - 1;
        boolean houveTroca = true;

        while (houveTroca) {
            houveTroca = false;
            int i = inicio;
            while (i < fim) {
                medidas.interacoes = medidas.interacoes + 1;
                if (vetor[i] > vetor[i + 1]) {
                    Util.trocar(vetor, i, i + 1, medidas);
                    houveTroca = true;
                }
                i = i + 1;
            }
            if (!houveTroca) {
                break;
            }
            houveTroca = false;
            fim = fim - 1;

            i = fim - 1;
            while (i >= inicio) {
                medidas.interacoes = medidas.interacoes + 1;
                if (vetor[i] > vetor[i + 1]) {
                    Util.trocar(vetor, i, i + 1, medidas);
                    houveTroca = true;
                }
                i = i - 1;
            }
            inicio = inicio + 1;
        }
        return medidas;
    }
}
