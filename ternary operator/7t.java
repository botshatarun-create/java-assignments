public class IncrementTest {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x;

        System.out.println("Final value of x = " + x);
        System.out.println("Final value of y = " + y);
    }
}
