import java.util.Scanner;

public class Student {
    String name;
    Student(String name ){
        this.name=name;
    }
    public void display(){
        if(name==""){
            System.out.println("Unknown");
        }
        else{
            System.out.println(name);
        }

    }
}
class studentmain{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student obj = new Student(sc.nextLine());
        obj.display();
    }
}