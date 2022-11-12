import java.util.Scanner;

public class Main {
    public static double circumference(double radius){
        var a = (2 * 3.14 * radius);
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println(circumference (radius));
    }
}