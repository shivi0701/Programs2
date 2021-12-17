import java.util.Scanner;

public class array1 {
    int n[];
    int c=0;
    array1() {
        n = new int[5];
        Scanner sc = new Scanner(System.in);
        for (var i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
        }
    }
    public void display(){
        for(var i=0;i<5;i++){
            if(n[i]==4 || n[i]==1){
                c++;
            }
            else
                continue;
        }
        if(c==5){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

}
class array1main{
    public static void main(String[] args) {
        array1 obj=new array1();
        obj.display();
    }
}