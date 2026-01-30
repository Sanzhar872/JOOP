import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальный баланс ($): ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Введите годовую процентную ставку (%): ");
        double interestRate = scanner.nextDouble();

        double interestAmount = initialBalance * (interestRate / 100);

        double newBalance = initialBalance + interestAmount;

        System.out.println("\n|----------------------------------");
        System.out.printf("|Начальный баланс: %.2f$\n", initialBalance);
        System.out.printf("|Процентная ставка: %.1f%%\n", interestRate);
        System.out.printf("|Начислено процентов: %.2f$\n", interestAmount);
        System.out.println("|-----------------------------------");
        System.out.printf("Новый баланс: %.2f$\n", newBalance);

        scanner.close();
    }
}