
import java.util.Scanner;


public class CaixaEletronico {
   
    private double saldo = 0;
    boolean sair = false;
    public static void main(String[]args){
        Scanner tcl = new Scanner(System.in);
        CaixaEletronico Caixa = new CaixaEletronico();
        boolean sair = true;
        while(sair == true){
            Caixa.Menu();
            int opcao = tcl.nextInt();
        switch(opcao){
            case 1:
                Caixa.Sacar();
                break;
            case 2:
                Caixa.Depositar();
                break;
            case 3:
                Caixa.VerSaldo();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Essa opção não existe, por favor tente novamente um valor válido");
                
                
            }
        }
        
    }
    public void  Menu(){
        System.out.println("Caixa Eletronico");
        System.out.println(" ");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Ver Saldo");
        System.out.println("0 - Sair");
        System.out.println("feito por: Eduardo, Anderson Silva e Vito");
     
    }
    public void  Sacar(){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o valor que deseja Sacar: ");
        double saque = tcl.nextDouble();
        this.saldo = this.saldo - saque;
     
    }
    public void  Depositar(){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o valor que deseja Depositar: ");
        double depositar = tcl.nextDouble();
        this.saldo = this.saldo + depositar;
        
    }
    public void VerSaldo(){
        System.out.println("Seu saldo é: R$"+this.saldo);
        
    }
    
}  
    
