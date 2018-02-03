package Danil.chapter11;

import java.util.LinkedList;
import java.util.Queue;

public class Build {
    Queue<Command> makeQueue() {
        Queue<Command> queue = new LinkedList<Command>();
        for (int i = 0; i < 10; i++)
            queue.offer(new Command(i + " "));
        return queue;
    }
}
