public class ContatoNaoExisteException extends Exception {

    private String nome;

    public ContatoNaoExisteException(String nome) {
        this.nome = nome;
    }

    private String getNome() {
        return this.nome;
    }

    @Override
    public String getMessage() {
        return "Contato não existe" + this.getNome();
    }


}
