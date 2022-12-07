import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("234-4", 100.0);
        try{
            c1.debitar(102.0);
        }catch(SIException e){
            System.out.println("Erro: " + e);
            System.out.println("Por favor insira mais money!");
        }finally{
            Scanner input = new Scanner(System.in);
            System.out.println("Insira um valor adicional: ");
            c1.creditar(input.nextDouble());
            c1.debitar(102.0);
        }
        
    }
}
