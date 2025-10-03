class Main {
    public static void main(String[] args) {
      int a=12,b=25,c=20;
      int maxab=(a>b) ? a:b;
      int maxabc=(maxab>c) ? maxab:c;
       
      int minab=(a<b) ? a:b;
      int minabc=(minab<c) ? minab:c;
      
      int seclarge=(a+b+c)-maxabc-minabc;
      
      
       
       System.out.println("second largest="+seclarge);

    }
}
