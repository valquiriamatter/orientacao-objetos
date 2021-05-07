public class TestaFiguraGeometrica {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        quadrado.setNome("Quadrado");
        quadrado.setCor("Azul");

        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        circulo.setNome("Círculo");
        circulo.setCor("Rosa");

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(2);
        triangulo.setBase(3);
        triangulo.setNome("Triângulo");
        triangulo.setCor("Amarelo");

        Cubo cubo = new Cubo();
        cubo.setLado(3);
        cubo.setNome("Cubo");
        cubo.setCor("Roxo");

        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(3);
        cilindro.setRaio(2);
        cilindro.setNome("Cilindro");
        cilindro.setCor("Preto");

        Piramide piramide = new Piramide();
        piramide.setAltura(3);
        piramide.setApotema(4);
        piramide.setArestaBase(2);
        piramide.setNumPoli(4);
        piramide.setBase(quadrado);
        piramide.setNome("Pirâmide");
        piramide.setCor("Branco");

        FiguraGeometrica[] fg = new FiguraGeometrica[6];
        fg[0] = quadrado;
        fg[1] = circulo;
        fg[2] = triangulo;
        fg[3] = cubo;
        fg[4] = cilindro;
        fg[5] = piramide;

        for(FiguraGeometrica figura : fg){
            if (figura instanceof Figura2D){
                Figura2D figura2D = (Figura2D) figura;
                System.out.println("Area da figura 2D: " + figura2D.calcularArea());

            }

            if (figura instanceof Figura3D){
                Figura3D figura3D = (Figura3D) figura;
                System.out.println("Area da figura 3D: " + figura3D.calcularArea());
                System.out.println("Volume da figura 3D: " + figura3D.calcularVolume());

            }

            System.out.println(figura.toString() + "\n");
        }
















    }




}
