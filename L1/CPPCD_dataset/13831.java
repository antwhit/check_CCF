public class JavaObjects {

    public static void main(String[] args) {
        SuperHero hero = new SuperHero();
        hero.setName("SpamMan");
        hero.setPowerLevel(3);
        hero.Defend("Laura Jones");
        SuperHero.Rest();
        SuperHero hero2 = hero;
        hero2.setName("WormWoman");
        System.out.println(hero.getName());
        hero = null;
        if (hero == null) hero = new SuperHero();
        Object obj = new SuperHero();
        System.out.println("object's type: " + obj.getClass().toString());
        if (obj instanceof SuperHero) System.out.println("Is a SuperHero object.");
    }
}
