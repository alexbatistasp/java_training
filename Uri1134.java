import java.util.Scanner; 
public class Uri1134 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        
        int cont_alc=0;
        int cont_gas=0;
        int cont_dies=0;
        int valor_dig;

        valor_dig = teclado.nextInt();  

        while (valor_dig != 4){
            switch (valor_dig) {
                case 1:
                    cont_alc++;
                    break;
                case 2:
                    cont_gas++;
                    break;
                case 3:
                    cont_dies++;
                    break;            
                default:
                    break;
            }
            valor_dig = teclado.nextInt(); 
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + cont_alc);
        System.out.println("Gasolina: " + cont_gas);
        System.out.println("Diesel: " + cont_dies);
    }
}       