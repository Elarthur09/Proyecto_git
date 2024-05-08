//Objetivo :Hacer una interfaz de Usuarios
import java.util.Scanner;

public class Entrada_y_Salida_de_datos {

	public static void main(String[] args) {
		//(System.in) entrada de datos del sistema
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre;");
		String nombre_user = entrada.nextLine();
		
		System.out.println("Introduce edad");
		int edad = entrada.nextInt();
		
		System.out.println("Te llamas "+nombre_user+" y tienes "+edad+" de edad");
		
		
	}

}
