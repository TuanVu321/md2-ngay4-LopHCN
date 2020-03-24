import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai");
        double width = scanner.nextDouble();
        System.out.println("nhap chieu rong");
        double height = scanner.nextDouble();
        Rectangle rectangle1 = new Rectangle(width, height);
        rectangle1.display();
    }
}
