import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//https://www.tpointtech.com/java-swing

public class Informazioni {
    static void showInfo(){
        JDialog fr = new JDialog((Frame) null, "Info", true);
        JPanel pan1 = new JPanel(new FlowLayout(FlowLayout.LEFT)), pan2 = new JPanel();
        final JLabel title = new JLabel("Informazioni sul volontario:"), imm = new JLabel(new ImageIcon("sfondo-grigio.jpg")), text = new JLabel();
        JButton esci = new JButton("Back->Home");
        fr.setSize(800, 600);
        fr.setResizable(false);
        fr.getContentPane().setBackground(new Color(255, 215, 77));
        text.setText(//
            "<html><ol>\r\n" + //
            "IMPORTANZA DEL VOLONTARIATO:<br><br>\r\n" + //
            "<li>Supporto ai bisognosi<br>\r\n" + //
                "Il volontariato offre aiuto a chi e' in difficoltà,<br>\r\n" + //
                "milgiorando la qualità di vita di molti</li>\r\n" + //
            "<li>Rafforzamento dei legami comunitari<br>\r\n" + //
                "Promuove un senso di solidarieta' e connessione<br>\r\n" + //
                "tra i membri della comunita'</li>\r\n" + //
            "<li>Impatti positivi sulla salute mentale<br>\r\n" + //
                "Aiutare gli altri puo' milgiorare il benessere <br>\r\n" + //
                "emotivo e psicologico di chi fa volontariato</li>\r\n" + //
            "<li>Sviluppo senso di Responsabilita'<br>\r\n" + //
                "Fare volontariato contrivuisce a sviluppare un senso di<br>\r\n" + //
                " responsabilita' verso la comunità e la società.</li>\r\n" + //
            "<li>Risorse per organizzazioni No-Profit<br>\r\n" + //
                "Le organizzazioni benefiche spesso dipendono<br>\r\n" + //
                "dai volontari per fornire i loro servizi</li>\r\n" + //
            "<li>Crescita personale<br>\r\n" + //
                "Chi fa volontariato spesso sviluppa nuove competenze<br>\r\n" + //
                "e una maggiore consapevolezza sociale.</li>\r\n" + //
            "</ol></html>");
        title.setFont(new Font("Verdana", Font.BOLD, 24));
        text.setFont(new Font("Verdana", Font.PLAIN, 14));
        fr.setLayout(null);
        fr.add(title);
        title.setBounds(180, 30, 375, 20);
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
        pan2.setBounds(500, 97, 260, 400);
        pan2.setBackground(null);
        fr.setVisible(true);
    }
}
