package appjava4;
import java.util.Scanner;
public class Switch {
    public static void main(String[]args){
            Scanner entrada = new Scanner(System.in);
            System.out.print("Informe o código da fruta:");
            int fruta = entrada.nextInt();
                switch (fruta) {
                    case 10:
                        System.out.println("Laranja!");
                        break;
                    case 20:
                        System.out.println("Maçã!");
                    case 30:
                        System.out.println("Banana!");
                    case 40:
                        System.out.println("Uva!");
                    case 50:
                        System.out.println("Ameixa!");
                    default:
                        System.out.println("código informado está incorreto\n");
                        break;
                }
                entrada.close();
                }
            }