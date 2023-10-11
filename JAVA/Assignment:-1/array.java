import java.util.Scanner;
class array
{
      int i,j,k,r1,c1,r2,c2;
      Scanner s=new Scanner(System.in);
      void add()
      {
        if(r1==r2 && c1==c2)
        {
           System.out.println("Enter Row and Column of First Matrix::");
           r1=s.nextInt();
           c1=s.nextInt();
           System.out.println("Enter Row and Column of Second Matrix::");
           r2=s.nextInt();
           c2=s.nextInt();
           int a[][]=new int[r1][c1];
           int b[][]=new int[r2][c2];
           int c[][]=new int[5][5];
           System.out.println("Enter First Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 a[i][j]=s.nextInt();
              }
           }
           System.out.println("First Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 System.out.print(a[i][j]+" ");
              }
              System.out.print("\n");
           }
           
           System.out.println("Enter Second Matrix::");
           for(i=0;i<r2;i++)
           {
              for(j=0;j<c2;j++)
              {
                 b[i][j]=s.nextInt();
              }
           }
           System.out.println("Second Matrix::");
           for(i=0;i<r2;i++)
           {
              for(j=0;j<c2;j++)
              {
                 System.out.print(b[i][j]+" ");
              }
              System.out.print("\n");
           }
           
           //System.out.printfln("ADDITION IS::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 c[i][j]=a[i][j]+b[i][j];
              }
             // System.out.printf("\n");
           }
            
           System.out.println("ADDITION IS::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                System.out.print(c[i][j]+" ");
              }
              System.out.print("\n");
           }
        }
           
         else
             System.out.println("Invalid Matrix...");      
          
    }
      void trans()
      {
           System.out.println("Enter Row and Column of Matrix::");
           r1=s.nextInt();
           c1=s.nextInt();
           int a[][]=new int[r1][c1];
           int b[][]=new int[5][5];
           System.out.println("Enter Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 a[i][j]=s.nextInt();
              }
           }
           System.out.println(" Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 System.out.print(a[i][j]+" ");
              }
              System.out.print("\n");
           }
            for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 b[i][j]=a[j][i];
              }
             // System.out.printf("\n");
           }
           System.out.println("TRANSPOSE IS::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                System.out.print(b[i][j]+" ");
              }
              System.out.print("\n");
           }
           
      }
      
      void mul()
      {
          if(r1==c2)
        {
           System.out.println("Enter Row and Column of First Matrix::");
           r1=s.nextInt();
           c1=s.nextInt();
           System.out.println("Enter Row and Column of Second Matrix::");
           r2=s.nextInt();
           c2=s.nextInt();
           int a[][]=new int[r1][c1];
           int b[][]=new int[r2][c2];
           int c[][]=new int[r2][c2];
           System.out.println("Enter First Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 a[i][j]=s.nextInt();
              }
           }
           System.out.println("First Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 System.out.print(a[i][j]+" ");
              }
              System.out.print("\n");
           }
           
           System.out.println("Enter Second Matrix::");
           for(i=0;i<r2;i++)
           {
              for(j=0;j<c2;j++)
              {
                 b[i][j]=s.nextInt();
              }
           }
           System.out.println("Second Matrix::");
           for(i=0;i<r2;i++)
           {
              for(j=0;j<c2;j++)
              {
                 System.out.print(b[i][j]+" ");
              }
              System.out.print("\n");
           }
           
           //System.out.printfln("ADDITION IS::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {  
                  for(k=0;k<c1;k++)
                  {
                      c[i][j]=c[i][j]+a[i][k]*b[k][i];
                  }    
              }
             // System.out.printf("\n");
           }
            
           System.out.println("MULTIPLICATION IS::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c2;j++)
              {
                System.out.print(c[i][j]+" ");
              }
              System.out.print("\n");
           }
       }    
           
         else
             System.out.println("Invalid Matrix...");      
           
      
      
      }
      
      public static void main(String[] args)
      {
            int ch=1;
            Scanner sc=new Scanner(System.in);
            array a =new array();
            while(ch>=1&&ch<4)
            {
                    System.out.println("SELECT ANY ONE OPTION...");
                    System.out.println("1:ADDITION..");
                    System.out.println("2:MLTILICATION..");
                    System.out.println("3:TRANSPOSE...");
                    System.out.println("4:EXIT...");   
                    System.out.println("Enter Your Choice..");                    
                    ch=sc.nextInt();
                    switch(ch)
                    {
                         case 1:
                               a.add();
                               break;
                         case 2:
                               a.mul();
                               break;
                        case 3:
                               a.trans();
                               break;
                        case 4:
                              System.out.println("Exit");
                               break;                       
                        default:  System.out.println("INVALID ERROR....");       
                    }
                            
            }
      }

}
