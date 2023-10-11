import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
class Student
{
      int roll;
      String name;
      float per;
      
      Student(int roll,String name,float per)
      {
          this.roll=roll;
          this.name=name;
          this.per=per;
      }
      public static void main(String[] args)
      {
            int i,n;
            Scanner s=new Scanner(System.in);
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Number of Student : ");
            n=s.nextInt();
            Student []a=new Student[n];
            for(i=0;i<n;i++)
            {
                System.out.println("Enter the Detail of Student : "+(i+1));
                System.out.print("Enter ROLL-NO : ");
                int roll=s.nextInt();
                System.out.print("Enter Name : ");
                String name=s.next();
                System.out.print("Enter Percentage : ");
                Float per=sc.nextFloat();
                a[i]=new Student(roll,name,per);    
                System.out.println();  
            }
            Arrays.sort(a,Comparator.comparingDouble(student-> -student.per));
            System.out.println("Sorted Student Percentage :");
            for(Student student:a)
            { 
               System.out.println("Roll-No : "+student.roll+" Name : "+student.name+"   Percentage : "+student.per);
            }
            
      }
      
}
