class NumberCheck {
    public static void main(String[] args) {
        int num = -5; 

        String result = (num > 0) ? "Positive" 
                      : (num < 0) ? "Negative" 
                      : "Zero";

        System.out.println("Number: " + num);
        System.out.println("It is " + result);
    }
}

/* output:
Number: -5
It is Negative
     */
