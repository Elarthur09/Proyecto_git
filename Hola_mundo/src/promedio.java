
public class promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int listasnota[] = {12,10,10,9};
		
		double promedio = 0;
		
		for(int i=0;i<listasnota.length;i++) {
			promedio = promedio + listasnota[i];
		}
		promedio = promedio/listasnota.length;
		System.out.println(promedio);
	}

}
