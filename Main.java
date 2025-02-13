import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main{
    public static void main(String [] args){ // Se vuoi provare qualcosa scrivi nel main questo: Quiz();
        while(Home());
        Grazie();
    }

    public static void Grazie(){
        JDialog thanks = new JDialog((Frame) null, "Grazie", true);
        JLabel ringr = new JLabel(), cuore = new JLabel(new ImageIcon("cuore.png"));
        ringr.setText("<html>Grazie per aver sostenuto tutto il lavoro svolto dai volontari<br>" + //
                        "per la comunita', speriamo di averti accanto a noi al piu' presto</html>");
        thanks.setSize(400, 300);
        thanks.getContentPane().setBackground(new Color(102, 102, 255));
        thanks.setResizable(false);
        thanks.add(ringr); thanks.add(cuore);
        ringr.setBounds(75, 25, 280, 180);
        ringr.setFont(new Font("Verdana", Font.BOLD, 18));
        cuore.setBounds(270, 80, 130, 130);
        thanks.setVisible(true);
    }

    public static boolean Home(){ // qui mettiamo la schermata home, ritornerà false solo qundo si vuole uscire...
        return false;
    }

    public static void Quiz(){
        Question [] q = new Question[20]; //Le venti domande del quiz da settare:
        q[0] = new Question("Domanda 1:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 1);
        q[1] = new Question("Domanda 2:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 2);
        q[2] = new Question("Domanda 3:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 4);
        q[3] = new Question("Domanda 4:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 3);
        q[4] = new Question("Domanda 5:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 3);
        for(int j = 0; j < 5; j++) //5 solo per test
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