package bytebankcapsulado;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    //Composição
    private Cliente titular;
    
    private static int total;
    
    public static int getTotatl() {
    	return Conta.total;
    }
    
    public Conta() {
    	
    }
    
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	this.agencia = agencia;
    	this.numero = numero;
    	//System.out.println("Tota de Contas "+total);
    	//System.out.println("Estou abrindo uma conta "+this.numero+"!!\nAgência "+this.agencia);
    	
    }
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
    public Cliente getTitular() {
		return titular;
	}

    public int getNumero(){
     return this.numero;
    }

    public void setNumero(int novoNumero){
    	if(novoNumero <=0) {
    		System.out.println("Número de agência Inválido");
    		return;
    	}
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
    	if(agencia <=0) {
    		System.out.println("O numero de agencia é inválido!!!");
    		return;
    	}
        this.agencia = agencia;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.saldo = valor;
            //OU
            destino.depositar(valor);
            return true;
        }
        return true;
    }
}
