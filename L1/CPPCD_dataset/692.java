import java.io.IOException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class TestShell {

    public static void main(String[] args) {
        Display display = Display.getDefault();
        Shell shell = new Shell(display);
        Status d1 = new Status(IStatus.ERROR, "sdfsfsd", 20, "asdas", new IOException("sdfsd sdk aead qweqw"));
        Status d2 = new Status(IStatus.ERROR, "wewew", 20, "asdeeeeeas", new IOException("111 111 11"));
        MultiStatus multiStatus = new MultiStatus("sd", 20, "a\n\b\nsdfs", null);
        multiStatus.add(d1);
        multiStatus.add(d2);
        ErrorDialog.openError(shell, "Update Quotes", "Not all quotes could be loaded.", multiStatus);
    }
}
