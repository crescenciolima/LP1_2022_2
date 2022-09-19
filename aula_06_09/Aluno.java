public class Aluno {
    private String nome;
    private String CPF;
    private int idade;
    private Curso cursoAluno;

    public Aluno(String nome, String CPF, int idade, Curso cursoAluno){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.cursoAluno = cursoAluno;
    }

    public void imprimir_aluno(){
        System.out.println("--------");
        System.out.println("Nome do aluno: " + nome);
        System.out.println("CPF do aluno: " + CPF);
        System.out.println("Idade do aluno: " + idade);
        //System.out.println("Curso do aluno:" + cursoAluno);
        cursoAluno.imprimir_curso();
    }

}
