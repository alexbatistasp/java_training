import java.util.Scanner; 
public class Uri1060 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        float valor;
        int cont = 0;
        int cont_positivo = 0;
        while (cont < 6) {
            valor = teclado.nextFloat();       
            if (valor>0){
                cont_positivo = cont_positivo + 1;
            }
            cont++;

        }
        
        System.out.println(cont_positivo + " valores positivos");
        

        
        
    }
}       