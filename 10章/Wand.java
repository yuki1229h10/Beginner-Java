public class Wand {
    private String name;
    private double power;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("杖に設定されようとしている名前が無効です");
        }
        this.name = name;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("杖に設定されようとしている魔力が異常です");
        }
        this.power = power;
    }
}

// public class Wand {
// private String name;
// private double power;

// public String getname() {
// return this.name;
// }

// public void setName(String name) {
// this.name = name;
// }

// public double getPower() {
// return this.power;
// }

// public void setPower(double power) {
// this.power = power;
// }
// }

/**
 * メンバに関するアクセス修飾の定石
 * 
 * ・フィールドはすべて private ・メソッドはすべて public
 */

/**
 * getter メソッドの定石 public 値を取り出すフィールドの型 get フィールド名() { return this.フィールド名; }
 */

/**
 * setter メソッドの定石 public void set フィールド名（フィールドの型 任意の変数名） {this.フィールド=任意の変数名;}
 */