public class q4 {
    public static void main(String[] args) {
        int x = 13;
        int cont = 0;

        for (int i = 2; i <= x; i++) {
            if (x%i == 0) {
                cont += 1;
            }
        }

        if (cont == 1 && x > 1) {
            System.out.printf("O número %d é primo.", x);
        }else {
            System.out.printf("O número %d não é primo.", x);
        }
    }
}