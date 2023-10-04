public class q5 {
    public static void main(String[] args) {
        System.out.println("Números do Fibonacci");
        int n = 13;

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci_recursivo(i) + " ");
        }
    }

    public static int fibonacci_recursivo(int n){
        if (n <= 1) {
            return n;
        } else {
            return fibonacci_recursivo(n - 1) + fibonacci_recursivo(n - 2);
        }
    }
}