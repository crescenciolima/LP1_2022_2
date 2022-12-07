public class App {
    public static void main(String[] args) throws Exception {
        CanetaEsferografica c1 = new CanetaEsferografica("azul");
        //c1.escrever("testando");
        Tinteiro t1 = new Tinteiro("preto");
        //t1.escrever("TESTE");

        Carro novo = new Carro("1", "fusca", "VW", "copa 1950");
        novo.relatorio();


    }
}
