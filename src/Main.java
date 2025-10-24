public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        int tamanho = 20;
        int[] trabalho = new int[tamanho];

        System.out.println("===== vetor1 =====");
        Execucao.executar("Bubble Sort",   1, vetor1, tamanho, trabalho);
        Execucao.executar("Selection Sort",2, vetor1, tamanho, trabalho);
        Execucao.executar("Cocktail Sort", 3, vetor1, tamanho, trabalho);
        Execucao.executar("Comb Sort",     4, vetor1, tamanho, trabalho);
        Execucao.executar("Gnome Sort",    5, vetor1, tamanho, trabalho);
        Execucao.executar("Bucket Sort",   6, vetor1, tamanho, trabalho);
        System.out.println("====================================\n");

        System.out.println("===== vetor2 =====");
        Execucao.executar("Bubble Sort",   1, vetor2, tamanho, trabalho);
        Execucao.executar("Selection Sort",2, vetor2, tamanho, trabalho);
        Execucao.executar("Cocktail Sort", 3, vetor2, tamanho, trabalho);
        Execucao.executar("Comb Sort",     4, vetor2, tamanho, trabalho);
        Execucao.executar("Gnome Sort",    5, vetor2, tamanho, trabalho);
        Execucao.executar("Bucket Sort",   6, vetor2, tamanho, trabalho);
        System.out.println("====================================\n");

        System.out.println("===== vetor3 =====");
        Execucao.executar("Bubble Sort",   1, vetor3, tamanho, trabalho);
        Execucao.executar("Selection Sort",2, vetor3, tamanho, trabalho);
        Execucao.executar("Cocktail Sort", 3, vetor3, tamanho, trabalho);
        Execucao.executar("Comb Sort",     4, vetor3, tamanho, trabalho);
        Execucao.executar("Gnome Sort",    5, vetor3, tamanho, trabalho);
        Execucao.executar("Bucket Sort",   6, vetor3, tamanho, trabalho);
        System.out.println("====================================\n");
    }
}
