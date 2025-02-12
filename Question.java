import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Question {
    int quiz(String domanda, String p1, String p2, String p3, String p4){
        JFrame dom = new JFrame();
        JLabel title = new JLabel(domanda);
        dom.setSize(600, 600);
        dom.add(title);
        title.setBounds(100, 30, 300, 40);
        title.setFont(new Font("Verdana", Font.BOLD, 24));
        dom.setLayout(null);
        dom.getContentPane().setBackground(Color.CYAN);
        dom.setVisible(true);
        dom.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        return 0;
    }
}
