public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "草薙剣";
        s.damage = 10;
        Hero h = new Hero();
        h.name = "サスケ";
        h.hp = 100;
        h.sword = s;
        System.out.println("現在の武器は" + h.sword.name);

        Hero h1 = new Hero();
        h1.name = "キーファ";
        h1.hp = 100;

        Hero h2 = new Hero();
        h2.name = "クラウド";
        h2.hp = 100;

        Wizard w = new Wizard();
        w.name = "ユウナ";
        w.hp = 100;

        w.heal(h1);
        w.heal(h2);
    }
}

/**
 * コンストラクタと見なされる条件
 * 
 * ①メソッド名がクラス名と完全に等しい
 * ②メソッド宣言に戻り値が記述されていない（voidも不可）
 */