import java.io.File;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import address.USAddress;
import address.PurchaseOrderType;

public class Main {

    public static void main(String[] args) throws Exception {
        USAddress shipto = new USAddress("Alice Smith", "123 Maple Street", "Mill Valley", "CA", 90952);
        USAddress billto = new USAddress("Robert Smith", "8 Oak Avenue", "Old Town", "PA", 95819);
        PurchaseOrderType po = new PurchaseOrderType();
        po.billTo = billto;
        po.shipTo = billto;
        JAXBContext jc = JAXBContext.newInstance(PurchaseOrderType.class);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(po, System.out);
    }
}
