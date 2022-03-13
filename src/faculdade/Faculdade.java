package faculdade;

public class Faculdade {

    public static void main(String[] args) {

        // Alunos
        Aluno Joao = new Aluno("João", "00045618956");
        Aluno Pedro = new Aluno("Pedro", "00045618951");

        // Disciplinas
        Disciplina Matematica = new Disciplina("Matematica", "Matematica");
        Disciplina Portugues = new Disciplina("Portugues", "Portugues");

        Matricula matricula1 = new Matricula(Joao, Matematica);


        System.out.println(matricula1);

        // Alterar o aluno:
        matricula1.alteraAluno(Pedro);
        System.out.println(matricula1);

        // Alterar a disciplina:
        matricula1.alteraDisciplina(Portugues);
        System.out.println(matricula1);

//        System.out.println(Joao.toString());
//        System.out.println(Matematica.toString());
//        System.out.println(matricula1.toString());

    }

}
