package javaIO;

public class MyScannerTest {
    public static void main(String[] args) {
        // Test your custom scanner class thoroughly
        MyScanner scanner = new MyScanner("1 2 3");

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            System.out.println("Next integer: " + num);
        }
    }
}
