import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // do próprio java
        Stack<String> stack = new Stack<String>();
        stack.push("prato 1");
        stack.push("prato 2");
        stack.push("prato 3");
        System.out.println(stack.pop() + " retirado");
        System.out.println("Topo: " + stack.peek());

        // da classe Pilha
        Pilha pilha = new Pilha(3);
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        // pilha.push(4); vai dar erro
        System.out.println(pilha.pop() + " retirado");
        System.out.println("Topo: " + pilha.peek());
    }
}