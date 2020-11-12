import java.util.Scanner; 
public class Uri1007 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int A;
        int B;
        int C;
        int D;
        int dif;
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        dif = (A * B - C * D); 
        System.out.println("DIFERENCA = "+ dif);    

    }
}