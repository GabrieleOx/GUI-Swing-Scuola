import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Question {
    private String domanda;
    private String [] p = new String[4];
    private int correct;
    private boolean result = false;

    public void checkCorr(int current){
        if((current+1) == this.correct)
            this.result = true;
        else
            this.result = false;
    }
    
    public String getDomanda() {
        return domanda;
    }

    public void setDomanda(String domanda) {
        this.domanda = domanda;
    }

    public String[] getP() {
        return p;
    }

    public void setP(String[] p) {
        this.p = p;
    }

    public void setP(String p1, String p2, String p3, String p4){
        this.p[0] = p1;
        this.p[1] = p2;
        this.p[2] = p3;
        this.p[3] = p4;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public Question(String domanda, String[] p, int correct) {
        this.domanda = domanda;
        this.p = p;
        this.correct = correct;
    }

    public Question(String domanda, String p1, String p2, String p3, String p4, int correct){
        this.domanda = domanda;
        this.p[0] = p1;
        this.p[1] = p2;
        this.p[2] = p3;
        this.p[3] = p4;
        this.correct = correct;
    }

    boolean quiz(){
        JFrame dom = new JFrame("Quiz");
        JLabel title = new JLabel(this.domanda);
        JCheckBox [] ch = new JCheckBox[4];
        for(int j = 0; j < 4; j++)
            ch[j] = new JCheckBox(p[j]);
        JPanel pann = new JPanel();
        JButton send = new JButton("Conferma");
        pann.setLayout(new BoxLayout(pann, BoxLayout.Y_AXIS));
        dom.add(title);
        for(int j = 0; j < 4; j++){
            pann.add(ch[j]);
            pann.add(Box.createRigidArea(new Dimension(0, 40)));
        }
        dom.add(pann);
        dom.add(send);
        pann.setBounds(100, 140, 450, 300);
        dom.setSize(600, 600);
        title.setBounds(80, 30, 500, 40);
        title.setFont(new Font("Verdana", Font.BOLD, 32));
        for(int j = 0; j < 4; j++)
            ch[j].setFont(new Font("Verdana", Font.PLAIN, 20));
        for(int j = 0; j < 4; j++){
            final int x = j;
            ch[j].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(ch[x].isSelected())
                        for(int i = 0; i < 4; i++)
                            if(i != x)
                                ch[i].setSelected(false);
                    this.checkCorr(x);
                }
            });
        }
        send.setBounds(400, 470, 150, 60);
        send.setFont(new Font("Verdana", Font.BOLD, 18));
        dom.getContentPane().setBackground(Color.CYAN);
        dom.setLayout(null);
        dom.setVisible(true);
        dom.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        return 0;
    }
}
