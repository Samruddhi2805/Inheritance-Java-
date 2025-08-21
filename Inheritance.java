import java.util.* ;
//demo ineritance 
class Student
{
  int roll;
  String name; 
  void input(){}
  void calresult(){} 
}
class Result extends Student 
{
   int M1,M2,M3,Per,total;
   Scanner scan=new Scanner(System.in);
   void input()
   { 
   System.out.print("Enter Roll No=");
   roll=scan.nextInt();// nextInt is used to convert into int
   System.out.print("Enter Name=");
   name=scan.next();//by default 
   System.out.print("Enter Marks of 1st Subject=");
   M1=scan.nextInt();
   System.out.print("Enter Marks of 2nd Subject=");
   M2=scan.nextInt();
   System.out.print("Enter Marks of 3rd Subject=");
   M3=scan.nextInt();
   }
 

void calresult()
{
  int total= M1 + M2 + M3;
  double percentage= total/3.0;

  System.out.println("---Student Result---");
  System.out.println("Name=" + name);
  System.out.println("Roll No=" + roll);
  System.out.println("Makrs="+ M1+","+ M2+","+ M3);
  System.out.println("Total Marks=" + total);
  System.out.println("Percentage=" + percentage + "%");
  }
}
public class Inheritance
{
 public static void main(String args[])//args is a string array, public is used for visibility or access thorughout the program, by using static a code can excute w/o a help of an obj, void means return nothing, main 
 {
 Result stu=new Result();
 stu.input();
 stu.calresult();
 }
}


   



