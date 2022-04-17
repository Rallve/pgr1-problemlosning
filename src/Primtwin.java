import java.util.ArrayList;
import java.util.List;

public class Primtwin {
    public static void main(String[] args) {
        List<Double> primes = new ArrayList<>();
        primes.add(2.0);
        for (double i = 2.0; i < 1000001.0; i++) {
            for (int n = 0; n < primes.size(); n++) {
                double math = i / primes.get(n);
                if (Math.floor(math) != math && n == primes.size() - 1) {
                    primes.add(i);
                    break;
                } else if (Math.floor(math) == math) {
                    break;
                }
            }
        }
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i) + 2 == primes.get(i + 1)) {
                System.out.println(primes.get(i) + " + " + (primes.get(i) + 2));
            }
        }
    }
}