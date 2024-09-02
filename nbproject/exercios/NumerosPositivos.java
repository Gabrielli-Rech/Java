package exercios;
import java.util.Scanner;
public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = 0, soma = 0;
        while (true) {
            System.out.print("Digite um número: ");
            valor = scanner.nextInt();
            if (valor < 0) {
                break;
            }
            soma += valor;
        }
        System.out.println("A soma dos números positivos é: " + soma);
        scanner.close();
    }
}