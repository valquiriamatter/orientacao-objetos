public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{

    private int altura;
    private double arestaBase;
    private double apotema;
    private int numPoli;
    private Figura2D base;


    public int getNumPoli() {
        return numPoli;
    }

    public void setNumPoli(int numPoli) {
        this.numPoli = numPoli;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }




    @Override
    public double calcularArea() {
        if(base!= null){
            double v = numPoli * ((arestaBase * apotema) / 2 + base.calcularArea());
            return v;
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
       if(base != null) {
           return (base.calcularArea() * altura) / 3;
       }
       return 0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Piramide{" +
                "altura=" + altura +
                ", arestaBase=" + arestaBase +
                ", apotema=" + apotema +
                ", numPoli=" + numPoli +
                ", base=" + base +
                '}';
    }
}
