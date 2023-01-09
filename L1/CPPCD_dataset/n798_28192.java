import java.io.IOException;
import jdbm.PrimaryTreeMap;
import jdbm.RecordManager;
import jdbm.RecordManagerFactory;

/**
 * This program demonstrates basic JDBM usage.
 * 
 * @author Jan Kotek
 *
 */
public class HelloWorld {

    public static void main(String[] args) throws IOException {
        String fileName = "helloWorld";
        RecordManager recMan = RecordManagerFactory.createRecordManager(fileName);
        String recordName = "firstTreeMap";
        PrimaryTreeMap<Integer, String> treeMap = recMan.treeMap(recordName);
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        System.out.println(treeMap.keySet());
        recMan.commit();
        System.out.println(treeMap.keySet());
        treeMap.remove(2);
        System.out.println(treeMap.keySet());
        recMan.rollback();
        System.out.println(treeMap.keySet());
        recMan.close();
    }
}
