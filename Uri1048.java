import java.util.Scanner; 
public class Uri1048 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        float sal_mes;
        float sal_novo;
        sal_mes = teclado.nextFloat();       
         
        if (sal_mes > 0 && sal_mes <= 400) { 
            sal_novo = sal_mes + ((sal_mes * 15)/100);
            System.out.printf("Novo salario: %.2f\n",sal_novo);
            System.out.printf("Reajuste ganho: %.2f\n",(sal_novo - sal_mes));          
            System.out.println("Em percentual: 15 %");
        } else if (sal_mes > 400 && sal_mes <= 800) {
            sal_novo = sal_mes + ((sal_mes * 12)/100);
            System.out.printf("Novo salario: %.2f\n",sal_novo);
            System.out.printf("Reajuste ganho: %.2f\n",(sal_novo - sal_mes));    
            System.out.println("Em percentual: 12 %");
        } else if (sal_mes > 800 && sal_mes <= 1200) {
            sal_novo = sal_mes + ((sal_mes * 10)/100);
            System.out.printf("Novo salario: %.2f\n",sal_novo);
            System.out.printf("Reajuste ganho: %.2f\n",(sal_novo - sal_mes));   
            System.out.println("Em percentual: 10 %");
        } else if (sal_mes > 1200 && sal_mes <= 2000){
            sal_novo = sal_mes + ((sal_mes * 7)/100);
            System.out.printf("Novo salario: %.2f\n",sal_novo);
            System.out.printf("Reajuste ganho: %.2f\n",(sal_novo - sal_mes));    
            System.out.println("Em percentual: 7 %");
        } else if (sal_mes > 2000) {
            sal_novo = sal_mes + ((sal_mes * 4)/100);
            System.out.printf("Novo salario: %.2f\n",sal_novo);
            System.out.printf("Reajuste ganho: %.2f\n",(sal_novo - sal_mes));   
            System.out.println("Em percentual: 4 %");
        }

 

    }
}    