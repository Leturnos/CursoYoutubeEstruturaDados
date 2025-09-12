package arvore;

public class Arvore {
    private Folha folha;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore() {
        this.folha = null;
        this.esquerda = null;
        this.direita = null;
    }

    public Arvore (Folha folha) {
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }

    public boolean isEmpty () {
        return this.folha == null;
    }

    public void inserir(Folha novo) {
        if (isEmpty()) {
            this.folha = novo; // criando o nó raiz
        }
        else {
            Arvore novaArvore = new Arvore(novo);
            if (novo.getValor() < this.folha.getValor()) {
                if (this.esquerda == null){
                    this.esquerda = novaArvore;
                    System.out.println("folha " + novo.getValor() + " criada à esquerda de " + this.folha.getValor());
                }
                else {
                    this.esquerda.inserir(novo);
                }
            }
            else if (novo.getValor() > this.folha.getValor()){
                if (this.direita == null) {
                    this.direita = novaArvore;
                    System.out.println("folha " + novo.getValor() + " criada à direita de " + this.folha.getValor());
                }
                else {
                    this.direita.inserir(novo);
                }
            }
        }
    }
}

