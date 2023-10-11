import java.util.Scanner;
import java.util.Arrays;
class Sort
{
     public static void main(String[] args)
     {
       Scanner s=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("Enter 5 Unsorted Array Elements : ");
      for(int i=0;i<a.length;i++)
      {
          a[i]=s.nextInt();
      }
      Arrays.sort(a);
      System.out.println("Sorted Array Elements : ");
      for(int i=0;i<a.length;i++)
      {
          System.out.print(a[i]+" ");
      }
    }  
}
