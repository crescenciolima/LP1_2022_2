public class Musico {
    private Info info_pessoais;
    private String instrumento;
    private int experiencia;

    public Musico(Info info_pessoais, String instrumento, int experiencia){
        this.info_pessoais = info_pessoais;
        this.instrumento = instrumento;
        this.experiencia = experiencia;
    }

    public void imprimir_integrante(){
        info_pessoais.imprimir_info();
        System.out.println("Instrumento: " + instrumento);
        System.out.println("Experiencia: " + experiencia + " anos");
    }



}


