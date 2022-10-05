public class Banda {
    private String nome;
    private Musico M1;
    private Musico M2;
    private Musico M3;

    public Banda(String nome, Musico M1, Musico M2, Musico M3){
        this.nome = nome;
        this.M1 = M1;
        this.M2 = M2;
        this.M3 = M3;
    }

    public void relatorio(){
        System.out.println("==================");
        System.out.println("Relatorio da PROVA");
        System.out.println("Nome da banda: " + nome);
        M1.imprimir_integrante();
        M2.imprimir_integrante();
        M3.imprimir_integrante();
    }

}
