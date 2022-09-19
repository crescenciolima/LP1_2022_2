public class App {
    public static void main(String[] args) throws Exception {
        Data entrada = new Data(10, "janeiro", 2022);
        Data saida = new Data(15, "janeiro", 2022);
        Hospede Joao = new Hospede(1, "Joao Silva", "123-4", "456-7", "773423-5555");
        Hospedagem deJoao = new Hospedagem(555, entrada, saida, Joao, 303);
        deJoao.relatorio();
    }
}
