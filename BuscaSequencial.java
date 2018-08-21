import java.util.Scanner;
import java.util.Random;


public class BuscaSequencial {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        Random aleatorio = new Random();
        Scanner tcl = new Scanner(System.in);
        
        for (int a = 0; a < vetor.length; a++) {
            vetor[a] = aleatorio.nextInt(45);  
        }
             
                
            System.out.print("Digite o valor que deseja encontrar:");
            int Encontrar = tcl.nextInt();
            boolean encontrado = false;
                for (int i = 0; i < vetor.length; i++) {
                    if(vetor[i]==Encontrar){
                        System.out.println("Esse vslor existe no vetor");
                        encontrado = true;
                        break;
                    
                    }else{
                        encontrado = true;
                        System.out.println("Esse valor não existe no vetor");
                        break;
                    }
                }
    }
}
         