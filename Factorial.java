class Factorial{
  public static void main(String args[])
  {
      scanner s = new scanner(System.in);
       int num = s.nextInt();
      int fact=1;
      while(num!=0)
        {
           fact*=num;
          num--;
        }
       System.out.println("FACTORIAL :"+fact);
  }
}
