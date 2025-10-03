class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(++a + ++b);

        int x = (a++ - b++) + (--a - a--);

        System.out.println(x);
    }
}
