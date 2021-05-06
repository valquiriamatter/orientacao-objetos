public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;
    private double[] notas;

    public Aluno() {
        nomeDisciplinas = new String[3];
        notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3];
        //this.notasDisciplinas = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome do Curso: " + getMatricula());

        for (int i = 0; i < getNotasDisciplinas().length; i++) {
            System.out.println("Notas da Disciplina: " + getNomeDisciplinas()[i]);
            for (int j = 0; j < getNotasDisciplinas()[i].length; j++) {
                System.out.print(getNotasDisciplinas()[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean verificarAprovacão(int indice) {

        double soma = 0;

        for (int i = 0; i < getNotasDisciplinas()[indice].length; i++) {
            soma += getNotasDisciplinas()[indice][i];
        }

        double media = soma / 4;

        if (obterMedia(indice) >= 7) {
            return true;

        }
        return false;

    }

    private double obterMedia(int indice) {

        double soma = 0;

        for (int i = 0; i < getNotasDisciplinas()[indice].length; i++) {
            soma += getNotasDisciplinas()[indice][i];
        }
        double media = soma / 4;

        return media;


    }

    public void setNomesDisciplinasPos(int pos, String nomeDisciplina) {
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }

    public void setNotaPosIJ(int posI, int posJ, double nota) {
        this.notasDisciplinas[posI][posJ] = nota;
    }


    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfo(){

        String info = " Aluno: " + this.nome + "; ";
        info += "Matricula: " + this.matricula + "; ";
        info += "Notas: ";

        double soma = 0;

        for (double nota : notas){
            info += nota + " ";
            soma += nota;
        }

        double media = soma/4;
        info += "\nMédia: " + media + " - ";

        if(media>=7){
            info += "Aprovado!";
        }else{
            info += "Reprovado!";
        }

        return info;
    }

    public double obterMedia(){
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }

        return soma/4;
    }
}
