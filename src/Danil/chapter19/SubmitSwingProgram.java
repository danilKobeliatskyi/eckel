package Danil.chapter19;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class SubmitSwingProgram extends JFrame {
    static SubmitSwingProgram ssp;

    public static void main(String[] args) throws Exception {
    SwingConsole console = new SwingConsole();
    JFrame frame = new JFrame();
        console.run(frame, 300, 300);
        JLabel label = new JLabel("A label");
        frame.add(label);
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                label.setText("Hey! Hello");
            }
        });
    }
}
