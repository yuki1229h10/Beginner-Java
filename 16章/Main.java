// import java.io.*;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         String filename = "c:¥¥test.txt";
//         FileReader fr = new FileReader(filename);
//         char c1 = (char) fr.read();
//         char c2 = (char) fr.read();
//         fr.close();
//     }
// }

// public class Main {
//     public static void main(String[] args) throws Exception {
//         String filename = "c:¥¥test.txt";
//         FileWriter fw = new FileWriter(filename);
//         fw.write('そ');
//         fw.write('れ');
//         fw.close();
//     }
// }

// import java.io.InputStream;
// import java.net.URL;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         URL u = new URL("http://www.impressjapan.jp/");
//         InputStream is = u.openStream();
//         int i = is.read();
//         while (i != -1) {
//             char c = (char) i;
//             System.out.print(c);
//             i = is.read();
//         }
//     }
// }

// import java.sql.*;

// public class Main {
//     public static void main(String[] args) throws Exception {
//         Class.forName("org.h2.Driver");
//         String dburl = "jdbc:h2:~/test";
//         String sql = "INSERT INTO EMPLOYEES(name) VALUES('Roy')";
//         Connection conn = DriverManager.getConnection(dburl);
//         conn.createStatement().executeUpdate(sql);
//         conn.close();
//     }
// }

import java.awt.FlowLayout;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("はじめてのGUI");
        JLabel label = new JLabel("Hello World");
        JButton button = new JButton("押してください");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(label);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}