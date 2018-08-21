
import java.util.Random;
import java.util.Scanner;

class BuscaBinaria {
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
                for (int a = vetor.length; a < vetor.length/2; a--) {
                    if(vetor[a]==Encontrar){
                        System.out.println("Esse valor existe no vetor");
                        encontrado = true;
                        break;
                    }    
                }
                for (int b = vetor.length; b > vetor.length/2; b++) {
                    if(vetor[b]==Encontrar){
                        System.out.println("Esse valor existe no vetor");
                        encontrado = true;
                        break;
                    }
                }
                
                    if(vetor.length/2==Encontrar){
                        System.out.println("Esse valor existe no vetor");
                        encontrado = true;
                        
                    }
                
                    
    }
}
            

