public class App {
    public static void main(String[] args) throws Exception {
        Conta X1 = new Conta("123-4", 100.0);
        Conta X2 = new Conta("456-7", 200.0);
        Conta X3 = new Conta("789-0", 300.0);
        Conta X4 = new Conta("111-1", 150.0);
        Conta X5 = new Conta("222-2", 250.0);

        Repositorio BD = new Repositorio();
        BD.inserir(X1);
        BD.inserir(X2);
        BD.inserir(X3);
        BD.inserir(X4);
        BD.inserir(X5);
        BD.imprimir();


    }
}
