package encapsulamentovisibilidade;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;

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
