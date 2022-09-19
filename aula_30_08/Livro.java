public class Livro {
    private int anoDePublicacao;
    private String titulo;

    public void setAnoDePublicacao(int ano){
        anoDePublicacao = ano;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void imprimir(){
        System.out.println("Ano de Publicacao: " + anoDePublicacao);
        System.out.println("Titulo do Livro: " + titulo);
    }

}
