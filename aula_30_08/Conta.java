public class Conta {
    private String numero;
    private double saldo;

    public void setNumero(String numero_temp){
        numero = numero_temp;
    }

    public String getNumero(){
        return numero;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void creditar(double valor){
        saldo = saldo + valor;
    }

    public void debitar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente.");
        }
    }

    public void imprimir(){
        System.out.println("Numero da conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }

}
