package tiposlacos;

public class lacosmultiplo3 {
	public static void main(String[] args) {
		for(int i=1; i<=100;i++){
			if (i%3 == 0) {
				System.out.println("É Multiplo de 3: "+i);	
			}
		}
		
		for(int j=3;j<100;j+=3) {
			System.out.println("É Multiplo de 3: "+j);
		}

}
}
