public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            double valorComTaxa = valor * 0.99; // 1% de taxa
            saldo += valorComTaxa;
        }
    }
}