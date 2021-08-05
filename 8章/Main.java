public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出しました！");
        // h.sit(5);
        // h.slip();
        // h.sit(25);
        // h.run();

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        Cleric c = new Cleric();
        c.name = "アルス";
        c.hp = 30;
        System.out.println("聖職者" + c.name + "が仲間に加わりました！");

        c.selfAid();
        c.pray(5);

        h.slip();
        m1.run();
        m2.run();
        h.run();
    }
}