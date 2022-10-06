package encapsulamentovisibilidade;

public class TesteSacaValoresNegativos {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(100);
        conta.saca(200);
        System.out.println(conta.saca(200));
        // DEU ERRO AGORA
        //System.out.println(conta.saldo);

        //Problema quando os métodos são publicos.
        //conta.saldo = conta.saldo - 101;
        //System.out.println(conta.saldo);

        System.out.println(conta.getSaldo());
    }
}
