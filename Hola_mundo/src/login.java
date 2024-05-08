import java.util.Scanner;

public class login {

    // Clave numérica configurada
    private static final int claveRegistrada = 1234;
    private static final int MAX_INTENTOS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        System.out.println("Bienvenido al cajero automático");
        
        while (intentos < MAX_INTENTOS) {
            System.out.print("Por favor ingrese su clave: ");
            String entrada = scanner.nextLine();

            try {
                int claveIngresada = Integer.parseInt(entrada);

                if (verificarClave(claveIngresada)) {
                    System.out.println("Hola, bienvenido al cajero");
                    return; // Termina el programa si la clave es correcta
                } else {
                    intentos++;
                    System.out.println("Clave incorrecta. Intento " + intentos + " de " + MAX_INTENTOS);
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor ingrese solo números.");
            }
        }

        System.out.println("Tarjeta bloqueada");
        scanner.close();
    }

    // Método para verificar si la clave ingresada es correcta
    private static boolean verificarClave(int claveIngresada) {
        return claveIngresada == claveRegistrada;
    }
}
//Final