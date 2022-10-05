public class App {
    public static void main(String[] args) throws Exception {
        Relogio valor1 = new Relogio();
        valor1.setHora(10, 20, 30);
        valor1.getHora();

        Info i1 = new Info("Cretchas", 40, 'M');
        Musico m1 = new Musico(i1, "guitarra", 25);

        Info i2 = new Info("BorisBass", 50, 'M');
        Musico m2 = new Musico(i2, "teclado", 30);

        Info i3 = new Info("Igor", 45, 'M');
        Musico m3 = new Musico(i3, "voz", 25);

        Banda four_bits = new Banda("4 bITs" , m1, m2, m3);
        four_bits.relatorio();

        Info i4 = new Info("Igor", 45, 'M');
        Musico m4 = new Musico(i3, "voz", 25);

        Banda_REP one_byte = new Banda_REP("4 bITs");
        one_byte.inserir(m1);
        one_byte.inserir(m2);
        one_byte.inserir(m3);
        one_byte.remover(m1);
        one_byte.relatorio();
    }
}
