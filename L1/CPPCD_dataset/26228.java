import org.apache.log4j.Logger;
import com.quantanetwork.esm.port.PortScanner;
import com.quantanetwork.esm.port.QuantaPortTools;
import com.quantanetwork.esm.port.SpringBeansUtil;

/**
* Company: QuantaNetwork BeiJing Ltd
* Author : 张彦龙
* DateTime: Nov 27, 2008  11:42:04 AM
*/
public class Test {

    public static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        SpringBeansUtil.loadXml("applicationContext.xml");
        PortScanner portScanner = (PortScanner) SpringBeansUtil.getBeanObj("tools");
        String host = "192.168.1.50";
        int startPort = 0;
        int endPort = 65536;
        int timeOut = 2000;
        logger.info(portScanner.TestSacnForBetterWay(host, startPort, endPort, 1, timeOut, 1000, QuantaPortTools.UDP));
        System.exit(0);
    }
}
