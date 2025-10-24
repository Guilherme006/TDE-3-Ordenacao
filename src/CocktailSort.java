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
