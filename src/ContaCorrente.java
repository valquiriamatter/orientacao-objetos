public class ContaCorrente {

    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double saldo;
    private double valorEspecialUsado = 0;

    public ContaCorrente(){
    }

    public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial, double saldo, double valorEspecialUsado) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.saldo = saldo;
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public boolean sacar(double quantiaASacar) {


        if (getSaldo() >= quantiaASacar) {  //tem saldo na conta
            setSaldo(getSaldo() - quantiaASacar);
            return true;
        } else {
            if (isEspecial()) { //verifica o limite especial tem saldo

                double limite = getLimiteEspecial() + getSaldo();

                if(limite >= quantiaASacar){
                    setSaldo(getSaldo() - quantiaASacar);
                    return true;
                }else{
                    return false;
                }

            } else {
                return false; //não é especial e não tem saldo suficiente
            }

        }


    }

    public void depositar(double quantiaADepositar){
        setSaldo(getSaldo() + quantiaADepositar);
    }

    public void consultarSaldo(){
        System.out.println("Saldo Atual: R$ " + getSaldo());
    }

    public boolean verificarUsoEspecial(){
        return getSaldo() < 0;
    }
}