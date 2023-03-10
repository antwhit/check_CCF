import java.io.*;

public class RandomAccessFileTest {

    public static void main(String[] args) {
        Employee e1 = new Employee("Tom", 258);
        Employee e2 = new Employee("���", 129);
        Employee e3 = new Employee("Hardy", 257);
        byte[] b = new byte[Employee.LEN];
        try {
            RandomAccessFile raf = new RandomAccessFile("employee.txt", "rw");
            raf.writeChars(e1.name);
            raf.write(e1.age);
            raf.writeChars(e2.name);
            raf.write(e2.age);
            raf.write(e3.name.getBytes());
            raf.writeInt(e3.age);
            raf.seek(Employee.LEN * 2 + 1);
            String str = "";
            for (int i = 0; i < Employee.LEN; ++i) str += raf.readChar();
            System.out.println(str.trim() + ":" + raf.read());
            raf.seek(0);
            str = "";
            for (int i = 0; i < Employee.LEN; ++i) str += raf.readChar();
            System.out.println(str.trim() + ":" + raf.read());
            raf.seek(Employee.LEN * 4 + 1 + 1);
            raf.read(b, 0, 8);
            System.out.println(new String(b).trim() + ":" + raf.readInt());
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Employee {

    String name = null;

    int age = 0;

    static int LEN = 8;

    public Employee(String name, int age) {
        if (name.length() > LEN) name = name.substring(0, 8); else {
            while (name.length() < LEN) name += " ";
        }
        this.name = name;
        this.age = age;
    }
}
