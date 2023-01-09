import javax.swing.JMenu;
import javax.swing.UIManager;

public class GetIt {

    public static void main(String args[]) throws Exception {
        JMenu it = new JMenu();
        String classID = it.getUIClassID();
        System.out.println(classID);
        String className = (String) UIManager.get(classID);
        System.out.println(className);
        Class.forName(className);
        System.out.println(System.getProperty("swing.defaultlaf"));
        System.out.println(System.getProperty("swing.auxiliarylaf"));
        System.out.println(System.getProperty("swing.plaf.multiplexinglaf"));
        System.out.println(System.getProperty("swing.installedlafs"));
    }
}
