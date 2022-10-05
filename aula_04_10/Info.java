public class Info {
    private String nome;
    private int idade;
    private char sexo;

    public Info(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void imprimir_info(){
        System.out.println("-----------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
