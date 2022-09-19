public class Curso {
    private int codigo;
    private String nome;

    public Curso(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public void imprimir_curso(){
        System.out.println("Nome do curso: " + nome);
        System.out.println("Codigo do curso: " + codigo);
    }
}
