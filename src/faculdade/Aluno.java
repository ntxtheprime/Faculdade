package faculdade;

public class Aluno {
    
    public String nome;
    public String cpf;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public Matricula status;
    public String toString() {
        return "Nome: " + nome +
               ", Cpf: " + cpf;
    }    
    
}
