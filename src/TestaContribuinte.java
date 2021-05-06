public class TestaContribuinte {

    public static void main(String[] args) {

        PessoaFisica pf1 = new PessoaFisica("Valquiria", 7000.00, "010.551.769-00");
        PessoaFisica pf2 = new PessoaFisica("Caleb", 5000.00, "000.222.333-00");
        PessoaFisica pf3 = new PessoaFisica("Lais", 1000.00, "000.111.222-33");

        PessoaJuridica pj1 = new PessoaJuridica("PolacoTUR", 10000.00, "010.551.769-00");
        PessoaJuridica pj2 = new PessoaJuridica("Padaria", 6000.00, "000.222.333-00");
        PessoaJuridica pj3 = new PessoaJuridica("Igreja", 8000.00, "000.111.222-33");

        pf1.calcularImposto();
        pf2.calcularImposto();
        pf3.calcularImposto();

        pj1.calcularImposto();
        pj2.calcularImposto();
        pj3.calcularImposto();

        System.out.println(pf1.toString());
        System.out.println(pf2.toString());
        System.out.println(pf3.toString());

        System.out.println(pj1.toString());
        System.out.println(pj2.toString());
        System.out.println(pj3.toString());


    }


}
