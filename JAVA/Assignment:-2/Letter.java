import java.util.Scanner;
class Letter
{
     public static void main(String[] args)
     {
           int len;
           String fname,mname,lname;
           Scanner s=new Scanner(System.in);
           System.out.print("Enter First Name : ");
           fname=s.next();
           System.out.print("Enter Middle Name : ");
           mname=s.next();
           System.out.print("Enter Last Name : ");
           lname=s.next();
           //char miidle=CharactertoUpperCase(mname.char
           len=mname.length();
           String f=mname.substring(0,1);
           String l=mname.substring(1,len);
           f=f.toUpperCase();
           mname=f+l;
           System.out.println("Last name : "+lname);
           System.out.println("First name : "+fname);
           System.out.println("Middle name : "+mname);
           System.out.println();
           
     }
}

/*
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
}*/
