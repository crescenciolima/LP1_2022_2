public class Carro implements Veiculo, Motor{
    private String id, nome, fabricante, modelo;

    public Carro(String id, String nome, String fabricante, String modelo){
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getFabricante(){
        return fabricante;
    }

    public String getModelo(){
        return modelo;
    }

    public void relatorio(){
        System.out.println("Identificação: " + id);
        System.out.println("Nomde do Veículo: " + nome);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
    }

}
