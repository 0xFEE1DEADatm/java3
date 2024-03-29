import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int numOperations = 1000; // количество операций для тестирования

        // ArrayList performance test
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < numOperations; i++) {
            arrayList.get(i);
        }
        for (int i = 0; i < numOperations; i++) {
            arrayList.remove(0);
        }
        long endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;

        // LinkedList performance test
        LinkedList<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            linkedList.add(i);
        }
        for (int i = 0; i < numOperations; i++) {
            linkedList.get(i);
        }
        for (int i = 0; i < numOperations; i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        long linkedListTime = endTime - startTime;

        // Вывод результатов
        System.out.println("Метод\t\t\tКоличество вызовов\tВремя выполнения (нс)");
        System.out.println("ArrayList.add\t\t" + numOperations + "\t\t\t" + arrayListTime);
        System.out.println("ArrayList.get\t\t" + numOperations + "\t\t\t" + arrayListTime);
        System.out.println("ArrayList.remove\t" + numOperations + "\t\t\t" + arrayListTime);
        System.out.println("LinkedList.add\t\t" + numOperations + "\t\t\t" + linkedListTime);
        System.out.println("LinkedList.get\t\t" + numOperations + "\t\t\t" + linkedListTime);
        System.out.println("LinkedList.remove\t" + numOperations + "\t\t\t" + linkedListTime);
    }
}
