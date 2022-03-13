package faculdade;

public class Faculdade {

    public void main(String[] args) {

        Aluno Joao = new Aluno("João", "00045618956");
        Disciplina Matematica = new Disciplina("Matematica", "Matematica");
        Aluno Pedro = new Aluno("Pedro", "00045618951");
        Matricula matricula1 = new Matricula(Joao, Matematica);
        
        
        
        System.out.println(Joao.toString());
        System.out.println(Matematica.toString());
        System.out.println(matricula1.toString());
        
    }
    
}
