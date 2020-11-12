import java.util.Scanner; 
public class Uri1005 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        float A;
        float B;
        double media;
        A = teclado.nextFloat();        
        B = teclado.nextFloat();
          
        media = ((A * 3.5f ) + (B * 7.5f)) / 11.0f;    
        System.out.printf("MEDIA = %.5f\n", media);        

    }
}