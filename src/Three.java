public class Three {
    public static void main(String[] args) {
        long math = 0;
        for (int i = 0; i < 100001; i++) {
            for (int n = 0; n < String.valueOf(i).length(); n++) {
                if (String.valueOf(String.valueOf(i).charAt(n)).equals("3")) {
                    System.out.println(i);
                    math += i;
                }
            }
        }
        System.out.println(math);
    }
}
