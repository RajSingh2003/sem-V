import java.util.Scanner;
class demo
{
      Scanner s=new Scanner(System.in);
      void cylinder()
      {
           float r,h,c;
           System.out.println("Enter Radius of Cylinder : ");
           r=s.nextFloat();
           System.out.println("Enter Height of Cylinder : ");
           h=s.nextFloat();
           c=r*r*h;
           System.out.println("Volumn of Cylinder : "+c);     
      }
      
      void factorial()
      {
           int i,n,fact=1;
           System.out.println("Enter the Number : ");
           n=s.nextInt();
           for (i=1;i<=n;i++)
           {
               fact=fact*i;
           }
           System.out.println("Factorial is : "+fact);
      }
      void Arm()
      {
           int r,x,n,sum=0;
           System.out.println("Enter the Number : ");
           n=s.nextInt();
           x=n;
           while(n!=0)
           {
                r=n%10;
                sum=sum+(r*r*r);
                n=n/10;           
           }
           if(sum==x)
              System.out.println("Given Number is Armstrong...");
           else
              System.out.println("Given Number is Not Armstrong...");
               
      }
      public static void main(String[] args)
      {
            int ch=1;
            Scanner sc=new Scanner(System.in);
            demo a =new demo();
            while(ch>=1&&ch<4)
            {
                    System.out.println("SELECT ANY ONE OPTION...");
                    System.out.println("1:VOLUME OF CYLINDER..");
                    System.out.println("2:FIND FACTORIAL..");
                    System.out.println("3:FIND ARMSTRONG...");
                    System.out.println("4:EXIT...");   
                    System.out.println("Enter Your Choice..");                    
                    ch=sc.nextInt();
                    switch(ch)
                    {
                         case 1:
                               a.cylinder();
                               break;
                         case 2:
                               a.factorial();
                               break;
                        case 3:
                               a.Arm();
                               break;
                        case 4:
                              System.out.println("Exit");
                               break;                       
                        default:  System.out.println("INVALID ERROR....");       
                    }
                            
            }
      }
}

