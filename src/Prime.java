import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Prime {
    public static void main(String[] args) {
        List<Double> primes = new ArrayList<>();
        primes.add(2.0);
        for (double i = 1.0; i < 101.0; i++) {
            for (double n = 2.0; n < i; n++) {
                double math = i / n;
                if (Math.floor(math) != math && n == i - 1) {
                    primes.add(i);
                } else if (Math.floor(math) == math) {
                    break;
                }
            }
        }
        for (int i = 0; i < primes.size(); i++) {
            System.out.println(primes.get(i));
        }
    }
}
