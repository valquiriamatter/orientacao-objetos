public class TestaContaCorrente {

    public static void main(String[] args){

        ContaCorrente conta = new ContaCorrente();

        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldo(-10);

        System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());

        boolean saqueEfetuado = conta.sacar(10);

        if(saqueEfetuado){
            System.out.println("Saque Efetuado com sucesso! " + conta.getSaldo());
        }else{
            System.out.println("Não foi possível sacar, saldo insuficiente! " + conta.getSaldo());
        }

        saqueEfetuado = conta.sacar(500);

        if(saqueEfetuado){
            System.out.println("Saque Efetuado com sucesso! " + conta.getSaldo());
        }else{
            System.out.println("Não foi possível sacar, saldo insuficiente! " + conta.getSaldo());
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
