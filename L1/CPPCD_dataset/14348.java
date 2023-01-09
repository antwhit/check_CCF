import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import org.xnap.commons.gui.shortcut.DefaultShortcut;
import org.xnap.commons.gui.shortcut.ShortcutPanel;
import org.xnap.commons.gui.util.GUIHelper;

/**
 * 
 * @author Steffen Pingel
 */
public class ShortcutExample extends JFrame {

    /**
	 * 
	 */
    public ShortcutExample() {
        ShortcutPanel panel = new ShortcutPanel();
        DefaultShortcut shortcut = new DefaultShortcut(KeyStroke.getKeyStroke(KeyEvent.VK_F5, KeyEvent.CTRL_MASK), "Triggers reload action");
        panel.add(shortcut, KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
        shortcut = new DefaultShortcut(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "Triggers help action");
        panel.add(shortcut, KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
        shortcut = new DefaultShortcut(null, "Does nothing at all");
        panel.add(shortcut, KeyStroke.getKeyStroke(KeyEvent.VK_A, 0));
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(GUIHelper.createEmptyBorder(10));
        mainPanel.add(panel, BorderLayout.CENTER);
        setContentPane(mainPanel);
    }

    public static void main(String[] args) {
        ShortcutExample app = new ShortcutExample();
        app.setTitle("XNap-Commons - " + ShortcutExample.class);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.pack();
        app.setVisible(true);
    }
}
