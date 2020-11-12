import java.util.Scanner; 
public class Uri1046 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int valor_ent;
        int valor_sai;
        valor_ent = teclado.nextInt();       
        valor_sai = teclado.nextInt();       
         
        if (valor_sai <= valor_ent) {       
            System.out.println("O JOGO DUROU " + ((24-valor_ent)+valor_sai) +  " HORA(S)");
        } else if (valor_sai > valor_ent) {
            System.out.println("O JOGO DUROU " + (valor_sai - valor_ent) +  " HORA(S)");
        } else if (valor_sai == valor_ent ) {
            System.out.println("O JOGO DUROU " + 24 +  "HORA(S)");
        } 
    }
}    