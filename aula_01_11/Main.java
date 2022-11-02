package concessionaria;

public class Main {

	public static void main(String[] args) {
		
		Automovel a1 = new Automovel();
		//a1.mostrar();
		
		Caminhao c1 = new Caminhao();
		//c1.mostrar();
		
		Repositorio BD = new Repositorio();
		
		BD.inserir(a1);
		BD.inserir(c1);
		
		
		BD.remover(a1);
		BD.relatorio();
		

	}

}
