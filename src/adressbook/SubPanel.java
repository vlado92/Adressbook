package adressbook;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class SubPanel extends JPanel{

    public SubPanel(final Frame frame) {
    JTabbedPane tp = new JTabbedPane();
    tp.add(new NewContact());
    tp.add(new Contacts());
    add(tp);
    }
    
}
