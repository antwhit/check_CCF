import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class InputOutput {

    /**
	 * @param args
	 * @throws IOException
	 */
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int zahl = random.nextInt(100);
        System.out.println("Nutzer gebe Zahl ein:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int number = Integer.parseInt(line);
        System.out.println("Nutzer du hast die Zahl " + number + " eingegeben");
    }
}
