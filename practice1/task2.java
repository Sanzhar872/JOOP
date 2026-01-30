import java.util.Scanner;

public class task2{
  public static void main(String[] args){
    // area, perimeter, length of diagonal
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter your length of a side: ");
    int a = scanner.nextInt();

    System.out.println(a*a);
    System.out.println(4*a);
    System.out.printf("%.2f\n", a*Math.sqrt(2) );
    scanner.close();

  }

}