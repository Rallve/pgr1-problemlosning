import javax.swing.*;

public class Rev {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Skriv en sträng.");
        String r = reverse(s);
        JOptionPane.showMessageDialog(null, r);
    }

    static String reverse(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i > -1; i--) {
            reversed += String.valueOf(s.charAt(i));
        }
        return reversed;
    }
}
