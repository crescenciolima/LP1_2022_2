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

    public void debitar(double valor) throws SIException{
        if (saldo >= valor){
            saldo -= valor;
        }else{
            SIException e = new SIException();
            throw e;
        }
    }
    
}
