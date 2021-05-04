public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;
    double valorEspecialUsado = 0;

    boolean sacar(double quantiaASacar) {


        if (saldo >= quantiaASacar) {  //tem saldo na conta
            saldo -= quantiaASacar;
            return true;
        } else {
            if (especial) { //verifica o limite especial tem saldo

                double limite = limiteEspecial + saldo;

                if(limite >= quantiaASacar){
                    saldo -=quantiaASacar;
                    return true;
                }else{
                    return false;
                }

            } else {
                return false; //não é especial e não tem saldo suficiente
            }

        }


    }

    void depositar(double quantiaADepositar){
        saldo += quantiaADepositar;
    }

    void consultarSaldo(){
        System.out.println("Saldo Atual: R$ " + saldo);
    }

    boolean verificarUsoEspecial(){
        return saldo < 0;
    }

}