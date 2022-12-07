public class Exemplo_2 {
    public static void main(String[] args) throws Exception {
        String frase = null;
        String novaFrase = null;
        try{
            novaFrase = frase.toUpperCase();
        }catch(NullPointerException e){
            System.out.println("A frase está nula");
            System.out.println("Erro: " + e);
            frase = "Frase vazia";
        }finally{
            novaFrase = frase.toUpperCase();
        }
        
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }
}
