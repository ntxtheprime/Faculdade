package faculdade;

public class Disciplina {
    
    public String disciplina;
    public String descricao;

    public Disciplina(String nome, String descricao) {
        this.disciplina = nome;
        this.descricao = descricao;
    }

    public String toString() {
        return "Disciplina: " + disciplina + ", Descricao: " + descricao;
    }

    
    
}
