package heap;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Tarefa> filaTarefa = new PriorityQueue<Tarefa>();
        filaTarefa.add(new Tarefa("Responder dúvidas",3));
        filaTarefa.add(new Tarefa("Corrigir bugs", 2));
        filaTarefa.add(new Tarefa("Formatar o computador", 1));

        System.out.println("Tarefas por ordem de prioridade");
        while (!filaTarefa.isEmpty()){
            System.out.println(filaTarefa.poll());
        }
    }
}
