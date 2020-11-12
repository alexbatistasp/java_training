import java.util.Scanner; 
public class Uri1041 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        float valor_x;
        float valor_y;
        valor_x = teclado.nextFloat();       
        valor_y = teclado.nextFloat();       
         
        if (valor_x > 0 && valor_y > 0) {                  
            System.out.println("Q1");
        } else if (valor_x < 0 && valor_y > 0) {
            System.out.println("Q2");
        } else if (valor_x < 0 && valor_y < 0) {
            System.out.println("Q3");
        } else if (valor_x > 0 && valor_y < 0){
            System.out.println("Q4");
        } else if (valor_x == 0 && valor_y == 0) {
            System.out.println("Origem");
        } else if (valor_x == 0 && valor_y != 0) {
            System.out.println("Eixo Y");
        } else if (valor_x != 0 && valor_y == 0) {
            System.out.println("Eixo X");        
        }
    }
}    