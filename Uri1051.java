import java.util.Scanner; 
public class Uri1051 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        float sal_mes;
        float sal_novo;
        float val_imp;
        sal_mes = teclado.nextFloat();       
         
        if (sal_mes > 0 && sal_mes <= 2000) {                 
            System.out.println("Isento");
        } else if (sal_mes > 2000 && sal_mes <= 3000) {
            val_imp = (( sal_mes - 2000.00f ) * 0.08f ); 
            System.out.printf("R$ %.2f\n",val_imp);
        } else if (sal_mes > 3000 && sal_mes <= 4500) {        
            val_imp = ((( sal_mes - 3000.00f ) * 0.18f ) + 80.00f); 
            System.out.printf("R$ %.2f\n",val_imp);
        } else if (sal_mes > 4500) {
            val_imp = ((( sal_mes - 4500.00f ) * 0.28f ) + 350.00f); 
            System.out.printf("R$ %.2f\n",val_imp);
        }
    }
}    