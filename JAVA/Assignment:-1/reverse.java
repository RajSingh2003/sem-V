import java.util.Scanner;
class reverse
{
      public static void main(String[] ars)
      {
           int n;
           System.out.println("Enter the Size of Array : ");
           Scanner s=new Scanner(System.in);
           n=s.nextInt();
           int []a=new int[n];
           System.out.println("Enter the of Array Elements : ");
           for (int i=0;i<n;i++)
           {
               a[i]=s.nextInt();
           }
           System.out.println("Reverse Array Elements are : ");
           for (int i=n-1;i>=0;i--)
           {
              System.out.println(+a[i]);
           }
           
      }
}


