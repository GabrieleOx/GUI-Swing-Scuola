import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

//https://www.tpointtech.com/java-swing

public class Informazioni {
    static void showInfo(){
        JFrame fr = new JFrame("Info");
        fr.setSize(600, 600);
        fr.getContentPane().setBackground(new Color(255, 215, 77));
        final JLabel title = new JLabel("Informazioni sul volontario:"), imm = new JLabel(new ImageIcon("sfondo-grigio.jpg")), text = new JLabel(//
                        "<html><ol>\r\n" + //
                        "<li>primo elemento</li>\r\n" + //
                        "<li>secondo elemento</li>\r\n" + //
                        "<li>terzo elemento</li>\r\n" + //
                        "<li>quarto elemento</li>\r\n" + //
                        "<li>quinto elemento</li>\r\n" + //
                        "<li>sesto elemento</li>\r\n" + //
                        "</ol></html>");
        title.setFont(new Font("Verdana", Font.BOLD, 24));
        text.setFont(new Font("Verdana", Font.BOLD, 15));
        fr.setLayout(null);
        fr.setVisible(true);
        fr.add(title);
        title.setBounds(110, 30, 375, 20);
        text.setAlignmentX(-60);
        JPanel pan = new JPanel(), pan2 = new JPanel();
        pan.add(imm);
        pan2.add(text);
        fr.add(pan);
        fr.add(pan2);
        pan2.setBounds(80, 100, 200, 400);
        pan.setBounds(300, 100, 200, 400);
        pan.setBackground(null);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
