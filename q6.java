public class q6 {
    public static void main(String[] args) {
        int num = 6;
        int fatorial = 1;

        for (int i = 1; i<=num; i++){
            fatorial = fatorial * i;
        }
        
        System.out.printf("O fatorial de %d é %d.", num, fatorial);
    }
}
