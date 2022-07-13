import com.company.Dancer;
import com.company.Programmer;
import com.company.Singer;


public class Main {
    public static void main(String[] args) {


        Programmer programmer = new Programmer("Peter", "Junior Java Developer", "Peaksoft House");

        System.out.println(programmer);
        programmer.walk();
        programmer.learn();
        programmer.eat();
        programmer.coding();

        Dancer dancer = new Dancer("Caroline", "ballerina", "Swan");
        System.out.println(dancer);
        programmer.walk();
        programmer.learn();
        programmer.eat();
        dancer.dance();


        Singer singer = new Singer("Adele", "diamond certified singer", "Diamond");
        System.out.println(singer);
        programmer.walk();
        programmer.learn();
        programmer.eat();
        singer.sing();
        singer.playguitar();


    }
}