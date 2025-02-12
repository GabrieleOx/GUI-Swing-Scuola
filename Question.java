import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Question {
    private static ArrayList<Boolean> risposte = new ArrayList<Boolean>();
    private String domanda;
    private String [] p = new String[4];
    private int correct;
    private boolean result = false;

    public static String result(){
        double perc;
        int corrette = 0;
        for(boolean x : risposte)
            if(x)
                corrette++;
        perc = (corrette * 100) / risposte.size();
        if(perc <= 33)
            return "La tua conoscenza riguardo l'opera dei volontari e' scarsa,<br>\r\n" + //
                   "sfrutta questo strumento per incrementarla :)";
        else if(perc <= 66)
            return "La tua conoscenza riguardo l'opera dei volontari e' buona,<br>\r\n" + //
                   "considera l'idea di contribuire attivamente :) :]";
        else
            return "La tua conoscenza riguardo l'opera dei volontari e' perfetta,<br>\r\n" + //
                   "sicuramente sei gia' un volontario, per questo<br>\r\n" + // 
                   "ti ringraziamo vivamente :) :] :}";
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

    void quiz(){
        JDialog dom = new JDialog((Frame) null, "Quiz", true);
        JLabel title = new JLabel(this.domanda), error = new JLabel("*Devi selezionare almeno un campo*");
        JCheckBox [] ch = new JCheckBox[4];
        for(int j = 0; j < 4; j++)
            ch[j] = new JCheckBox(p[j]);
        JPanel pann = new JPanel();
        JButton send = new JButton("Conferma");
        pann.setLayout(new BoxLayout(pann, BoxLayout.Y_AXIS));
        dom.add(title);
        for(int j = 0; j < 4; j++){
            pann.add(ch[j]);
            pann.add(Box.createRigidArea(new Dimension(0, 35)));
        }
        pann.add(error);
        error.setVisible(false);
        dom.add(pann);
        dom.add(send);
        pann.setBounds(100, 140, 450, 300);
        dom.setSize(600, 600);
        title.setBounds(80, 30, 500, 40);
        title.setFont(new Font("Verdana", Font.BOLD, 32));
        error.setFont(new Font("Verdana", Font.BOLD, 13));
        error.setForeground(Color.RED);
        for(int j = 0; j < 4; j++){
            ch[j].setFont(new Font("Verdana", Font.PLAIN, 20));
            final int x = j;
            ch[j].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(ch[x].isSelected())
                        for(int i = 0; i < 4; i++)
                            if(i != x)
                                ch[i].setSelected(false);
                    checkCorr(x);
                }
            });
        }
        send.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                boolean continua = false;
                for(int j = 0; j < 4; j++)
                    if(ch[j].isSelected())
                        continua = true;
                if(continua){
                    risposte.add(result);
                    dom.dispose();
                }else {
                    error.setVisible(true);
                }
            }
        });
        send.setBounds(400, 470, 150, 60);
        send.setFont(new Font("Verdana", Font.BOLD, 18));
        dom.getContentPane().setBackground(Color.CYAN);
        dom.setLayout(null);
        dom.setVisible(true);
    }

    private void checkCorr(int current){
        this.result = (current + 1) == this.correct;
    }
}
