package exercios;
import java.util.Scanner;
public class CalcIMC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float altura, peso, imc;
        String resultado = "";
            System.out.println(" <Calculadora de IMC>");
            System.out.print("Informe a sua altura: ");
        altura = ler.nextFloat();
            System.out.print("Informe o peso: ");
        peso = ler.nextFloat();
            imc = calcIMC(altura, peso);
            System.out.print("Seu IMC é: " +imc);
        ler.close();
            if (imc < 16){
                System.out.print("\nMagresa grave");
            }else if (imc < 16.9){
                System.out.print("\nMagresa moderada");
            }else if (imc < 18.5){
                System.out.print("\nMagresa leve");
            }else if (imc < 24.9){
                System.out.print("\nPeso ideal");
            }else if (imc < 29.9){
                System.out.print("\nSobrepeso");
            }else if (imc < 34.9){
                System.out.print("\nObesidade grau 1");
            }else if (imc < 39.9){
                System.out.print("\nObesidade grau 2");
            }else {
                System.out.print("\nObesidade grau 3");
            }
    }//fim main
    /**
    * Função calcIMC é para calcular o IMC de um individo
    * Recebe os seguintes parametros:
    * @param altura
    * @param peso
    * @return
    */
    public static float calcIMC (float altura, float peso){
        return (float) (peso / (altura * altura));
    }
}//fim class