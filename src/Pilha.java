public class Pilha {
    private int[] dados;
    private int topo;

    public Pilha(int capacidade){
        dados = new int[capacidade];
        topo = -1; // pilha vazia
    }

    public void push(int valor) {
        if (topo == dados.length-1) {
            throw new RuntimeException("Overflow");

        }
        dados[++topo] = valor;
    }

    public int pop(){
        if (topo == -1) {
            throw new RuntimeException("Underflow");
        }
        return dados[topo--];
    }

    public int peek() {
        return dados[topo];
    }
}
