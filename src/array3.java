import java.util.Scanner;

public class array3 {
    int n[];
    int ele;
    int c=0;
    array3() {
        n = new int[5];
        Scanner sc = new Scanner(System.in);
        for (var i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
        }
        ele= sc.nextInt();
    }
    public void display(){
        for(var i=0;i<5;i++){
            if(n[i]==ele){
               c++;
            }
        }
        if(c==0){
            System.out.println("Element not found.");
        }
        else {
            System.out.println("Element found.");
        }
    }
}
class array3main{
    public static void main(String[] args) {
        array3 obj=new array3();
        obj.display();
    }
}