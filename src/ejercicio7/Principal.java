package ejercicio7;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor n para calcular el factorial: ");
        int n = scanner.nextInt();

        Factorial factorial = new Factorial();
        int resultado = factorial.resolverFactorial(n);
        factorial.mostrarResultado(n, resultado);
    }
}

