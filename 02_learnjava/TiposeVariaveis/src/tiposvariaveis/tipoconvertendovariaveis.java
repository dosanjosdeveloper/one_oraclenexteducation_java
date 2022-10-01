package tiposvariaveis;

public class TipoConvertendoVariaveis {

	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrande = 32432423523L;
		short valorPequeno = 2131;
		byte b = 127;
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
		System.out.println(numeroGrande);
		System.out.println(valorPequeno);
		System.out.println(b);
	}

}
