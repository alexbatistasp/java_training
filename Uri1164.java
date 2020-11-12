import java.util.Scanner; 
public class Uri1164 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int valor = 0;
        int vezes = 0;
        int count=0;     
        int count_aux;  
        int valor_div;       
        vezes = teclado.nextInt();
        String[] print_s = new String[vezes];
        
        while (count < vezes){
            valor = teclado.nextInt();
            count_aux = 1; 
            valor_div = 0; 
            while (count_aux < valor ){

                
                if(valor%count_aux == 0){
                    valor_div = valor_div + count_aux ; 
                }         
                count_aux++;       
            }
            if(valor_div == valor ){
                print_s[count] = Integer.toString(valor) + " eh perfeito";
            } else {
                print_s[count] = Integer.toString(valor) + " nao eh perfeito";
            }   
            count++;
        }
        count = 0;
        while (count < vezes){
            System.out.println(print_s[count]);
            count++;
        }

    }
}