public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

    private double raio;
    private int altura;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double areaBase = Math.PI * (raio * raio) * altura;
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaTotal = (2 * areaBase) + areaLateral;
        return areaTotal;
    }

    @Override
    public double calcularVolume() {
        double area = Math.PI *(raio * raio) * altura;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cilindro{" +
                "raio=" + raio +
                ", altura=" + altura +
                '}';
    }
}
