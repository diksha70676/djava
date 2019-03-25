class Person
{ 
public String name;
public String gender;
 void walk()
   { System.out.println("name, gender");
      }

}
class Demo
{ 
   public static void main(String args[])
   {
  Person p=new Person();
     p.name="ram";
     p.gender="m";
System.out.println(p.name);
System.out.println(p.gender);


     
        }
}