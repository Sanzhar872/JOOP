import java.util.Scanner;

public class task4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a,b,c coefficients in a row: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.nextLine();
        double d = b*b - 4*a*c;
        if (d < 0){
        System.out.println("Discriminant is negative");
        }else{
        double sqrtD = Math.sqrt(d);
        double divisor = 2*a;

        if (d==0){
            double x = -b / divisor;
            System.out.printf("the equation has one root: %.2f\n", x);
        }else{
            double x1 = (-b+sqrtD)/divisor;
            double x2 = (-b-sqrtD)/divisor;
            System.out.printf("the equation has two roots: %.2f and %.2f\n", x1, x2);
        }
        }

        scanner.close();
    }
}