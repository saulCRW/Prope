import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("input 2 numbers to add");
        int a =s.nextInt();
        int b =s.nextInt();
        
        System.out.println("Sum of a and b is: " + (a + b));

    }
}
