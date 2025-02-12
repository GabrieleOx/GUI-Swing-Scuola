import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

//https://www.tpointtech.com/java-swing

public class Testimonianze {
    static void showInfo(){
        JFrame fr = new JFrame("Testi");    // ||-> per mettere gli oggetti al suo interno tutti a sinistra
        JPanel pan1 = new JPanel(new FlowLayout(FlowLayout.LEFT)), pan2 = new JPanel();
        final JLabel title = new JLabel("alcuni testimonianze dei volontari:"), imm = new JLabel(new ImageIcon("sfondo-grigio.jpg")), text = new JLabel();
        fr.setSize(800, 600);
        fr.getContentPane().setBackground(new Color(255, 215, 77));
        text.setText(//
            "<html><ol>\r\n" + //
            "<li>Assistenza agli anziani<br>\r\n" + //
                "essere volontari in una casa di riposo mi ha ca<br>\r\n" + //
                "mbiato la vita e arricchito</li>\r\n" + //
            "<li>Progetti aducativi<br>\r\n" + //
                "tutoraggio per bambini:vedere il loro entusiasmo<br>\r\n" + //
                "crescere è inestimabile</li>\r\n" + //
            "<li>Pulizia delle spiagge<br>\r\n" + //
                "Proteggere l'ambiente e unire le forze per una <br>\r\n" + //
                "causa comune è incredibile</li>\r\n" + //
            "<li>Sostegno dei rifugiati<br>\r\n" + //
                "Fornire un supporto legale per aiutare i rifugia<br>\r\n" + //
                "ti a integrarsi nella nuova vita</li>\r\n" + //
            "<li>Eventi di raccolta fondi<br>\r\n" + //
                "Organizzare eventi per varie cause mi ha mostrato<br>\r\n" + //
                "la potenza della generosità</li>\r\n" + //
            "<li>Conclusioni<br>\r\n" + //
                "Queste testimonianze dimostrano come il volontaria<br>\r\n" + //
                "to possa arricchire la propria vita</li>\r\n" + //
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