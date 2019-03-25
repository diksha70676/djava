class Rectangle
{  
  int length, width;
  Rectangle(int x, int y);
  {   
     length=x;
     width=y;
      }
   int rectangleArea()
  {  area=length*width;
return(area);
    }
}
class RectArea
{
  public static void main(String args[])
    {
   int area1, area2;
      Rectangle r1=new Reactangle(12,12);
      int area1=r1.RectangleArea();

      System.out.println("area1="+area1);


         }
}