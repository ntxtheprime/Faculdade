package faculdade;

public class Matricula {

    public Aluno Aluno;
    public Disciplina Disciplina;
    public String status = "aberta";

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.Aluno = aluno;
        this.Disciplina = disciplina;
    }

    public boolean alteraAluno(Aluno aluno) {
        if (status.equals("finalizada")) {
            return false; // Já está finalizada, então não poderá alterar o aluno
        }

        this.Aluno = aluno; // alterando o aluno pelo que foi inserido neste método
        return true;
    }

    public boolean alteraDisciplina(Disciplina disciplina) {
        if (status.equals("finalizada")) {
            return false;
        }

        this.Disciplina = disciplina;
        return true;
    }
}
