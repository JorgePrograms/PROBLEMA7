package ejercicio7;

public class Factorial {
    public int resolverFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int factorialResult = 1;
            for (int i = 2; i <= n; i++) {
                factorialResult *= i;
            }
            return factorialResult;
        }
    }
    
    public void mostrarResultado(int n, int resultado) {
        System.out.println("El factorial de " + n + " es: " + resultado);
    }
}
