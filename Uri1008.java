import java.util.Scanner; 
public class Uri1008 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int numero_func;
        int horas_trab;
        float vlr_horas;
        double salary;
       
        numero_func = teclado.nextInt();
        horas_trab = teclado.nextInt();
        vlr_horas = teclado.nextFloat();
        salary = (horas_trab * vlr_horas);
        
        System.out.println("NUMBER = "+ numero_func);   
        System.out.printf("SALARY = U$ %.2f\n", salary);    

    }
}