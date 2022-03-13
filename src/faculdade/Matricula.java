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

    public void alteraDisciplinaEImprime(Disciplina disciplina) {
        boolean sucesso = alteraDisciplina(disciplina);
        if (sucesso) System.out.println("Disciplina alterada para: " + this.Disciplina.toString());
        else System.out.println("Não é permitido alterar a disciplina!");
    }

    public void alteraAlunoEImprime(Aluno aluno) {
        boolean sucesso = alteraAluno(aluno);
        if (sucesso) System.out.println("Aluno alterado para: " + this.Aluno.toString());
        else System.out.println("Não é permitido alterar o aluno!");
    }

    public String toString() {
        return "Aluno: " + Aluno.toString() +
                "Disciplina: " + Disciplina.toString();
    }
}
