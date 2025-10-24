public class BucketSort {
    public static Medidas ordenarPorFrequencia(int[] vetor, int tamanho) {
        Medidas medidas = new Medidas();

        int minimo = vetor[0];
        int maximo = vetor[0];
        int i = 1;
        while (i < tamanho) {
            medidas.interacoes = medidas.interacoes + 1;
            if (vetor[i] < minimo) {
                minimo = vetor[i];
            }
            medidas.interacoes = medidas.interacoes + 1;
            if (vetor[i] > maximo) {
                maximo = vetor[i];
            }
            i = i + 1;
        }

        int intervalo = maximo - minimo + 1;
        if (intervalo < 1) intervalo = 1;

        int[] frequencia = new int[intervalo];
        i = 0;
        while (i < intervalo) {
            frequencia[i] = 0;
            i = i + 1;
        }

        i = 0;
        while (i < tamanho) {
            int indice = vetor[i] - minimo;
            frequencia[indice] = frequencia[indice] + 1;
            i = i + 1;
        }

        int k = 0;
        int valor = 0;
        while (valor < intervalo) {
            int cont = frequencia[valor];
            while (cont > 0) {
                vetor[k] = valor + minimo;
                medidas.trocas = medidas.trocas + 1;
                k = k + 1;
                cont = cont - 1;
            }
            valor = valor + 1;
        }

        return medidas;
    }
}
