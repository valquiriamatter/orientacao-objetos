public class TestaContaCorrente {

    public static void main(String[] args){

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

        boolean saqueEfetuado = conta.sacar(10);

        if(saqueEfetuado){
            System.out.println("Saque Efetuado com sucesso! " + conta.saldo);
        }else{
            System.out.println("Não foi possível sacar, saldo insuficiente! " + conta.saldo);
        }

        saqueEfetuado = conta.sacar(500);

        if(saqueEfetuado){
            System.out.println("Saque Efetuado com sucesso! " + conta.saldo);
        }else{
            System.out.println("Não foi possível sacar, saldo insuficiente! " + conta.saldo);
        }

        conta.depositar(500);
        conta.consultarSaldo();

        if(conta.verificarUsoEspecial()){
            System.out.println("Está usando cheque especial.");
        }else{
            System.out.println("Não está usando cheque especial.");
        }

        conta.sacar(600);

        if(conta.verificarUsoEspecial()){
            System.out.println("Está usando cheque especial.");
        }else{
            System.out.println("Não está usando cheque especial.");
        }



    }



}
