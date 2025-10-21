import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        Ordenador[] algoritmos = {
                new BubbleSort(),
                new SelectionSort(),
                new CocktailSort()
        };

        String[] nomesConjuntos = {"vetor1", "vetor2", "vetor3"};
        int[][] conjuntos = {vetor1, vetor2, vetor3};

        PrintWriter escritor = null;
        try {
            File pasta = new File("tabelas");
            if (!pasta.exists()) pasta.mkdirs();
            File arquivo = new File(pasta, "saida_java.txt");
            escritor = new PrintWriter(new FileWriter(arquivo, false));
        } catch (IOException e) {
            System.out.println("Aviso: não foi possível abrir o arquivo de saída. Será impresso só no console.");
        }

        for (int i = 0; i < conjuntos.length; i++) {
            String cabecalho = "===== " + nomesConjuntos[i] + " =====";
            FerramentasOrdenacao.imprimirLinha(cabecalho, escritor);

            for (Ordenador algoritmo : algoritmos) {
                FerramentasOrdenacao.executarEImprimir(algoritmo, conjuntos[i], escritor);
            }

            FerramentasOrdenacao.imprimirLinha("====================================\n", escritor);
        }

        if (escritor != null) {
            escritor.close();
            System.out.println("Arquivo salvo em: tabelas/saida_java.txt");
        }
    }
}
