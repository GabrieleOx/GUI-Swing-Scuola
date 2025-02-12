import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Main{
    public static void main(String [] args){ // Se vuoi provare qualcosa scrivi nel main questo: Quiz();
    }

    public static void Quiz(){
        Question [] q = new Question[5];
        q[0] = new Question("Domanda 1:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 1);
        q[1] = new Question("Domanda 2:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 2);
        q[2] = new Question("Domanda 3:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 4);
        q[3] = new Question("Domanda 4:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 3);
        q[4] = new Question("Domanda 5:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 3);
        for(int j = 0; j < 5; j++)
            q[j].quiz();
        JDialog response = new JDialog((Frame) null, "Esito:", true);
        JLabel esito = new JLabel(Question.result()), titolo = new JLabel("Esito del quiz:");
        JButton back = new JButton("Back->Home");
        response.setResizable(false);
        esito.setFont(new Font("Verdana", Font.PLAIN, 17));
        titolo.setFont(new Font("Verdana", Font.BOLD, 30));
        back.setFont(new Font("Verdana", Font.BOLD, 12));
        response.setLayout(null);
        response.setSize(400, 350);
        response.getContentPane().setBackground(Color.ORANGE);
        response.add(titolo); response.add(esito); response.add(back);
        titolo.setBounds(70, 40, 300, 40);
        esito.setBounds(70, 110, 300, 130);
        back.setBounds(250, 240, 120, 40);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                response.dispose();
            }
        });
        response.setVisible(true);
    }
}