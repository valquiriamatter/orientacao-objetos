import java.util.Scanner;

public class TestaAluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite seu Nome");
        aluno.setNome(scan.next());

        System.out.println("Digite sua Matrícula");
        aluno.setMatricula(scan.next());

        System.out.println("Digite o Nome do seu Curso");
        aluno.setNomeCurso(scan.next());

        for(int i = 0; i< aluno.getNomeDisciplinas().length; i++){

            System.out.println("Digite a Disciplina " + (i+1));
            aluno.setNomesDisciplinasPos(i,scan.next());

        }

        for(int i = 0; i< aluno.getNotasDisciplinas().length; i++) {
            System.out.println("Obtendo Notas da Disciplina " + aluno.getNomeDisciplinas()[i]);
            for (int j = 0; j< aluno.getNotasDisciplinas()[i].length; j++) {
                System.out.println("Entre com a nota: " + (j+1));
                aluno.setNotaPosIJ(i,j,scan.nextDouble());


            }

        }

        aluno.mostrarInfo();

        for(int i = 0; i< aluno.getNotasDisciplinas().length; i++) {
            if(aluno.verificarAprovacão(i)){
                System.out.println("Disciplina: " + aluno.getNomeDisciplinas()[i] + " Aprovado!");
            }else {
                System.out.println("Disciplina: " + aluno.getNomeDisciplinas()[i] + " Reprovado!");
            }


        }


    }

}
