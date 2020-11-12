import java.util.Scanner; 
public class Uri1037 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        float valor;
        valor = teclado.nextFloat();       
         
        if (valor >= 0 && valor <= 25) {                  
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 75 && valor <= 100){
            System.out.println("Intervalo (75,100]");
        } else if (valor > 100 || valor < 0 ) {
            System.out.println("Fora de intervalo");
        }

 

    }
}    