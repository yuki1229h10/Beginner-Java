public class Hero {
    String name;
    int hp;

    // ...
    public boolean equals(Object o) {
        if (this == o) {
            return true;
            // 等価なら間違いなく等価
        }
        if (o instanceof Hero) {
            Hero h = (Hero) o;
            if (this.name.equals(h.name)) {
                // 名前が等しければ等価
                return true;
            }
        }
        return false;
    }
}
