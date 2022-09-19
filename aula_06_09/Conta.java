public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numeroInicial, double saldoInicial){
        numero = numeroInicial;
        saldo = saldoInicial;
    }

    public Conta(double saldo, String numero){
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta(String numero){
        this.numero = numero;
        saldo = 0.0;
    }

    public void creditar(double valor){
        saldo += valor;
    }

    public void debitar(double valor){
        if (saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }


    public void relatorio(){
        System.out.println("--------");
        System.out.println("Numero da Conta: " + numero);
        System.out.println("Saldo da Conta: " + saldo);
    }

}
