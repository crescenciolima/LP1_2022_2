package concessionaria;

import java.util.Scanner;

public class Repositorio {
	private int indice;
	private Veiculo [] BD;
	
	public Repositorio(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o tamanho do array");
		int tamanho = entrada.nextInt();
		BD = new Veiculo[tamanho];
		indice = 0;
	}
	
	public void inserir(Veiculo v){
		BD[indice] = v;
		indice++;
	}
	
	public void relatorio(){
		for(int i = 0; i < indice; i++){
			BD[i].mostrar();
		}
	}
	
	public void remover(Veiculo v){
		for(int i = 0; i < indice; i++){
			if(BD[i] == v){
				BD[i] = BD[indice-1];
				BD[indice-1] = null;
				indice--;
			}
		}	
	}
}
