package bytebankcapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,24229);
		//conta.setAgencia(-50);
		//conta.setNumero(-320);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(12231223);
		
		Conta conta2 = new Conta(1337,454698);
		Conta conta3 = new Conta(1337,568848);
		
	 System.out.println(conta2.getTotatl());
	 //Ou
	 System.out.println(Conta.getTotatl());
		
	}
}
