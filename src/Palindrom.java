import javax.swing.*;
import java.util.Locale;

public class Palindrom {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Skriv något.");
        String palin = palDrom(s);
        JOptionPane.showMessageDialog(null, palin);
    }

    static String palDrom(String s) {
        String comp1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(" ") || String.valueOf(s.charAt(i)).equals(",") || String.valueOf(s.charAt(i)).equals(".")) {
                continue;
            } else {
                comp1 += String.valueOf(s.charAt(i));
            }
        }
        comp1 = comp1.toLowerCase();
        String comp2 = reverse(comp1);
        if (comp1.equals(comp2)) {
            return "De är lika.";
        } else {
            return "De är inte lika.";
        }
    }

    static String reverse(String comp1) {
        String reversed = "";
        for (int i = comp1.length() - 1; i > -1; i--) {
            reversed += String.valueOf(comp1.charAt(i));
        }
        return reversed;
    }
}
