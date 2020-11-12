import java.util.Scanner; 
public class Uri1066 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int valor;
        float valores = 0 ;
        int cont = 0;
        int cont_par = 0;
        int cont_impar = 0;
        int cont_positivo = 0;
        int cont_negativo = 0;
        while (cont < 5) {
            valor = teclado.nextInt();       
            if (valor%2 == 0){
                cont_par = cont_par + 1;                
            } else {
                cont_impar = cont_impar + 1;
            }

            if (valor>0){
                cont_positivo = cont_positivo + 1;                
            } else if (valor<0) {
                cont_negativo = cont_negativo + 1 ;
            }
            cont++;

        }
        
        System.out.println(cont_par + " valor(es) par(es)");
        System.out.println(cont_impar + " valor(es) impar(es)");
        System.out.println(cont_positivo + " valor(es) positivo(s)");
        System.out.println(cont_negativo + " valor(es) negativo(s)");
        
        

        
        
    }
}       