import java.util.Scanner;

class Author{
    String author;
    Author(String author){
        this.author=author;
    }
}

public class Book {
    String name;
    double price;
    int qtyinStock;

    Book(String name, double price, int qtyinStock){
        this.name=name;
        this.price=price;
        this.qtyinStock=qtyinStock;
    }
}
class Bookmain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book obj= new Book(sc.nextLine(),sc.nextDouble(),sc.nextInt());
        sc.nextLine();
        Author obj1= new Author(sc.nextLine());
        System.out.println("Name = "+obj.name);
        System.out.println("Author = "+obj1.author);
        System.out.println("Price = "+obj.price);
        System.out.println("Quantity = "+obj.qtyinStock);
    }
}