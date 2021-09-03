public class CaixaEletronico {

    private Conta conta;

    public Cliente autenticar(String numeroConta) {
        Cliente cliente = new Cliente();
        cliente.setNome("John");
        cliente.setSobrenome("Doe");

        ContaCorrente contaCorrente = new ContaCorrente(cliente);

        this.conta = contaCorrente;
        System.out.println("Bem vindo, "+cliente.getNome());
        return cliente;
    }

    public void exibirSaldo() {
        if (this.conta == null) {
            System.out.println("IDENTIFIQUE-SE");
        } else System.out.println("O seu saldo é: R$" + this.conta.consultarSaldo());
    }

    public void efetuarSaque(double valor) {
        if (this.conta.consultarSaldo() >= valor) {
            this.conta.sacar(valor);
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("O seu saldo é: "+this.conta.consultarSaldo());
        } else System.out.println("TRANSAÇÃO NÃO AUTORIZADA");
    }

    public void efetuarDeposito(double valor) {
        this.conta.depositar(valor);
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("O seu saldo é: "+this.conta.consultarSaldo());
    }

    public void encerrar() {
        this.conta = null;
    }
}
