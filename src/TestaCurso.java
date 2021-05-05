import java.util.Scanner;

public class TestaCurso {

    public static void main(String[] args) {

        Curso curso = new Curso();
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        //recebe os 5 alunos
        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o nome do aluno: " + (i + 1));
            aluno.setNome(scan.nextLine());

            System.out.println("Digite a matrícula do aluno: " + (i + 1));
            aluno.setMatricula(scan.nextLine());

            for (int j = 0; j < 4; j++) {
                System.out.println("Digite a nota " + (j+1) + "do aluno: " + (i + 1));
                //aluno.setNotasDisciplinas[i][j] = scan.nextLine();

            }

            //curso.setAlunos(alunos[i]);
        }


    }

}
