import java.util.HashMap;

public class ArrayXHashmap {

    private static final int TAM = 100000;

    public static void main(String[] args) {
        // array
        long[] array = new long[TAM];

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < TAM; i++){
            for (int j = 0; j < TAM; j++){
                array[i] += j;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo gasto:" + (endTime - startTime) + "ms");

        //hashmap
        HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>();

        for (int i = 1; i <= TAM; i++){
            mapa.put(i, new Produto(i, "Produto" + i, i*20.00));
        }

        long startTime2 = System.currentTimeMillis();

        for (int qtd = 0; qtd < TAM; qtd++) {
            Produto p = mapa.get(qtd);
        }

        long endTime2 = System.currentTimeMillis();

        System.out.println("Tempo gasto:" + (endTime2 - startTime2) + "ms");

    }
}
