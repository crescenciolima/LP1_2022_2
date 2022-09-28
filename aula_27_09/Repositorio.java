public class Repositorio {
    private Conta [] BD;
    private int indice;
    private static final int MAX = 10;

    public Repositorio(){
        BD = new Conta[MAX];
        indice = 0;
    }

    public void inserir(Conta c){
        BD[indice] = c;
        indice++;
    }

    public void imprimir(){
        for(int i = 0; i < indice; i++){
            BD[i].imprimir();
        }
    }
    
}
