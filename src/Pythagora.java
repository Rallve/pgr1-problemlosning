public class Pythagora {
    public static void main(String[] args) {
        double math1 = 0;
        double math2 = 0;
        for (double i = 1.0; i < 100000.0; i++) {
            math1 = i * (3.0 / 5.0);
            math2 = i * (4.0 / 5.0);
            if (Math.floor(math1) == math1 && Math.floor(math2) == math2) {
                System.out.println((i * (3.0 / 5.0)) + ", " + (i * (4.0 / 5.0)) + ", " + i);
            }
        }
    }
}
