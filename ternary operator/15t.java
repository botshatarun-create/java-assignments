 class BloodDonationCheck {
    public static void main(String[] args) {
        int age = 20;     
        int weight = 55;  

        String result = (age >= 18 && weight >= 50)
                        ? "Eligible to donate blood"
                        : "Not eligible to donate blood";

        System.out.println("Age: " + age + ", Weight: " + weight);
        System.out.println(result);
    }
}

/*
output:
Age: 20, Weight: 55
Eligible to donate blood

*/
