public class Triangulo extends Figura2D implements DimensaoSuperficial{

    private double base = 0;
    private double altura = 0;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        double area = base * altura / 2;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
