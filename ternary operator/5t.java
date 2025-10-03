class Main {
    public static void main(String[] args) {
        int m1=36,m2=59,m3=90;
        double avg=(m1+m2+m3)/3;
       
        if((m1>=35 && m2>=35 && m3>=35)&&(avg>=50)){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
       System.out.println("avg="+avg);
    }
}
