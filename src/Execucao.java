public class Execucao {
    public static void executar(String nomeAlgoritmo, int algoritmoId, int[] vetorOriginal, int tamanho, int[] trabalho) {

        Util.copiarVetor(vetorOriginal, trabalho, tamanho);

        Medidas medidas = null;
        if (algoritmoId == 1) {
            medidas = BubbleSort.ordenar(trabalho, tamanho);
        } else if (algoritmoId == 2) {
            medidas = SelectionSort.ordenar(trabalho, tamanho);
        } else if (algoritmoId == 3) {
            medidas = CocktailSort.ordenar(trabalho, tamanho);
        } else if (algoritmoId == 4) {
            medidas = CombSort.ordenar(trabalho, tamanho);
        } else if (algoritmoId == 5) {
            medidas = GnomeSort.ordenar(trabalho, tamanho);
        } else if (algoritmoId == 6) {
            medidas = BucketSort.ordenarPorFrequencia(trabalho, tamanho);
        } else {
            System.out.println("Algoritmo desconhecido.");
            return;
        }

        System.out.println("Algoritmo: " + nomeAlgoritmo);
        System.out.print("Resultado ordenado: ");
        Util.imprimirVetor(trabalho, tamanho);
        System.out.println("Trocas: " + medidas.trocas + " | Interacoes: " + medidas.interacoes);
        System.out.println();
    }
}
