import java.util.Scanner; 
public class Uri1065 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int valor;
        float valores = 0 ;
        int cont = 0;
        int cont_positivo = 0;
        while (cont < 5) {
            valor = teclado.nextInt();       
            if (valor%2 == 0){
                valores = valores + valor;
                cont_positivo = cont_positivo + 1;                
            }
            cont++;

        }
        
        System.out.println(cont_positivo + " valores pares");
        
        

        
        
    }
}       