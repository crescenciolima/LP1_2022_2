public class App {

    static int teste(int x, int y){
        return x+y;
    }

    static int teste(int x){
        return x+x;
    }

    static void teste(){
        System.out.println("Identifique o numero");
    }

    static long fatorial(long n){
        if(n <= 1){
            return 1;
        } else {
            return n * fatorial(n-1); 
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(teste(5));
        teste();
        int temp = teste(10, 5);
        System.out.println(temp);
    }
}
