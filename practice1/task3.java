import java.util.Scanner;

public class task3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your grade: ");

        double number = scanner.nextDouble();


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
}