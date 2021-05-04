public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    boolean ligada;

    void ligarLampada(){
        ligada = true;
        System.out.println("A lâmpada foi ligada.");
    }

    void desligarLampada(){
        ligada = false;
        System.out.println("A lâmpada foi desligada.");
    }

    void mostrarEstado(){
        if(ligada){
            System.out.println("A lampada está ligada.");
        }else {
            System.out.println("A lampada está desligada.");
        }
    }

    void mudarEstado(){
        if(ligada) {
            desligarLampada();
        }else {
            ligarLampada();
        }
    }

}
