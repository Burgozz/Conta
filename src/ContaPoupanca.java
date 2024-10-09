
public class ContaPoupanca extends Conta {
    private float saldoPoupanca;

    public void saque(float valor) {
        if (saldo + saldoPoupanca < valor ) {
            System.out.println("Saldo é insuficiente");
        } else {
            if (saldo < valor) {
                valor -= saldo;
                saldo = 0;
                saldoPoupanca -= valor;
            } else {
                saldo -= valor;
            }
            System.out.println("Saque efetuado com sucesso");
        }
    }

    public float getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(float saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }
}
