package bytebanck;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposta(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// destino.saldo+=valor;
			// OU
			destino.deposta(valor);
			return true;
		}
		return false;
	}
}
