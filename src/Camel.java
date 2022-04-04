import javax.swing.*;

public class Camel {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Skriv något.");
        String camel = camelCase(s);
        JOptionPane.showMessageDialog(null, camel);
    }

    static String camelCase(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(" ")) {
                i++;
                r += String.valueOf(s.charAt(i)).toUpperCase();
            }
            else {
                r += String.valueOf(s.charAt(i));
            }
        }
        return r;
    }
}
