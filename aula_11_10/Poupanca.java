public class Poupanca extends Conta{

    private double limite;

    public Poupanca(String numero, double saldo, double limite){
        super(numero, saldo);
        this.limite = limite;
    }
    
    public void renderJuros(double taxa){
        //saldo = saldo + (saldo*taxa);
        creditar(saldo*taxa);
    }

    @Override
    public void imprimir(){
        //super.imprimir();
        System.out.println("Numero da Poupanca: " + numero);
        System.out.println("Saldo da Poupanca: " + saldo);
        System.out.println("Limite da Conta: " + limite);
    }
}
