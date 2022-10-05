public class Relogio {
    private int hora, minuto, segundo;

    /*
    public Relogio(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
     */

    public void setHora(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Relogio getHora(){
        //Relogio TEMP = new Relogio(hora, minuto, segundo);
        Relogio TEMP = new Relogio();
        TEMP.hora = hora;
        TEMP.minuto = minuto;
        TEMP.segundo = segundo;
        return TEMP;
    }
    
}
