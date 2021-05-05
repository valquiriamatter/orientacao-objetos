public class Calculadora {

    public static double somar(double valor1, double valor2) {
        double soma = valor1 + valor2;
        return soma;
    }

    public static double diminuir(double valor1, double valor2) {
        double diminuicao = valor1 - valor2;
        return diminuicao;
    }

    public static double multiplicar(double valor1, double valor2) {
        double multiplicacao = valor1 * valor2;
        return multiplicacao;
    }

    public static double dividir(double valor1, double valor2) {
        double divisao = valor1 / valor2;
        return divisao;
    }

    public static double potencia(double valor1, double n) {
        return Math.pow(valor1, n);
    }

    public static void imprimir(double resultado) {
        System.out.println(resultado);
    }

    // !5 = 5 * 4 * 3 * 2 * 1 = 120
    // !0 = 1
    // não existe de números negarivos
    public static int fatorial(int num) {

        if (num == 0) {
            return 1;
        }
        int total = 1;
        if (num > 0) {
            for (int i = num; i > 1; i--) {
                total *= i;
            }
        }
        return total;
    }

    public static int fibonacci(int num){

        if(num < 2){
            return 1;
        }
        return fibonacci(num-1) + fibonacci(num-2);


    }

    //5 = 5 + 4 + 3 + 2 + 1
    public static int somatorio(int numero){

        if(numero == 1){
            return 1;
        }

        return numero + somatorio(numero-1);

    }




}
