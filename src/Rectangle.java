import java.util.Scanner;

public class Rectangle {
      float length;
      float breadth;
      
    Rectangle(float length, float breadth){
         this.length=length;
         this.breadth=breadth;
    }
    public float Area(){
        float area= length*breadth;
        return area;
    }
}
class Rectanglemain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Rectangle obj = new Rectangle(sc.nextFloat(),sc.nextFloat());
        float a=obj.Area();
        System.out.println(a);
    }

}