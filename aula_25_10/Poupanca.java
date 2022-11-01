
public class Poupanca extends Conta{
	private String id;
	
	public Poupanca(String numero, double saldo, String id) {
		super(numero, saldo);
		this.id = id;
	}
	
	@Override
	public void imprimir() {
		//super.imprimir();
		System.out.println("Numero da poupanca: " + numero);
		System.out.println("Saldo da poupanca: " + saldo);
		System.out.println("Identificação: " + id);
	}
	
}
