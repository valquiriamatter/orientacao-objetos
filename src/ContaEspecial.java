public class ContaEspecial extends ContaBancaria {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valorSacar) {

        double saldoTotal = this.getLimite() + super.getSaldo();

        if (valorSacar <= saldoTotal) {
            double novoSaldo = saldoTotal - valorSacar;
            super.setSaldo(novoSaldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente, não foi possível sacar.");
        }

        return false;

    }

    @Override
    public String toString() {
        return super.toString() +
                " Limite = R$ " + limite;
    }
}

