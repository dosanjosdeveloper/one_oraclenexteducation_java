package bytebankcapsulado;

public class TesteGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1337);
        System.out.println(conta.getNumero());
        
        Cliente paulo = new Cliente();
        //conta.titular = paulo;
       paulo.setNome("Paulo Silveira!");
        conta.setTitular(paulo);
        
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Progamador");
        System.out.println();
        
        Cliente titularConta = conta.getTitular();
        titularConta.setProfissao("Amador!!");
        System.out.println(titularConta.getProfissao());
    }
}
