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

        JLabel linkYT = new JLabel("<html><a href=''>Visita il nostro sito</a></html>");
        linkYT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        linkYT.setBounds(50, 50, 200, 30);
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

        easteregg.add(linkYT);
        easteregg.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EasterEgg::showInfo);
    }
}
