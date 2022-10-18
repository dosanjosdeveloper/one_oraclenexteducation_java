package br.com.dosanjosdeveloper.bytebankherdado;

import java.util.ResourceBundle.Control;

public class TesteReferencias {
	public static void main(String[] args) {
		
		//Gerente g1 = new Funcionario();
		//Todo Funcionario não é Gerente.
		//Todo Gerente é um Funcionário.
		//Funcionario g1 = new Gerente();
		Funcionario g1 = new Gerente();
		g1.setSalario(5000.0);
		g1.setNome("Rafael");
		
		/*
		Funcionario func = new Funcionario();
		func.setSalario(2000.0);
		*/
		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designe ds = new Designe();
		ds.setSalario(2000.0);
		
		ControleBonificacao control = new ControleBonificacao();
		control.registra(g1);
		control.registra(ev);
		//control.registra(func);
		control.registra(ds);
				
		String nome = g1.getNome();
		System.out.println(nome);
		System.out.println(control.getSoma());
				
	}

}
