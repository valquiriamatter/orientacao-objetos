import java.util.Scanner;

public class TestaCalculadora {

    public static void main(String[] args) {


        Calculadora.imprimir(Calculadora.somar(1,2));
        Calculadora.imprimir(Calculadora.diminuir(2,1));
        Calculadora.imprimir(Calculadora.multiplicar(2,2));
        Calculadora.imprimir(Calculadora.dividir(4,2));
        Calculadora.imprimir(Calculadora.potencia(2,3));

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite um número para calcular o fatorial");
        int num = scan.nextInt();

        Calculadora.imprimir(Calculadora.fatorial(num));

        for(int j=0; j<10; j++){
            System.out.print(Calculadora.fibonacci(j) + " ");
        }

        System.out.println(Calculadora.somatorio(5));


    }



}
