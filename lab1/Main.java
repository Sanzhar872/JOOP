import java.util.Scanner;
import java.util.ArrayList;


public class Main{
  public static void PrintMyName(String argument){
    int len = argument.length();
    String lines = "-".repeat(len);

    System.out.println("+"+ lines + "+");
    System.out.println("|"+argument+"|");
    System.out.println("+"+ lines + "+");
  }

  public static void Geomulator(int a){
    // area, perimeter, length of diagonal

    System.out.println(a*a);
    System.out.println(4*a);
    System.out.printf("%.2f\n", a*Math.sqrt(2) );

  }

  public static void number_to_grade(Float number){
    if (number < 49.5){
        System.out.println("F, retake the course");
    }else if(number>=49.5 && number < 54.5){
        System.out.println("D");
    }else if(number >= 54.5 && number < 59.5){
        System.out.println("D+");
    }else if(number >= 59.5 && number < 64.5){
        System.out.println("C-");
    }else if(number >= 64.5 && number < 69.5){
        System.out.println("C");
    }else if(number >= 69.5 && number < 74.5){
        System.out.println("C+");
    }else if(number >= 74.5 && number < 79.5){
        System.out.println("B-");
    }else if(number >= 79.5 && number < 84.5){
        System.out.println("B");
    }else if(number >= 84.5 && number < 89.5){
        System.out.println("B+");
    }else if(number >= 89.5 && number < 94.5){
        System.out.println("A-");
    }else{
        System.out.println("A");
    }
  }

  public static boolean is_paliondrom(String original){
    int l = 0;
    int r = original.length()-1;
    while(l<r){
      if (original.charAt(l) != original.charAt(r)){
        return false;
      }
      l++;
      r--;
    }

    return true;
  }

  public static void main(String[] args) {
    /*
    1. input/output
    2. variable, datatypes
    3. conditional statements
    4. loops
    5. functions/methods
    6. data structures
    7. basic usage of all of them
    */

    Scanner scanner = new Scanner(System.in);
    System.out.println("enter your name: \n");
    String Name = scanner.nextLine();

    //1
    System.out.println("Erkebulan Toktar "+ Name);
    System.out.print("men sagan vizov tashlaim \n");
    System.out.println("---------------------------");
    PrintMyName(Name);

    //2
    System.out.println("enter length of a side of  square: ");
    int side = scanner.nextInt();
    scanner.nextLine();
    Geomulator(side);

    //3
    System.out.println("enter your grade: ");
    String temp = scanner.nextLine();
    Float num = Float.parseFloat(temp);
    number_to_grade(num);

    //4
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

    //6
    System.out.println("enter string: ")
    String original = scanner.nextLine();
    
    if (is_paliondrom(original)){
      System.out.println("string is paliondrom");
    }else{
      System.out.println("string is NOT paliondrom");
    }

    scanner.close();
  }
}