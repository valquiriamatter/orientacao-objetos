public class TestaContador {

    public static void main(String[] args) {

        Contador.incrementarContador1();
        imprimirValor();
        Contador.incrementarContador(10);
        imprimirValor();
        Contador.zerarContador();
        imprimirValor();

        Contador.incrementarContador1();
        Contador.incrementarContador1();
        Contador.incrementarContador1();
        imprimirValor();

        Contador c1 = new Contador();

        imprimirValor();

        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimirValor();

    }

    static void imprimirValor(){
        System.out.println(Contador.getContadorClasse());
    }


}
