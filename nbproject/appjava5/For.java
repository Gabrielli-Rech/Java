package appjava5;

public class For {
    public static void main(String[] args) {
            for (int i = 0; i < 10; i ++){
                System.out.println(i);
        }
                System.out.println("======================");
            for (int i = 10; i < 0; i = i + 2){
                System.out.println(i);
        }
        int i = 0;
            for(; i < 10; i++){
                System.out.println("Seu controle " + i);
        }
                System.out.println("Seu valor final " + i);
            for(; i > 0; i++){
                System.out.println("Controle 2 " + i);
                    i--;
        }
        
}
}
