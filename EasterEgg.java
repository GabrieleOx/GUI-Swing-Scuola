import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import javax.swing.*;

public class EasterEgg {

    public static void showInfo(){ 
        JDialog easteregg = new JDialog((Frame) null, "easteregg", true);
        easteregg.setLayout(null);
        easteregg.setSize(600, 600);
        easteregg.getContentPane().setBackground(new Color(133, 189, 117));
        JLabel linkYT = new JLabel("video di sensibilizzazione");
        linkYT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        linkYT.setBounds(200, 360, 300, 30);
        linkYT.setFont(new Font("Verdana", Font.BOLD, 15));
        linkYT.setForeground(Color.WHITE);
        linkYT.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/WN18kGdPHzk?si=Ktjt_M95ovATLzh6"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        JLabel link1 = new JLabel("volotariato internazionale");
        link1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        link1.setBounds(200, 125, 300, 30);
        link1.setFont(new Font("Verdana", Font.BOLD, 15));
        link1.setForeground(Color.WHITE);
        link1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.volunteerworld.com/it"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        JLabel link2 = new JLabel("volotariato per i giovani");
        link2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        link2.setBounds(210, 185, 200, 30);
        link2.setFont(new Font("Verdana", Font.BOLD, 15));
        link2.setForeground(Color.WHITE);
        link2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.volunteerworld.com/it"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        JLabel titololink=new JLabel("PER AVVICINARSI AL VOLONTARIATO");
        titololink.setBounds(41, 50, 600, 40);
        titololink.setFont(new Font("Verdana", Font.BOLD, 24));
        JLabel titoloYT=new JLabel("NON GIRARTI DALL'ALTRA PARTE");
        titoloYT.setBounds(68, 280, 600, 40);
        titoloYT.setFont(new Font("Verdana", Font.BOLD, 24));
        easteregg.add(linkYT);easteregg.add(link1);easteregg.add(link2);easteregg.add(titololink);easteregg.add(titoloYT);
        easteregg.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EasterEgg::showInfo);
    }
}

