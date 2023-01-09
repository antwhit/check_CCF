import com.chilkatsoft.CkMht;
import com.chilkatsoft.CkMailMan;
import com.chilkatsoft.CkEmail;

public class EmailHtml1 {

    static {
        try {
            System.loadLibrary("chilkat");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Native code library failed to load.\n" + e);
            System.exit(1);
        }
    }

    public static void main(String argv[]) {
        CkMailMan mailman = new CkMailMan();
        mailman.UnlockComponent("anything for 30-day trial");
        mailman.put_SmtpHost("smtp.comcast.net");
        CkMht mht = new CkMht();
        mht.UnlockComponent("anything for 30-day trial");
        CkEmail email = mht.GetEmail("testEmail.html");
        email.put_Subject("Sending HTML mail from Java");
        email.put_From("Chilkat Support <support@chilkatsoft.com>");
        email.AddTo("Matt", "matt@chilkatsoft.com");
        email.AddTo("TagTooga", "admin@tagtooga.com");
        boolean success = mailman.SendEmail(email);
        if (!success) {
            mailman.SaveLastError("lastError.txt");
        }
    }
}
