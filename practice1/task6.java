import java.util.Scanner;

public class task6{
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

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string: ");
        String original = scanner.nextLine();
        
        if (is_paliondrom(original)){
        System.out.println("string is paliondrom");
        }else{
        System.out.println("string is NOT paliondrom");
        }

        scanner.close();
    }
}