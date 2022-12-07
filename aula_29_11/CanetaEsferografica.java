public class CanetaEsferografica implements Caneta{
    private String cor;

    public CanetaEsferografica(String cor){
        this.cor = cor;
    }

    public void escrever(String texto){
        System.out.println("Escrevendo " + texto + " com caneta esferografica " + cor);
    }

    public String getCor(){
        return cor;
    }

}
