import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Informazioni {
    static void showInfo(){
        JFrame fr = new JFrame("Info");
        fr.setSize(600, 600);
        fr.getContentPane().setBackground(new Color(255, 215, 77));
        final JLabel title = new JLabel("Informazioni sul volontario:"), testo = new JLabel();
        title.setFont(new Font("Verdana", Font.BOLD, 18));
        fr.setLayout(null);
        fr.setVisible(true);
        fr.add(title);
        title.setBounds(145, 30, 285, 20);
        JPanel pan = new JPanel();
        testo.setText("Lorem Ipsum, Lorem Ipsum Lorem Ipsum, Lorem Ipsum, Lorem Ipsum,\n Lorem Ipsum, Lorem Ipsum, Lorem Ipsum, Lorem Ipsum, Lorem Ipsum,\n Lorem Ipsum, Lorem Ipsum, Lorem Ipsum, Lorem Ipsum, Lorem Ipsum,\n Lorem Ipsum, Lorem Ipsum, Lorem Ipsum, Lorem Ipsum, Lorem Ipsum,\n Lorem Ipsum, Lorem Ipsum, Lorem Ipsum, Lorem Ipsum, Lorem Ipsum,\n Lorem Ipsum, Lorem Ipsum, Lorem Ipsum, Lorem Ipsum, Lorem Ipsum,\n Lorem Ipsum, Lorem Ipsum, Lorem Ipsum, Lorem Ipsum, ");
        pan.add(testo);
        fr.add(pan);
        pan.setBounds(80, 100, 400, 400);
        pan.setBackground(null);
    }
}
