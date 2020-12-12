import java.util.Scanner;

public class sumoftwonum {
    public static void main(String args[]) {
    Scanner ip = new Scanner(System.in);    
    System.out.println("Enter A value");
    Integer a = ip.nextInt();
    System.out.println("Enter B value");
    Integer b = ip.nextInt();
    System.out.println("sum of two numbere "+(a+b));
    ip.close();
}
}
