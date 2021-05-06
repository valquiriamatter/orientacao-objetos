import java.util.Scanner;

public class TestaCurso {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do curso: ");
        String nomeCurso = scan.nextLine();

        System.out.println("Digite o horário do curso: ");
        String horario = scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nomeCurso);
        curso.setHorarios(horario);

        System.out.println("Digite o nome do professor do curso: ");
        String nomeProfessor= scan.nextLine();

        System.out.println("Entre com o departamento do professor: ");
        String departamentoProfessor = scan.nextLine();

        System.out.println("Entre com o email do professor: ");
        String email = scan.nextLine();

        Professor professor = new Professor();
        professor.setNome(nomeProfessor);
        professor.setEmail(email);
        professor.setDepartamento(departamentoProfessor);

        curso.setProfessor(professor);

        System.out.println("---- Alunos -----");

        Aluno alunos[] = new Aluno[5];

        //recebe os 5 alunos
        for (int i = 0; i < 5; i++) {

            scan.nextLine();

            System.out.println("Digite o nome do aluno: " + (i + 1));
            String nomeAluno = scan.nextLine();

            System.out.println("Digite a matrícula do aluno: " + (i + 1));
            String matricula = scan.nextLine();

            double[] notas = new double[4];

            for (int j = 0; j < 4; j++) {
                System.out.println("Digite a nota " + (j+1) + " do aluno: " + (i + 1));
                notas[j] = scan.nextDouble();
            }

            Aluno aluno1 = new Aluno();
            aluno1.setNome(nomeAluno);
            aluno1.setMatricula(matricula);
            aluno1.setNotas(notas);

            alunos[i] = aluno1;
        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());

    }

}
