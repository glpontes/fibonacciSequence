import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static ArrayList<Integer> fibonacciSequence(int n) {
        ArrayList<Integer> fibSequence = new ArrayList<>();
        fibSequence.add(0);
        fibSequence.add(1);
        
        while (fibSequence.get(fibSequence.size() - 1) < n) {
            int nextFib = fibSequence.get(fibSequence.size() - 1) + fibSequence.get(fibSequence.size() - 2);
            fibSequence.add(nextFib);
        }
        
        return fibSequence;
    }
    
    public static boolean checkFibonacci(int number) {
        ArrayList<Integer> fibSequence = fibonacciSequence(number);
        return fibSequence.contains(number);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        scanner.close();
        
        if (checkFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
