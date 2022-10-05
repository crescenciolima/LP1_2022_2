public class Banda_REP {
    private String nome;
    private Musico [] musicos;
    private int indice;
    private static final int MAX = 10;

    public Banda_REP(String nome){
        this.nome = nome;
        musicos = new Musico[MAX];
        indice = 0;
    }

    public void inserir(Musico m){
        musicos[indice] = m;
        indice++;
    }

    public void remover(Musico m){
        for(int i = 0; i < indice; i++){
            if(musicos[i] == m){
                musicos[i] = musicos[indice-1];
                musicos[indice-1] = null;
                indice--;
            }
        }
    }

    public void relatorio(){
        System.out.println("==========================");
        System.out.println("Relatorio utilizando ARRAY");
        System.out.println("Nome da Banda: " + nome);
        for(int i = 0; i < indice; i++){
            musicos[i].imprimir_integrante();
        }
    }
}
