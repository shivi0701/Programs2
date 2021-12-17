import java.util.Scanner;

public class Employee {
     String name;
     int year;
     String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void m1(){
        System.out.println("Name"+"\t"+"Year"+"\t"+"Address");
    }
    public void m2(){
        System.out.println(name+"\t"+year+"\t"+address);
    }
}
class Employeemain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee obj1 = new Employee();
        obj1.setName(sc.nextLine());
        obj1.setYear(sc.nextInt());
        sc.nextLine();
      obj1.setAddress(sc.nextLine());
        Employee obj2 = new Employee();
        obj2.setName(sc.nextLine());
        obj2.setYear(sc.nextInt());
        sc.nextLine();
        obj2.setAddress(sc.nextLine());
        Employee obj3 = new Employee();
        obj3.setName(sc.nextLine());
        obj3.setYear(sc.nextInt());
        sc.nextLine();
        obj3.setAddress(sc.nextLine());
        obj1.m1();
        obj1.m2();
        obj2.m2();
        obj3.m2();
    }
}