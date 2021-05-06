public abstract class ContaBancaria {

    private String nome;
    private String numeroConta;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valorSacar){
        if(valorSacar <= this.saldo){
            this.saldo -= valorSacar;
            return true;
        }else{
            System.out.println("Saldo insuficiente.");
        }

        return false;

    }

    public void depositar(double valorDepositar){
        this.saldo += valorDepositar;
    }

    @Override
    public String toString() {
        return "ContaBancaria: " +
                "nome = '" + nome + '\'' +
                ", numeroConta = '" + numeroConta + '\'' +
                ", saldo = R$ " + saldo + ",";
    }
}
