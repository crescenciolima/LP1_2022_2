public class App {
    public static void main(String[] args) throws Exception {
        Conta x1 = new Conta("123-4", 100.0);
        Conta x2 = new Conta(250.0, "456-7");
        Conta x3 = new Conta("912-3");
        x1.creditar(10.0);
        x2.creditar(50.0);
        x3.debitar(10.0);
        x1.relatorio();
        x2.relatorio();
        x3.relatorio();
        
        Curso BSI = new Curso(123, "Sistemas de Informação");
        //BSI.imprimir_curso();

        Aluno joao = new Aluno("Joao", "456-7", 25, BSI);
        joao.imprimir_aluno();
    }
}
