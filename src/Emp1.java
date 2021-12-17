import java.util.Scanner;

public class Emp1 {
    int sal;
    int hrs;

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    public void getinfo(){
        System.out.println("$"+sal+"  "+hrs);
    }
    public void Addsal(){
        if(sal<500){
            sal= sal+10;
        }
    }
    public void AddWork(){
        if(hrs>6){
            sal= sal+5;
        }
    }
}
class Emp1main {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        Emp1 obj1= new Emp1();
        obj1.setSal(obj.nextInt());
        obj1.setHrs(obj.nextInt());
        obj1.Addsal();
        obj1.AddWork();
        obj1.getinfo();
    }


}