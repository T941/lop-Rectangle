import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a width:");
        double width=scanner.nextDouble();
        System.out.println("enter a height:");
        double height=scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("area ="+rectangle.getArea());
        System.out.println("perimeter ="+rectangle.getPerimeter());
        System.out.println(" "+rectangle.display());
    }
}
