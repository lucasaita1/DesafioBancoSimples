public class Main {
    public static void main(String[] args) {

        Conta conta1 = new ContaCorrente(100);
        conta1.depositar(1000);
        System.out.println("Saldo Conta Corrente: " + conta1.consultarSaldo());

        Conta conta2 = new ContaPoupanca(100);
        conta2.depositar(1000);
        System.out.println("Saldo Conta Poupança: " + conta2.consultarSaldo());
    }
}
