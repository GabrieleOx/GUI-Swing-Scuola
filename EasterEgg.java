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
        easteregg.getContentPane().setBackground(new Color(120, 66, 100));

        JLabel linkYT = new JLabel("<html><a href=''>video di sensibilizzazione</a></html>");
        linkYT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        linkYT.setBounds(210, 220, 200, 30);
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
        JLabel link1 = new JLabel("<html><a href=''>volotariato internazionale</a></html>");
        link1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        link1.setBounds(210, 150, 200, 30);
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
        JLabel link2 = new JLabel("<html><a href=''>volotariato per i giovani</a></html>");
        link2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        link2.setBounds(210, 150, 200, 30);
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
        
        easteregg.add(linkYT);easteregg.add(link1);
        easteregg.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EasterEgg::showInfo);
    }
}

