public class Peixe extends Animal{

    private String caracteristias;


    public Peixe(String nome, String comprimento, String velocidade) {
        super(nome, comprimento, 0, "cinza", "mar", velocidade);
        this.setCaracteristias("cauda e barbatanas");
    }

    public void setCaracteristias(String caracteristias) {
        this.caracteristias = caracteristias;
    }

    public String getCaracteristias() {
        return caracteristias;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Peixe{" +
                "características='" + caracteristias + '\'' +
                '}';
    }
}
