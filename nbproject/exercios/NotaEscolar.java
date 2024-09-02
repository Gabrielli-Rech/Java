package exercios;
import java.util.Scanner;
public class NotaEscolar {
    /**
     * Receber 4 notas e informar a média:
     * Tendo 7 como a média dos alunos:
     * @param args
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float nota[] = new float[5];
        String aluno, turma, resultado;
            System.out.println("|< Média dos Alunos >|");
            System.out.print("Informe o nome do(a) aluno(a): ");
                aluno = ler.nextLine();
            System.out.print("Informe a turma do(a) aluno(a): ");
                turma = ler.nextLine();
        for(int i = 0; i < 4; i++){
            System.out.print("Informe a " + (i + 1) + "° nota: ");
                nota[i] = ler.nextFloat();
                nota[4]  += nota [i];
            }
            nota[4] = nota[4] / 4;
        if (nota[4] >= 7){
            System.out.println("Aprovado!");
        }else if (nota[4] <= 5){
            System.out.println("Recuperação!");
        }else{
            System.out.println("Reprovado!");
        }
            System.out.println("O aluno(a) " + aluno + " está com a média " + nota[4] );
    }
}
