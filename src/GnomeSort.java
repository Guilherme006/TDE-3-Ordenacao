public class GnomeSort {
    public static Medidas ordenar(int[] vetor, int tamanho) {
        Medidas medidas = new Medidas();
        int i = 1;
        while (i < tamanho) {
            medidas.interacoes = medidas.interacoes + 1;
            if (i == 0 || vetor[i] >= vetor[i - 1]) {
                i = i + 1;
            } else {
                Util.trocar(vetor, i, i - 1, medidas);
                i = i - 1;
            }
        }
        return medidas;
    }
}
