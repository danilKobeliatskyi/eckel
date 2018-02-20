package danil.chapter11;

import java.util.Queue;

public class Queues {
    public static void commandEater(Queue<Command> qc) {
        while (qc.peek() != null)
            qc.poll().operation();
    }
    Queues() {
        Build b = new Build();
        commandEater(b.makeQueue());
    }
}
