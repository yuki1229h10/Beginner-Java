package practice;

import java.io.IOException;

// public class Main {
//     public static void main(String[] args) {
//         try {
//             String s = null;
//             System.out.println(s.length());
//         } catch (NullPointerException e) {
//             System.out.println("NullPointerException例外をcatchしました");
//             System.out.println("--スタックトレース（ここから）--");
//             e.printStackTrace();
//             System.out.println("--スタックトレース（ここまで）--");
//         }
//     }
// }

// 上　nullが代入された時に発生する例外を特定する。

// public class Main {
//     public static void main(String[] args) {
//         try {
//             int i = Integer.parseInt("三");
//         } catch (NumberFormatException e) {
//             System.out.println("例外NumberFormatExceptionをcatchしました");
//         }
//     }
// }

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("プログラムが起動しました。");
        throw new IOException();
    }
}