package concessionaria;

import java.util.Scanner;

public abstract class Veiculo {
	protected int motor;
	protected int n_rodas;
	
	public Veiculo(){
		System.out.println("Digite o valor do motor ");
		Scanner input = new Scanner(System.in);
		motor = input.nextInt();
		System.out.println("Digite o número de rodas");
		n_rodas = input.nextInt();
	}
	
	public abstract void mostrar();

}





