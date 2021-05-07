public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

    private int lado = 0;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {

        double area = (lado * lado) * 6;
        return area;
    }

    @Override
    public double calcularVolume() {

        double volume = lado * lado * lado;
        return volume;

    }

    @Override
    public String toString() {
        return super.toString() +
                "Cubo{" +
                "lado=" + lado +
                '}';
    }
}
