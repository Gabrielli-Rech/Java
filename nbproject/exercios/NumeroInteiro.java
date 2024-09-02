package exercios;
import java.util.Scanner;
public class NumeroInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorNumero = Integer.MIN_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = scanner.nextInt();
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        scanner.close();
        System.out.println("O maior número digitado é: " + maiorNumero);
    }
}