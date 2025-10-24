public class Util {

    public static void copiarVetor(int[] origem, int[] destino, int tamanho) {
        int i = 0;
        while (i < tamanho) {
            destino[i] = origem[i];
            i = i + 1;
        }
    }

    public static void imprimirVetor(int[] vetor, int tamanho) {
        System.out.print("[");
        int i = 0;
        while (i < tamanho) {
            System.out.print(vetor[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
            i = i + 1;
        }
        System.out.println("]");
    }

    public static void trocar(int[] vetor, int i, int j, Medidas medidas) {
        int temporario = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temporario;
        medidas.trocas = medidas.trocas + 1;
    }
}
