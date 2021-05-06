public class TestaAnimais {

    public static void main(String[] args) {

        Mamifero camelo = new Mamifero("camelo", "1.50m",
                4, "amarelo","terra", "2.0m/s", "");

        Peixe tubarao = new Peixe("Tubarão", "3.00m","1.5m/s");

        Mamifero urso = new Mamifero("Urso-do-Canadá", "1.80m",4,
                "vermelho", "terra", "0.5m/s","mel");

        System.out.println(camelo.toString());
        System.out.println(tubarao.toString());
        System.out.println(urso.toString());


    }
}
