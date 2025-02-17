import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//https://www.tpointtech.com/java-swing

public class Testimonianze {
    static void showInfo(){
        JDialog fr = new JDialog((Frame) null, "Testi", true);    // ||-> per mettere gli oggetti al suo interno tutti a sinistra
        JPanel pan1 = new JPanel(new FlowLayout(FlowLayout.LEFT)), pan2 = new JPanel();
        final JLabel title = new JLabel("Alcune testimonianze dei volontari:"), imm = new JLabel(new ImageIcon("sfondo-grigio.jpg")), text = new JLabel();
        JButton esci = new JButton("Back->Home");
        fr.setSize(800, 600);
        fr.setResizable(false);
        fr.getContentPane().setBackground(new Color(133, 189, 117));
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
        text.setBackground(null);
        pan1.setBackground(null);
        fr.setLayout(null);
        fr.add(title);
        title.setBounds(150, 30, 600, 20);
        pan1.add(text);
        pan2.add(imm);
        text.setLocation(120,120);
        fr.add(pan1);
        fr.add(pan2);
        fr.add(esci);
        esci.setBounds(620, 510, 140, 40);
        esci.setFont(new Font("Verdana", Font.BOLD, 13));
        esci.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                fr.dispose();
            }
        });
        pan1.setBounds(30, 100, 450, 400);
        pan2.setBounds(500, 97, 250, 400);
        pan2.setBackground(null);
        fr.setVisible(true);
    }
}