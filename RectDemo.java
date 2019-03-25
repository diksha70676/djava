class Rectangle
{  
  int length, width;
  void getdata(int x, int y);
  {   
     length=x;
     width=y;
      }
   int rectangleArea()
  {  int area=length*width;
    return(area);

    }
}
class RectDemo
{
  public static void main(string args[])
    {
   int area1, area2;
      Rectangle r1=new Reactangle();
      Rectangle r2=new Reactangle();
      r1.length=15;
      r1.width=15;
      area1=r1.length*r1.width;
      r2.getdata(20,12);
      area2=r2.rectangleArea();

      System.out.println("area1="+area1);
      System.out.println("area2="+area2);

         }
}