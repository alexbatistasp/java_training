import java.util.Scanner; 
public class Uri1050 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int cod_ddd;
        cod_ddd = teclado.nextInt();       
            
        

        switch (cod_ddd) {
            case 61:
              System.out.println("Brasilia");
              break;
            case 71:
              System.out.println("Salvador");
              break;
            case 11:
              System.out.println("Sao Paulo");
              break;
            case 21:
              System.out.println("Rio de Janeiro");
              break;
            case 32:
              System.out.println("Juiz de Fora");
              break;
            case 19:
              System.out.println("Campinas");
              break;
            case 27:
              System.out.println("Vitoria");
              break;
            case 31:
              System.out.println("Belo Horizonte");
              break;
            default:
              System.out.println("DDD nao cadastrado");
        }


    }
}



