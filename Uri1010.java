import java.util.Scanner; 
public class Uri1010 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int cod_peca1;
        int qt_peca1;   
        double valor_peca1;  
        int cod_peca2;
        int qt_peca2;
        double valor_peca2;
        double total_pagar;

       
        cod_peca1 = teclado.nextInt();
        qt_peca1 = teclado.nextInt();
        valor_peca1 = teclado.nextDouble();
        cod_peca2 = teclado.nextInt();
        qt_peca2 = teclado.nextInt();
        valor_peca2 = teclado.nextDouble();
        
        total_pagar = (qt_peca1 * valor_peca1) +  (qt_peca2 * valor_peca2) ;            
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total_pagar);    

    }
}