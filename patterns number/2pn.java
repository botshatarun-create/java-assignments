 class Main {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int row = 1;
        
        while(row <= 4) {
            for(int col = 1; col <= row; col++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
            row++;
        }
    }
}
