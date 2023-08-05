import java.util.Scanner;

public class HelloJack {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.print("What is your name?\n");

        String name = s.nextLine();

        System.out.println("Hello, " + name);
    }

}
