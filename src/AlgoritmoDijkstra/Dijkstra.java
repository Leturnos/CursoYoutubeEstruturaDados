package AlgoritmoDijkstra;

import java.security.InvalidParameterException;
import java.util.*;

public class Dijkstra {
    private int[][] vertices;

    public Dijkstra(final int numVertices) {
        vertices = new int[numVertices][numVertices];
    }

    public void criarAresta(final int noOrigem, final int noDestino, final int peso) {
        if (peso >= 1) {
            vertices[noOrigem][noDestino] = peso;
            vertices[noDestino][noOrigem] = peso;
        }
        else {
            throw new InvalidParameterException("peso inválido");
        }
    }

    private int getMaisProximo(final int listaCustos[], final Set<Integer> naoVisitados) {
        int minDistancia = Integer.MAX_VALUE;
        int noProximo = 0;
        for (Integer i : naoVisitados) {
            if (listaCustos[i] < minDistancia) {
                minDistancia = listaCustos[i];
                noProximo = i;
            }
        }
        return noProximo;
    }

    private List<Integer> getVizinhos(final int no) {
        List<Integer> vizinhos = new ArrayList<Integer>();
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[no][i] > 0) {
                vizinhos.add(i);
            }
        }
        return vizinhos;
    }

    private int getCusto(final int noOrigem, final int noDestino) {
        return vertices[noOrigem][noDestino];
    }

    public List<Integer> caminhoMinimo(final int noOrigem, final int noDestino) {
        int custo[] = new int[vertices.length];
        int antecessor[] = new int [vertices.length];
        Set<Integer> naoVisitado = new HashSet<Integer>();

        custo[noOrigem] = 0;

        // para todo valor tirando a origem, deixa o peso infinito
        for (int v = 0; v < vertices.length; v++) {
            if (v != noOrigem) {
                custo[v] = Integer.MAX_VALUE;
            }
            antecessor[v] = -1;
            naoVisitado.add(v);
        }
        while (!naoVisitado.isEmpty()) {
            int noMaisProximo = getMaisProximo(custo, naoVisitado);
            naoVisitado.remove(noMaisProximo);

            for (Integer vizinhos : getVizinhos(noMaisProximo)) {
                int custoTotal = custo[noMaisProximo] + getCusto(noMaisProximo, vizinhos);
                if (custoTotal < custo[vizinhos]) {
                    custo[vizinhos] = custoTotal;
                    antecessor[vizinhos] = noMaisProximo;
                }
            }
            if (noMaisProximo == noDestino) {
                return caminhoMaisProximo(antecessor, noMaisProximo);
            }
        }
        return null;
    }

    public List<Integer> caminhoMaisProximo(final int antecessor[], int noMaisProximo) {
        List<Integer> caminho = new ArrayList<Integer>();
        caminho.add(noMaisProximo);

        while (antecessor[noMaisProximo] != -1) {
            caminho.add(antecessor[noMaisProximo]);
            noMaisProximo = antecessor[noMaisProximo];
        }
        Collections.reverse(caminho);
        return caminho;
    }
}
