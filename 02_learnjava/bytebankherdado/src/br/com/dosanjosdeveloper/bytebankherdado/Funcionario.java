package br.com.dosanjosdeveloper.bytebankherdado;

//N�o podemos intanciar essa classe, pois ela � abstrata.
public abstract class Funcionario {


	private String nome;
	private String cpf;
	private double salario;
	private double bonificacao;

	// metodo sem implementa��o
	public abstract double getBonificacao();

//	public double getBonificacao() {
//		return this.salario * 0.05;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
