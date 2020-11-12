import java.util.Scanner; 
public class Uri1074 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int valor;
        int vezes;
        int cont = 0;
        int cont_par = 0;
        int cont_impar = 0;
        int cont_positivo = 0;
        int cont_negativo = 0;        
        vezes = teclado.nextInt(); 
        String[] print_s = new String[vezes];
        while (cont < vezes) {
            valor = teclado.nextInt();       
            if (valor%2 == 0){
                cont_par = cont_par + 1; 
                print_s[cont] = "EVEN" ;              
            } else {
                cont_impar = cont_impar + 1;
                print_s[cont] = "ODD" ;
            }

            if (valor>0){
                cont_positivo = cont_positivo + 1;  
                print_s[cont] = print_s[cont] + " POSITIVE" ;             
            } else if (valor<0) {
                cont_negativo = cont_negativo + 1 ;
                print_s[cont] = print_s[cont] + " NEGATIVE" ;
            } else {
                print_s[cont] = "NULL";
            }
           
            cont++;

        }
        cont = 0;
        while (cont < vezes){
            System.out.println(print_s[cont]);
            cont++;
        }
    }
}       