
public class algun_error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {10,2,1,30};
		int i;
		int temp;
		
		
		for(int j=0;j<num.length-1;j++) {
			for(i = 0;i< num.length-1;i++) {
				if(num[i]<num[i+1]) {
					temp = num[i];
					num[i]=num[i+1];
					num[i+1]= temp;
				}
			}
			
		}
		System.out.println(num[0] + "&"+ num[num.length-1]);
	
	}

}
