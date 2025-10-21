public class SelectionSort implements Ordenador {

    private void trocar(int[] vetor, int i, int j, Medidas medidas) {
        int temporario = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temporario;
        medidas.trocas++;
    }

    @Override
    public String obterNome() {
        return "Selection Sort";
    }

    @Override
    public Medidas ordenar(int[] vetor) {
        Medidas medidas = new Medidas();
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < tamanho; j++) {
                medidas.interacoes++;
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if (indiceMinimo != i) {
                trocar(vetor, i, indiceMinimo, medidas);
            }
        }
        return medidas;
    }
}
