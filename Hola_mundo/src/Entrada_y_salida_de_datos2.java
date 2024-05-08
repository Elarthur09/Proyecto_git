//Objetivo es meter datos en la consola
import javax.swing.*;

public class Entrada_y_salida_de_datos2 {

	public static void main(String[] args) {
		
		String name_user = JOptionPane.showInputDialog("Introduce tu nombre");
		String edad = JOptionPane.showInputDialog("Introduce edad");
		
		//Parseamos la edad
		int edad_user = Integer.parseInt(edad);
		
		System.out.println("Hola tu nombre es "+ name_user + " tu edad es " +edad_user);
	

	}

}
