package bytebanck;

public class TestaContaSemCliente {
public static void main(String[] args) {
	Conta contaMarcela = new Conta();
	
	System.out.println(contaMarcela.saldo);
	System.out.println(contaMarcela.titular);
	
	contaMarcela.titular = new Cliente();
	
	contaMarcela.titular.nome = "Marcela";
	System.out.println(contaMarcela.titular.nome);
	
}
}
