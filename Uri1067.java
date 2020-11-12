import java.util.Scanner; 
public class Uri1067 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int valor;
        float valores = 0 ;
        int cont = 0;
        valor = teclado.nextInt(); 
        while (cont <= valor) {
                  
            if (cont%2 != 0){
                System.out.println(cont);              
            }
            cont++;

        }
    }
}       