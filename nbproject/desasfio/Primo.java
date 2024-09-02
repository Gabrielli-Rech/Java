package desasfio;
import java.util.Scanner;
public class Primo {
    public static void main(String[] args) {
        int contDiv = 0; 
        Scanner ent = new Scanner(System.in);
        System.out.print("Informe o número para verificação: ");
        int numero = ent.nextInt(); 
        if (numero < 2) {
            System.out.println(numero + " não é um número primo.");
        } else {
            for (int i = 1; i <= numero; i++) { 
                if (numero % i == 0) {
                    contDiv++;
                }
            }
            if (contDiv == 2) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }
        ent.close();
    }
}