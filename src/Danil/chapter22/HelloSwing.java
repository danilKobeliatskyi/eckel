package Danil.chapter22;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class HelloSwing {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Hello Swing");
        JLabel label =new JLabel("A label");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        TimeUnit.SECONDS.sleep(1);
        label.setText("Hey! Hello");
        label.setText("second note");
        label.setText("third note");
    }
}
