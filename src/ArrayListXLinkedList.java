import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListXLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkList = new LinkedList<Integer>();

        for (int i = 0; i < 1_000_000; i++){
            arrayList.add(i);
            linkList.add(i);
        }

        long inicioArray = System.currentTimeMillis();

        for (int i = 0; i < 1_000; i++){
           arrayList.get(i*100);
        }

        long fimArray = System.currentTimeMillis();

        System.out.println("Tempo do arrayList: " + (fimArray-inicioArray) + "ms");

        long inicioLinked = System.currentTimeMillis();

        for (int i = 0; i < 1_000; i++){
            linkList.get(i*100);
        }

        long fimLinked = System.currentTimeMillis();

        System.out.println("Tempo do linkedList: " + (fimLinked-inicioLinked) + "ms");

    }
}
