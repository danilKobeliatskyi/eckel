package danil.chapter11;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args){
    QueuDemo queuDemo = new QueuDemo();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i <10; i++)
            priorityQueue.offer(rand.nextInt(i + 10));
        queuDemo.printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<Integer>(ints);
        queuDemo.printQ(priorityQueue);
        priorityQueue = new PriorityQueue<Integer>(
                ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        queuDemo.printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(" "));
        PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
        queuDemo.printQ(stringPQ);
        stringPQ = new PriorityQueue<String>(
                strings.size(), Collections.reverseOrder());
        queuDemo.printQ(stringPQ);

        Set<Character> charSet = new HashSet<Character>();
        for (char c : fact.toCharArray())
            charSet.add(c);
        PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(charSet);
        queuDemo.printQ(characterPQ);

        PriorityQueue<Double> d = new PriorityQueue<Double>();
        for(int i = 0; i < 10; i++)
            d.offer(rand.nextDouble() * i);
        while(d.peek() != null)
            System.out.print(d.poll() + " ");

        PriorityQueue<SimpleClass> simpleClasses = new PriorityQueue<SimpleClass>();
        //simpleClasses.offer(new SimpleClass());  Cant add even 1 object...
    }
}
