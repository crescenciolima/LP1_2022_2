public class App {
    public static void main(String[] args){
        Conta c1 = new Conta("123-4", 100.0);
        //c1.imprimir();
        Poupanca p1 = new Poupanca("456-7", 100.0, 500.0);
        p1.renderJuros(0.01);
        //p1.imprimir();

        Repositorio BD = new Repositorio();
        BD.inserir(c1);
        BD.inserir(p1);
        BD.imprimir();
    }
}
