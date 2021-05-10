import java.util.Arrays;

public class Agenda {

    private String nome;
    private Contato[] contatos;


    public Agenda() {
        contatos = new Contato[5];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos){
            if (c != null){
                s += c.toString() + "\n";
            }
        }
        return s;
    }

    public String obterInfo() {

        String info = "Nome: " + this.nome + "\n";

        if (contatos != null) {
            for (Contato c : contatos) {
                info += c.obterInfo() + "\n";
            }
        }
        return info;
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException{

        boolean cheia = true;
        for (int i=0; i<contatos.length; i++){
            if (contatos[i] == null){
                contatos[i] = c;
                cheia = false;
                break;
            }
        }

        if (cheia){
            throw new AgendaCheiaException();
        }
    }

    public int consultaContatoPorNome(String nome) {

        try {
            for (Contato contato : contatos) {
                if (contatos != null) {
                    if (contato.getNome().equalsIgnoreCase(nome)) {
                        return contato.getId();

                    }

                }
            }
        } catch (Exception ex) {
            System.out.println("Contato não Existe!");
        }

        return -1;
    }
}