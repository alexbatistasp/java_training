import java.util.Scanner; 
public class Uri1115 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        float valor_x;
        float valor_y;
        boolean check = true;
        valor_x = teclado.nextFloat();       
        valor_y = teclado.nextFloat();       
         
        while (check) {
            if (valor_x > 0 && valor_y > 0) {                  
                System.out.println("primeiro");
            } else if (valor_x < 0 && valor_y > 0) {
                System.out.println("segundo");
            } else if (valor_x < 0 && valor_y < 0) {
                System.out.println("terceiro");
            } else if (valor_x > 0 && valor_y < 0){
                System.out.println("quarto");
            } else if (valor_x == 0 && valor_y == 0) {
                check = false;
            } else if (valor_x == 0 && valor_y != 0) {
                check = false;
            } else if (valor_x != 0 && valor_y == 0) {
                check = false;       
            }
            if(check){
                valor_x = teclado.nextFloat();       
                valor_y = teclado.nextFloat(); 
            }
        }
    }
}    