import java.util.Scanner;

public class patron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce un número impar mayor que 2: ");
            n = scanner.nextInt();
        } while (n <= 2 || n % 2 == 0);

        // Imprimir la parte superior del patrón
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        // Imprimir la parte inferior del patrón
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
