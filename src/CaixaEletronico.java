public class CaixaEletronico {

    private Conta conta;

    public Cliente autenticar(String numeroConta) {
        Cliente cliente = new Cliente();
        cliente.setNome("Fulano");
        cliente.setSobrenome("de Tal");

        ContaCorrente contaCorrente = new ContaCorrente(cliente, numeroConta);
        this.conta = contaCorrente;

        return cliente;
    }

    public void exibirSaldo() {
        if (this.conta == null) {
            System.out.println("Autentique-se primeiro.");
        } else System.out.println("O seu saldo é: " + this.conta.consultarSaldo());
    }

    public void efetuarSaque(double valor) {
        this.conta.sacar(valor);
        System.out.println("Saque efetuado com sucesso!");
        System.out.println("O seu saldo é: "+this.conta.consultarSaldo());
    }

    public void efetuarDeposito(double valor) {
        this.conta.depositar(valor);
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("O seu saldo é: "+this.conta.consultarSaldo());
    }

    public void encerrarUtilizacao() {

    }
}
