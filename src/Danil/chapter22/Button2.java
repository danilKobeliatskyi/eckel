package Danil.chapter22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Danil.chapter22.SwingConsole.*;

public class Button2 extends JFrame{
    private JButton
            b1 = new JButton("Button1"),
            b2 = new JButton("Button2"),
            b3 = new JButton("Button3");
    private JTextField txt = new JTextField(10);

    private ActionListener bllll = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name =((JButton)e.getSource()).getText();
            txt.setText(name);
        }
    };

    public Button2(){
        b1.addActionListener(bllll);
        b2.addActionListener(bllll);
        b3.addActionListener(bllll);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(b3);
        add(txt);
    }
    public static void main(String[] args){
        run(new Button2(), 200, 150);
    }
}
