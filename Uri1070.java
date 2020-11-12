import java.util.Scanner; 
public class Uri1070 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int valor;
        int test_count = 0 ;
        int cont = 0;
        valor = teclado.nextInt(); 
        while (cont < 6) {
              
            if (valor%2 != 0){
                System.out.println(valor); 
                cont++;             
            }
            valor = valor + 1;

        }
    }
}       