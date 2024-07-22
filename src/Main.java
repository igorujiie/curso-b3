public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = --a + --a; // (2-1) + (1-1)
        System.out.println(b);

        int c = ++b - --a;
        System.out.println(c);
    }
}