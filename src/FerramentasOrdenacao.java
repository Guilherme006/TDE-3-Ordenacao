import java.io.PrintWriter;
import java.util.Arrays;

public class FerramentasOrdenacao {

    public static int[] copiarVetor(int[] vetor) {
        return Arrays.copyOf(vetor, vetor.length);
    }

    public static void executarEImprimir(Ordenador algoritmo, int[] vetorOriginal) {
        executarEImprimir(algoritmo, vetorOriginal, null);
    }

    public static void executarEImprimir(Ordenador algoritmo, int[] vetorOriginal, PrintWriter escritor) {
        int[] vetor = copiarVetor(vetorOriginal);
        Medidas medidas = algoritmo.ordenar(vetor);

        String l1 = "Algoritmo: " + algoritmo.obterNome();
        String l2 = "Resultado ordenado: " + Arrays.toString(vetor);
        String l3 = "Trocas: " + medidas.trocas + " | Interacoes: " + medidas.interacoes;
        String l4 = "";

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        if (escritor != null) {
            escritor.println(l1);
            escritor.println(l2);
            escritor.println(l3);
            escritor.println(l4);
            escritor.flush();
        }
    }

    public static void imprimirLinha(String texto, PrintWriter escritor) {
        System.out.println(texto);
        if (escritor != null) {
            escritor.println(texto);
            escritor.flush();
        }
    }
}
