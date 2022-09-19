public class Hospede {
    private int codigo;
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;

    public Hospede(int codigo, String nome, String cpf, String rg, String telefone){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
    }

    public void imprimir_hospede(){
        System.out.println("Codigo do Cliente: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("cpf: " + cpf);
        System.out.println("rg: " + rg);
        System.out.println("Telefone: " + telefone);
    }

}
