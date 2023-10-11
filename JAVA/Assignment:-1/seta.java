import java.util.Scanner;
public class seta
{
     public static void main(String[] args)
     {
     int a,l,b,p;
     System.out.println("Enter the Length of rectangle : ");
     Scanner s=new Scanner(System.in);
     l=s.nextInt();
     System.out.println("Enter the Breadth of rectangle : ");
     Scanner sc=new Scanner(System.in);
     b=sc.nextInt();
     a=l*b;
     p=2*(l+b);
     System.out.println("Area of Rectangle : "+a);
     System.out.println("perimeter of Rectangle : "+p);
     }
}
