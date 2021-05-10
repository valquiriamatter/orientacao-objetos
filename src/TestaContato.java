import java.util.Scanner;

public class TestaContato {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {

            opcao = obterOpcaoMenu(scan);

            if (opcao == 1) { //consultar contato;{
                try {
                    consultarContato(scan, agenda);
                } catch (ContatoNaoExisteException e) {
                    e.printStackTrace();
                }
            } else if (opcao == 2) { //add contato
                addContato(scan, agenda);
            }

        }
    }

    public static void addContato(Scanner scan, Agenda agenda) {
        try {
            System.out.println("Criando um contato, entre com as informações.");
            String nome = leInformacao(scan, "Entre com o nome do contato");
            String telefone = leInformacao(scan, "Entre com o telefone do contato");
            String email = leInformacao(scan, "Entre com o email do contato");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);

            System.out.println("Contato a ser criado: " + contato.toString());
            agenda.adicionarContato(contato);

        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            System.out.println("Contatos da Agenda\n" + agenda);
        }

    }


    public static void consultarContato(Scanner scan, Agenda agenda) throws ContatoNaoExisteException {

        String nomeContato = leInformacao(scan, "Entre com o nome para pequisar");

        if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
            System.out.println("Contato Existe!");
        }


    }


    public static int obterOpcaoMenu(Scanner scanner) {

        boolean entradaValida = false;
        int opcao = 3;


        while (!entradaValida) {

            System.out.println("Digite a opção do Menu: ");
            System.out.println("1:CONSULTAR CONTATO");
            System.out.println("2:ADD CONTATO");
            System.out.println("3:SAIR");

            try {

                String entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;

                } else {
                    throw new Exception("Entrada Inválida! \n");
                }

            } catch (Exception ex) {
                System.out.println("Entrada Inválida, digite novamente.");
            }


        }


        return opcao;
    }


    public static String leInformacao(Scanner scanner, String mensagem) {
        System.out.println(mensagem);
        String entrada = scanner.nextLine();

        return entrada;
    }

}
