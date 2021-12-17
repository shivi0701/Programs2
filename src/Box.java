import java.util.Scanner;

public class Box {
    private int height;
    private int width;
    private int depth;

    Box(int height,int width,int depth){
        this.height= height;
        this.width=width;
        this.depth=depth;
    }
    public void Volume(){
        double volume= height*width*depth;
        System.out.println(volume);
    }
}
class boxmain{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Box obj= new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
        obj.Volume();
    }
}