import java.util.Scanner; 
public class Uri1006 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        float A;
        float B;
        float C;
        
        double media;
        A = teclado.nextFloat();        
        B = teclado.nextFloat();
        C = teclado.nextFloat();
          
        media = ((A * 2f ) + (B * 3f) + (C * 5f)) / 10f;    
        System.out.printf("MEDIA = %.1f\n", media);        

    }
}