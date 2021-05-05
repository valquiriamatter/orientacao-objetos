public class Lampada {

    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean ligada;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }


    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public String getTensao() {
        return tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getCor() {
        return cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void ligarLampada(){
        setLigada(true);
    }

    public void desligarLampada(){
        setLigada(false);
    }

    public void mostrarEstado(){
        if(isLigada()){
            System.out.println("A lampada está ligada.");
        }else {
            System.out.println("A lampada está desligada.");
        }
    }

    public void mudarEstado(){
        if(ligada) {
            desligarLampada();
        }else {
            ligarLampada();
        }
    }

}
