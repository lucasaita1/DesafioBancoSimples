public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
}