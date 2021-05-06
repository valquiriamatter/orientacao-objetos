public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public PessoaJuridica(String nome, Double rendaBruta,String cnpj) {
        super(nome,rendaBruta);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return getRendaBruta() * 0.1;

    }

    @Override
    public String toString() {
        return super.toString() +
                "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                " Imposto à pagar:" + calcularImposto();
    }
}
