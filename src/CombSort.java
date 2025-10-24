public class CombSort {
    public static Medidas ordenar(int[] vetor, int tamanho) {
        Medidas medidas = new Medidas();
        int distancia = tamanho;
        boolean houveTroca = true;

        while (distancia > 1 || houveTroca) {
            distancia = (distancia * 10) / 13;
            if (distancia < 1) distancia = 1;
            if (distancia == 9 || distancia == 10) distancia = 11;
            houveTroca = false;

            int i = 0;
            while (i + distancia < tamanho) {
                medidas.interacoes = medidas.interacoes + 1;
                if (vetor[i] > vetor[i + distancia]) {
                    Util.trocar(vetor, i, i + distancia, medidas);
                    houveTroca = true;
                }
                i = i + 1;
            }
        }
        return medidas;
    }
}
