public class Contador {

    private static int contadorClasse;

    public Contador(){
        contadorClasse++;
    }

    public static void setContadorClasse(int contadorClasse) {
        Contador.contadorClasse = contadorClasse;
    }

    public static int getContadorClasse() {
        return contadorClasse;
    }

    public static void zerarContador(){
        contadorClasse = 0;
    }

    public static void incrementarContador(int valor){
        contadorClasse += valor;
    }

    public static void incrementarContador1(){
        Contador.contadorClasse ++;
    }




}
