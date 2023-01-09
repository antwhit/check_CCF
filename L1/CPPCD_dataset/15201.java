import java.io.*;

public class t {

    public static void main(String args[]) throws Exception {
        JYahooSession jys = new JYahooSession();
        NetOptions option = new NetOptions();
        option.setFirewall(true);
        option.setProxy(true);
        option.setProxyType(NetOptions.HTTP);
        option.setProxyHost("144.16.108.236", 80);
        option.setAuthentication("n8d10004", "mar1am");
        String login = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        String passwd = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        jys.login(login, passwd, option, 1);
    }
}
