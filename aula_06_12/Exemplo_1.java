public class Exemplo_1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio do main");
        try{
            metodo1();
        }catch(Exception e){
            System.out.println("Erro: " + e);
        }
        System.out.println("Fim do main");
    }

    public static void metodo1(){
        System.out.println("Inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }

    public static void metodo2(){
        System.out.println("Inicio do metodo 2");
        int [] matrix = new int[10];
            for(int i = 0; i <= 15; i++){
                matrix[i] = i;
                System.out.println(i);
            }
        System.out.println("Fim do metodo 2");
    }
}
