package concessionaria;

import java.util.Scanner;

public class Caminhao extends Veiculo {
	private double carga;
	
	public Caminhao(){
		//super();
		System.out.println("Digite a carga: ");
		Scanner entrada = new Scanner(System.in);
		carga = entrada.nextDouble();
	}
	
	public void mostrar(){
		System.out.println("Potencia do motor do caminhao: "+ motor);
		System.out.println("Numero de rodas do caminhao: " + n_rodas);
		System.out.println("Carga do caminhao: " + carga);
	}

}
