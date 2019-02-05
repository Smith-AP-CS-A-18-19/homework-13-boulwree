import java.awt.geom.Rectangle2D;
/* All SmithShape triangles have one edge that is on
 * the horizontal and are defined by the angle (in degrees)
 * of the lower left corner.
 */
  public class Triangle implements SmithShape{
/* The constructor for the Triangle object should be as below.
 * You may change the names of the parameters, but their order
 * must remain the same for the assignment to be scored
 * correctly
 */

   private int x;
   private int y;
   private int width;
   private int height;
   private double angle;

 public Triangle(int x, int y, int width, int height, double angle){
   this.x = x;
   this.y = y;
   this.width = width;
   this.height = height;
   this.angle = angle;

 }

 public double getAngle(){
   return angle;

 }

 public int getX(){
   return x;
 }

 // The lower left y coordinate
 public int getY(){
   return y;
 }

 // The width of the shape
 public int getWidth(){
   return width;
 }

 // The height of the shape
 public int getHeight(){
   return height;
 }

 // The overall area of the shape
 public double getArea(){
   double area = (.5) * getWidth() * getHeight();
   return area;
 }

 public Rectangle2D toSquare(){
   Rectangle2D rect = new Rectangle2D.Double(getX(), getY(), getWidth(), getHeight());
   return rect;

 }

 @Override
 public String toString(){
   return "Width: " + width + "\nHeight: " + height + "\nAngle: " + angle;
 }



}

/* You will need to add a getAngle() method that returns
 * the angle of the triangle
 */


/* Add the method toSquare() to the Triangle class. This creates
 * and returns a new Rectangle2D object. The x and y of the new
 * Rectangle should be the same as the Triangle. The width and
 * height of the Rectangle2D should be the same (it is a square)
 * and the area should be equal to the area of the Triangle
 */

/* Override the method toString(). It should return
 * the String:
 * Width: width
 * Height: height
 * Angle: angle
 * Remember that to insert a new line into a String,
 * use \n
 */
