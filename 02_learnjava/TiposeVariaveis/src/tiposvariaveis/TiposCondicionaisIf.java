package tiposvariaveis;

public class TiposCondicionaisIf {
	public static void main(String[] args) {
		int idade = 18;
		int quantidadePessoas = 1;
		
		if(idade >= 18) {
			System.out.println("Entrada Liberada!!!");
		}else {
			System.out.println("Entrada não permitida!!!");
		}
		
		// Testando o OR OU
		
		if(idade >=18 || quantidadePessoas >=2) {
			System.out.println("Pode entrar!!!");
		}else {
			System.out.println("Não Pode Entrar!!!");
		}
		
		// Testando o AND &&
		if(idade >=18 && quantidadePessoas >=2) {
			System.out.println("Pode entrar!!!");
		}else {
			System.out.println("Não Pode Entrar!!!");
		}
		
		//Testando com booelan
		boolean acompanhado = true;
		if(idade >=18 || acompanhado) {
			System.out.println("Pode entrar!!!");
		}else {
			System.out.println("Não Pode Entrar!!!");
		}
		
		if(idade >=18 && acompanhado) {
			System.out.println("Pode entrar!!!");
		}else {
			System.out.println("Não Pode Entrar!!!");
		}
	}
}
