public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public void creditar(double valor){
        saldo += valor;
    }
    
    public void debitar(double valor){
        if (saldo >= valor){
            saldo -= valor;
        }else{
            System.out.println("Saldo Insuficiente.");
        }
    }

    public void imprimir(){
        System.out.println("_____________");
        System.out.println("Numero da conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}