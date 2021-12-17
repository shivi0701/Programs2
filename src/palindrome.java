import java.util.Scanner;

public class palindrome{
    int num;
    int rev;
    int r;
    int temp;
    palindrome(int num)
    {
        this.num=num;
        temp=num;
    }
    public void check()
    {
        while(num>0)
        {
            r=num%10;
            rev=(rev*10)+r;
            num=num/10;
        }
        //System.out.println(temp);
        //System.out.println(rev);
      if(temp==rev)
      {
          System.out.println("Is a Palindrome");
      }
      else
      {
          System.out.println("Not a Palindrome");
      }
    }
}
class Palindromemain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        palindrome obj= new palindrome(sc.nextInt());
        obj.check();
    }
}