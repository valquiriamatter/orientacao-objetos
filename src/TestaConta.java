public class TestaConta {

    public static void main(String[] args) {

        ContaEspecial contaEspecial = new ContaEspecial();

        contaEspecial.setNome("Valquiria");
        contaEspecial.setNumeroConta("21733-6");
        contaEspecial.setLimite(500);

        contaEspecial.depositar(100);

        try{
            if(contaEspecial.sacar(700)){
                System.out.println("Saque efetuado com sucesso.");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(contaEspecial);

        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.setSaldo(500);
        contaPoupanca.setDiaRendimento(7);
        contaPoupanca.calcularNovoSaldo(0.50);

        System.out.println(contaPoupanca.toString());



    }

}
