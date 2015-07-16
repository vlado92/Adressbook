package adressbook;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicMenuUI;

public class Frame extends JFrame{
    private final static int VISINA = 700;
    private final static int DUZINA = 500;
    public static int getVISINA() {
        return VISINA;
    }
    public static int getDUZINA() {
        return DUZINA;
    }

    public Frame() throws HeadlessException {
        setSize(DUZINA, VISINA);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        SubPanel panel = new SubPanel(this);
        panel.setVisible(true);
        add(panel);
    }
}
