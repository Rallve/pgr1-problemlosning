public class Prime {
    public static void main(String[] args) {
        System.out.println(2.0);
        for (double i = 1.0; i < 101.0; i++) {
            for (double n = 2.0; n < i; n++) {
                double math = i / n;
                if (Math.floor(math) != math && n == i - 1) {
                    System.out.println(i);
                } else if (Math.floor(math) == math) {
                    break;
                }
            }
        }
    }
}