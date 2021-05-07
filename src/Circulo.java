public class Circulo extends Figura2D implements DimensaoSuperficial{

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {

        double area = Math.PI * (Math.pow(raio,2));
        return area;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Circulo{" +
                "raio=" + raio +
                '}';
    }
}
