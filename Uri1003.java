import java.util.Scanner; 
public class Uri1003 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int A;
        int B;
        int soma;
        A = teclado.nextInt();
        B = teclado.nextInt();
        soma = A + B;
        System.out.println("SOMA = " + soma);        

    }
}