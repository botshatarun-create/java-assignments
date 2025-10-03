class Main {
    public static void main(String[] args) {
        int a=4,b=6;  // fraction a/b
        int c=5,d=3;  // fraction c/d
        int left=a*d;
        int right=c*b;
        if(left > right){
           System.out.println("a/b "+ " is greater than " + "c/d"); 
        }
        else if (left < right){
        System.out.println("c/d "+ " is greater than " + "a/b");
        }
        else{
            System.out.println("a/b"+ " is equal to " + "c/d ");
        }
    }
}
