
public class ProjectMain {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.setAge(5);
        a.setColor("BLACK");
        System.out.println("Hello World!");
        System.out.println("Color of the animal is : " + a.getColor());
        System.out.println("Age of the animal is : " + a.getAge());
        Cat c = new Cat();
        c.meow();
        Eatable d = new Dog();
        d.eat("Meat..");
    }
}
