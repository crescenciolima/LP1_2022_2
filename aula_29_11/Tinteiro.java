public class Tinteiro implements Caneta {
    private String cor;

    public Tinteiro(String cor){
        this.cor = cor;
    }

    public void escrever(String texto){
        System.out.println("Escrevendo " + texto + " com caneta tinteiro " + cor);
    }
    
    public String getCor(){
        return cor;
    }

}
