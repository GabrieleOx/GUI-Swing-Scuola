import java.awt.*;
import javax.swing.*;

class Main{
    public static void main(String [] args){
        //Informazioni.showInfo();
        //Testimonianze.showInfo();
        Question x = new Question("Domanda 1:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 0);
        x.quiz();
        Question y = new Question("Domanda 2:", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", "lorem Ipsum lorem Ipsum", 0);
        y.quiz();
        //System.out.println("Le risposte date sono: " + Question.getRDate()); Era solo di test
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
        esito.setFont(new Font("Verdana", Font.PLAIN, 20));
    }
}