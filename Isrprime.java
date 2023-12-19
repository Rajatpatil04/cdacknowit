import java.util.Scanner;

class Isprime{
   public static void main(String args[])
  {
      Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        boolean flag = false;
    for(int i =2;i<=num/2;i++)
      {
          flag = true;
           if(num%i==0)
           {
                flag=false;
                 break;
           }
      }
    if(flag)
      System.out.println("NUMBER IS PRIME");
    else
      System.out.println("NUMBER IS NOT PRIME");

      s.close();
  }
}
        
