class Emp
{
      int id=0;
      String name=" ";
      String dept=" ";
      double salary=0;
      
      Emp(int id,String name,String dept,double salary)
      {
         this.id=id;
         this.name=name;
         this.dept=dept;
         this.salary=salary;
      }
      void show()
      {
           System.out.println("Enter Employee ID : "+id);
           System.out.println("Enter Employee Name : "+name);
           System.out.println("Enter Employee Department : "+dept);
           System.out.println("Enter Employee Salary : "+salary);
           System.out.println();
      }
     
      
      public static void main(String[] args)
      {
            Emp e=new Emp(1,"Raj","BCS",500000000);
            Emp e1=new Emp(2,"Amit","BSC",10000000);
            e.show();
            e1.show();
            
            
      }
}


