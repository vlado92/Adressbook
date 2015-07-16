package adressbook;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

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
        JTabbedPane tp = new JTabbedPane();
        tp.add(new NewContact());
        add(tp);
    }
}
