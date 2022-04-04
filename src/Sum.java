import javax.swing.*;

public class Sum {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ange ett tal"));
        int math = 0;
        for (int i = 1; i < n + 1; i++) {
            math += i;
        }
        JOptionPane.showMessageDialog(null, math);
    }
}
