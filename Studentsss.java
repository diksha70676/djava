import java.io.*;
import java.util.Scanner;
class Student
{
	int rno,sno;
	String name;
	String city="indore";
	Scanner X=new Scanner(System.in);
	Student()
	{
		System.out.println("enter roll no. and name:");
		 rno=X.nextInt();
		 name=X.next();
		 }
    void display()
		 {
		  sno++;
		  System.out.println("serial no.:"+sno);
		  System.out.println("roll no.:"+rno);
		  System.out.println("name:"+name);
		  System.out.println("city:"+city);
		  
	     }
    static void changecity()
		 {
		 city="bhopal";
		 }
}
class Studentsss{
	
    public static void main (String args[])
		 {
		 Student S=new Student[10];
		  int i;
		  for(i=0;i<5; i++)
		  {
		  S[i]=new Student();
		  
		  }
		  for(i=0;i<5;i++)
		  {
			  S[i].display();
		  }
		  Student.changecity();
		  for(i=0;i<5;i++)
		  {
			  S[i].display();
		  }
		 }
		
}