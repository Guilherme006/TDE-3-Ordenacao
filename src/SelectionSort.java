public class SelectionSort {
    public static Medidas ordenar(int[] vetor, int tamanho) {
        Medidas medidas = new Medidas();
        int i = 0;
        while (i < tamanho) {
            int indiceMinimo = i;
            int j = i + 1;
            while (j < tamanho) {
                medidas.interacoes = medidas.interacoes + 1;
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
                j = j + 1;
            }
            if (indiceMinimo != i) {
                Util.trocar(vetor, i, indiceMinimo, medidas);
            }
            i = i + 1;
        }
        return medidas;
    }
}
