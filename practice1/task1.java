import java.util.Scanner;

public class task1{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter your name: ");
    String name = scanner.nextLine();

    int len = name.length();
    String lines = "-".repeat(len);

    System.out.println("+"+ lines + "+");
    System.out.println("|"+name+"|");
    System.out.println("+"+ lines + "+");
  }

}