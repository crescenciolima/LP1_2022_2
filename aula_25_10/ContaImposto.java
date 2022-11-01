
public class ContaImposto extends ContaAbstrata{
	private static final double TAXA = 0.001;
	
	public ContaImposto(String numero, double saldo) {
		super(numero, saldo);
	}
	
	public void debitar(double valor) {
		double imposto = valor * TAXA;
		
		if (saldo >= (valor+imposto)) {
			saldo -= (valor + imposto);
		} else {
			System.out.println("Saldo Insuficiente");
		}
	}
	

}
