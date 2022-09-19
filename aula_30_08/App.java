public class App {
    public static void main(String[] args) throws Exception {
        Conta X1 = new Conta();
        Conta X2 = new Conta();
        Livro L1 = new Livro();
        X1.setNumero("345-6");
        X1.setSaldo(100.0);
        L1.setAnoDePublicacao(2010);
        L1.setTitulo("House of the Dragon");
        //X1.imprimir();
        System.out.println("Valor do objeto X1: " + X1.getNumero());
        System.out.println("Saldo: " + X1.getSaldo());
        X1.debitar(10);
        System.out.println(L1);
        X1.imprimir();
        L1.imprimir();
    }
}
