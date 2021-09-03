public class SistemaFinanceiro {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        caixaEletronico.autenticar("2");
        caixaEletronico.exibirSaldo();
        caixaEletronico.encerrarUtilizacao();
        caixaEletronico.exibirSaldo();
    }
}
