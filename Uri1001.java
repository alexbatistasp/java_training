import java.util.Scanner; 
public class Uri1001 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int A;
        int B;
        int X;
        A = teclado.nextInt();
        B = teclado.nextInt();
        X = A + B;
        System.out.println(X);        

    }
}