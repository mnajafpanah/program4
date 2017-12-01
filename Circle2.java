// CS371
// Program4

public class Circle2 extends Circle
{

public Circle2(double x, double y, double radius)
{
    // I changed "super(y,x,radius)" to the following:
   super(x,y,radius);
}

public boolean intersects(Circle other)
{
   double d;
   d = Math.sqrt(Math.pow(center.x - other.center.x, 2) + 
                 Math.pow(center.y - other.center.y, 2));

   // here I add an if statement to check for contained circles
   if (d < radius && other.radius < (radius - d))
      
       return false;
    
    // here I changed: "d < radius" to the following:
   if (d <= radius+other.radius)
      
       return true;
  
   else
      
       return false;
}

} // end class

