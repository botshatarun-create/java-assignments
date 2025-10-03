 class GradeCheck {
    public static void main(String[] args) {
        int marks = 82;  

        String grade = (marks >= 90) ? "A" 
                      : (marks >= 75) ? "B" 
                      : (marks >= 50) ? "C" 
                      : "Fail";

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
/* output:
Marks: 82
Grade: B */
