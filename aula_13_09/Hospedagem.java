public class Hospedagem {
    private int codigo;
    private Data dataEntrada;
    private Data dataSaida;
    private Hospede hospede;
    private int aposento;

    public Hospedagem(int codigo, Data dataEntrada, Data dataSaida, Hospede hospede, int aposento){
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.hospede = hospede;
        this.aposento = aposento;
    }

    public void relatorio(){
        System.out.println("Codigo da Hospedagem: " + codigo);
        System.out.print("Data de Entrada: ");
        dataEntrada.imprimir_data();
        System.out.print("Data de Saida: ");
        dataSaida.imprimir_data();
        hospede.imprimir_hospede();
        System.out.println("Aposento: " + aposento);
    }

}
