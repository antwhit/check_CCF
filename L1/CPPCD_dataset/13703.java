import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class Flow extends Frame {

    Button northButton = new Button("First");

    Button southButton = new Button("Second");

    Button eastButton = new Button("Third");

    Button westButton = new Button("Fourth");

    Button centerButton = new Button("Fifth");

    public Flow() {
        this.setLayout(new FlowLayout());
        add(northButton);
        add(southButton);
        add(eastButton);
        add(westButton);
        add(centerButton);
    }

    public static void main(String[] args) {
        Flow f = new Flow();
        f.setBounds(200, 200, 300, 300);
        f.setTitle("Flow Layout");
        f.setVisible(true);
    }
}
