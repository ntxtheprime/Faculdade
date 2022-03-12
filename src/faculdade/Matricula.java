package faculdade;

public class Matricula {
    
    public String status;

    public Matricula(String status) {
        this.status = status;
    }
    
    public boolean alteraAluno(){
        if (status.equals("finalizada")){
            System.out.println("Alterado com sucesso");
            return true;
        }
        System.out.println("Impossivel aletar o aluno de curso, matricula está finalizada");
        return false;
    }
    public boolean alteraDisciplina(){
        if (!status.equals("finalizada")){
            System.out.println("Disciplina alterada com sucesso");
            return true;
        }
        System.out.println("Impossivel alterar, a matricula está finalizada");
        return false;
    }
    
    
}
