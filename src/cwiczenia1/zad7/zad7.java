package cwiczenia1.zad7;
import java.util.Scanner;
public class zad7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź nieparzystą liczbę nie mniejszą niż 5: ");
        int n = scanner.nextInt();

        while (n < 5 || n % 2 == 0) {
            System.out.println("Błąd. Wprowadź liczbę jeszcze raz: ");
            n = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n
                        || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();


        }
    }
}

