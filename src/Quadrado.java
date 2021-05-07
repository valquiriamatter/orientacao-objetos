public class Quadrado extends Figura2D implements DimensaoSuperficial {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }


    @Override
    public double calcularArea() {

        double area = this.lado * this.lado;
        return area;

    }

    @Override
    public String toString() {
        return super.toString() +
                " Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
