public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        System.out.println(h.getHp());
        Wizard wizard = new Wizard();
        wizard.heal(h);
    }
}

/**
 * カプセル化について学び、これはヒューマンエラーによる操作ミスを未然に防ぐために用いられる。
 */