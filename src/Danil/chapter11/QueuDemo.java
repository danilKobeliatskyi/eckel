package danil.chapter11;

import java.util.*;

public class QueuDemo {
    public static void printQ(Queue queue){
        while (queue.peek() != null)
            System.out.print(queue.remove() + " ");
        System.out.println();
    }
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<Integer>();
        Random random = new Random(47);
        for (int i =0; i < 10; i++)
            queue.offer(random.nextInt(i + 10));
        printQ(queue);
        Queue<Character> qs =new LinkedList<Character>();
        for (char c : "Brontosaurus".toCharArray())
            qs.offer(c);
        printQ(qs);
    }
}
