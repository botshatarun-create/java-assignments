class FirstLastDigitSum {
    public static void main(String[] args) {
        int num = 12345;
        int last = num % 10;
        int first = num;
        while (first >= 10) {
            first /= 10;
        }
        int sum = first + last;
        System.out.println(first + "" + last + "--" + first + "+" + last + "--" + sum);
    }
}
/*
output:
15--1+5--6
*/
