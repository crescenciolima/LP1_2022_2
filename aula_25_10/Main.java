
public class Main {

	public static void main(String[] args) {
		//ContaAbstrata CA1 = new ContaAbstrata("123-4", 100.0);
		Conta C1 = new Conta("456-7", 50.0);
		C1.creditar(100.0);
		C1.debitar(20.0);
		C1.imprimir();
		
		Poupanca P1 = new Poupanca("333-3", 20.0, "012-5");
		P1.imprimir();
		
		ContaImposto CI1 = new ContaImposto("555-5", 150.0);
		CI1.debitar(50.0);
		CI1.imprimir();
		
		
		
		ContaAbstrata [] BD = new ContaAbstrata[5];
		BD[0] = C1;
		BD[1] = P1;
		BD[2] = CI1;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("-------");
			BD[i].imprimir();
		}
		
		ContaAbstrata [] BD2 = {C1, P1, CI1};
		for(int i = 0; i < BD2.length; i++) {
			System.out.println("---------");
			BD2[i].imprimir();
		}
 	}

}
