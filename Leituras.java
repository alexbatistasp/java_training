import java.util.Scanner; // Importa biblioteca java
public class Leituras{
    public static void main(String[] args) {
    
    Scanner teclado; // Declarando a Classe para uso  
    teclado = new Scanner(System.in); // Criando o objeto em memória 

    int valorInteiro;
    float valorReal;
    System.out.println("por favor, digite um numero inteiro:");
    valorInteiro = teclado.nextInt();
    System.out.println("O valor Inteiro " + valorInteiro + " foi digitado!");
    System.out.println("Agora digite um valor real:");
    valorReal = teclado.nextFloat();
    System.out.println("O valor Real " + valorInteiro + " foi digitado!");
    System.out.printf("O valor Real formatado é  %.2f\n ",valorReal);
    }
}