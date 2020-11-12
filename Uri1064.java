import java.util.Scanner; 
public class Uri1064 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        float valor;
        float valores = 0 ;
        int cont = 0;
        int cont_positivo = 0;
        while (cont < 6) {
            valor = teclado.nextFloat();       
            if (valor>0){
                valores = valores + valor;
                cont_positivo = cont_positivo + 1;                
            }
            cont++;

        }
        
        System.out.println(cont_positivo + " valores positivos");
        System.out.printf("%.1f\n",(valores/cont_positivo));
        

        
        
    }
}       