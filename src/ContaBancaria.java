public abstract class ContaBancaria implements Conta {
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public abstract void depositar(double valor);
}