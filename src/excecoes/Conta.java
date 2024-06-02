package excecoes;

public class Conta {
    private Double saldo;

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    public void sacar(Double valor) {
        if(valor > saldo) {
            throw new SaldoInsuficienteException();
        }
        saldo -= valor;
    }

    public Double getSaldo() {
        return this.saldo;
    }
}
