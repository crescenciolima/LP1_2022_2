package concessionaria;

import java.util.Scanner;

public class Automovel extends Veiculo {
	private String tipo;
	
	public Automovel(){
		super();
		System.out.println("Digite o tipo do automovel");
		Scanner entrada = new Scanner(System.in);
		tipo = entrada.nextLine();
	}
	
	public void mostrar(){
		System.out.println("Potencia motor do automovel: " + motor);
		System.out.println("Numero de rodas do automovel: " + n_rodas);
		System.out.println("Tipo do automovel: " + tipo);
	}
	
}
