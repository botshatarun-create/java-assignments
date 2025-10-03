 class DivisibleCheck {
    public static void main(String[] args) {
        int num = 15;  // change this value to test other numbers

        System.out.println((num % 3 == 0 && num % 5 == 0) 
                           ? "Divisible by both 3 and 5" 
                           : "Not divisible by both 3 and 5");
    }
}
// output :  Divisible by both 3 and 5
