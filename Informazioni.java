import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

//https://www.tpointtech.com/java-swing

public class Informazioni {
    static void showInfo(){
        JFrame fr = new JFrame("Info");    // ||-> per mettere gli oggetti al suo interno tutti a sinistra
        JPanel pan1 = new JPanel(new FlowLayout(FlowLayout.LEFT)), pan2 = new JPanel();
        final JLabel title = new JLabel("Informazioni sul volontario:"), imm = new JLabel(new ImageIcon("sfondo-grigio.jpg")), text = new JLabel();
        fr.setSize(800, 600);
        fr.setResizable(false);
        fr.getContentPane().setBackground(new Color(255, 215, 77));
        text.setText(//
            "<html><ol>\r\n" + //
            "Esempio di titoletto:<br><br>\r\n" + //
            "<li>primo elemento<br>\r\n" + //
                "lorem Ipsum lorem Ipsum lorem Ipsum lorem Ipsum<br>\r\n" + //
                "lorem Ipsum lorem Ipsum lorem Ipsum lorem Ipsum</li>\r\n" + //
            "<li>secondo elemento<br>\r\n" + //
                "lorem Ipsum lorem Ipsum lorem Ipsum lorem Ipsum<br>\r\n" + //
                "lorem Ipsum lorem Ipsum lorem Ipsum lorem Ipsum</li>\r\n" + //
            "<li>terzo elemento<br>\r\n" + //
                "lorem Ipsum lorem Ipsum lorem Ipsum lorem Ipsum<br>\r\n" + //
                "lorem Ipsum lorem Ipsum lorem Ipsum lorem Ipsum</li>\r\n" + //
            "<li>quarto elemento<br>\r\n" + //
                "lorem Ipsum lorem Ipsum lorem Ipsum lorem Ipsum<br>\r\n" + //
                "lorem Ipsum lorem Ipsum lorem Ipsum lorem Ipsum</li>\r\n" + //
            "<li>quinto elemento<br>\r\n" + //
                "lorem Ipsum lorem Ipsum lorem Ipsum lorem Ipsum<br>\r\n" + //
                "lorem Ipsum lorem Ipsum lorem Ipsum lorem Ipsum</li>\r\n" + //
            "<li>sesto elemento<br>\r\n" + //
                "lorem Ipsum lorem Ipsum lorem Ipsum lorem Ipsum<br>\r\n" + //
                "lorem Ipsum lorem Ipsum lorem Ipsum lorem Ipsum</li>\r\n" + //
            "</ol></html>");
        title.setFont(new Font("Verdana", Font.BOLD, 24));
        text.setFont(new Font("Verdana", Font.PLAIN, 14));
        fr.setLayout(null);
        fr.setVisible(true);
        fr.add(title);
        title.setBounds(180, 30, 375, 20);
        pan1.add(text);
        pan2.add(imm);
        text.setLocation(120,120);
        fr.add(pan1);
        fr.add(pan2);
        pan1.setBounds(30, 100, 450, 400);
        pan2.setBounds(500, 97, 250, 400);
        pan2.setBackground(null);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
