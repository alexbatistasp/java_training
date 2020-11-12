import java.util.Scanner; 
public class Uri1073 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int valor;
        int test_count = 0 ;
        int cont = 0;
        valor = teclado.nextInt(); 
        while (cont <= valor) {
            cont++;       
            if (cont%2 == 0){
                System.out.println(cont + "^2 = "  + (cont*cont));             
            }
            

        }
    }
}       