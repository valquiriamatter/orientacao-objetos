import java.util.Scanner;

public class TestaAgenda {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome da agenda");
        agenda.setNome(scan.nextLine());

        Contato contatos[] = new Contato[3];

        for(int i=0; i<3; i++){

            System.out.println("Entre com as informações do contato: " + (i+1));
            Contato c = new Contato();

            System.out.println("Entre com o nome do contato: " + (i+1));
            c.setNome(scan.nextLine());
            System.out.println("Entre com o telefone do contato: " + (i+1));
            c.setTelefone(scan.nextLine());
            System.out.println("Entre com o email do contato: " + (i+1));
            c.setEmail(scan.nextLine());

            contatos[i] = c;

        }

        agenda.setContatos(contatos);


        if(agenda != null){
            System.out.println(agenda.obterInfo());
        }

    }



}
