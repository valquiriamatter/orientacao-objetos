public class Mamifero extends Animal{

    private String alimento;

    public Mamifero(String nome, String comprimento, int numeroPatas, String cor, String ambiente, String velocidade, String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Mamifero{" +
                "alimento='" + alimento + '\'' +
                '}';
    }
}
