
public class SmiesznyKod
{
   public static int Fibonacci(int a)
   {
      if(a==1 || a==0)
      {
         return 1;
      }
      else
      {
         return Fibonacci(a-1)+Fibonacci(a-2);
      }
   }
   
   public static void main(String[] args)
   {
      for(int i=0;i<=20;i++)
      {
         System.out.println("Fibonacci(" + i + ") = " + Fibonacci(i));
         
      }
   }
   
}
