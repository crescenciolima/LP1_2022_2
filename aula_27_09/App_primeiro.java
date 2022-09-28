public class App {
    public static void main(String[] args) throws Exception {
        Conta X1 = new Conta("123-4", 100.0);
        Conta X2 = new Conta("456-7", 200.0);
        Conta X3 = new Conta("789-0", 300.0);
        Conta X4 = new Conta("111-1", 150.0);
        Conta X5 = new Conta("222-2", 250.0);

        Conta [] BD = new Conta[5];
        BD[0] = X1;
        BD[1] = X2;
        BD[2] = X3;
        BD[3] = X4;
        BD[4] = X5;
        
        System.out.println(X1);
        X1.creditar(20.0);
        X1.imprimir();

        System.out.println(BD[0]);
        BD[0].creditar(20.0);
        BD[0].imprimir();

        for(int i = 0; i < BD.length; i++){
            BD[i].imprimir();
        }
    }
}
