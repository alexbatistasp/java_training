import java.util.Scanner; 
public class Uri1143 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int valor;
        int count=0;
        int val_v=0;
        String print_s;

        valor = teclado.nextInt();
        while(count<valor){
            count++;
            val_v = count;
            print_s = Integer.toString(val_v) ;
            val_v = val_v*count;
            print_s = print_s + " " + Integer.toString(val_v) ;
            val_v = val_v*count;
            print_s = print_s + " " + Integer.toString(val_v) ;
            System.out.println(print_s);
        }
    }
}
        