
public class menor_mayior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lista[] = {6,9,-8,23,3,100,3};
		
		int num1 = lista[0];
		int num2 = lista[0];
		
		for(int i=1; i<lista.length;i++) {
			if(lista[i]<num1) {
				num1 = lista[i];
			}
			if(lista[i]>num2) {
				num2 = lista[i];
				
			}
		}
		System.out.println("num1 "+num1+" num2 "+num2);

	}

}
