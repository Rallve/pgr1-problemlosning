import java.util.Optional;

public class test {
    public static void main(String[] args) {
        double math = 4.0 / 2.0;
        System.out.println(math);
        if (Math.floor(math) == math) {
            System.out.println("sant");
        } else {
            System.out.println("false");
        }
    }
}
