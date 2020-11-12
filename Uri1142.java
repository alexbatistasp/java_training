import java.util.Scanner; 
public class Uri1142 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int valor;
        int count=0;
        int count_aux=0;
        String print_s;

        valor = teclado.nextInt();
        while(count<valor){
            count_aux++;
            print_s = Integer.toString(count_aux) ;
            count_aux++;
            print_s = print_s + " " + Integer.toString(count_aux) ;
            count_aux++;
            print_s = print_s + " " + Integer.toString(count_aux) ;
            count_aux++;
            print_s = print_s + " PUM" ;
            System.out.println(print_s);
            count++;

        }

    }
}
        