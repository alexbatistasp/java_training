import java.util.Scanner; 
public class Uri1047 {
    public static void main(String[] args){            
        Scanner teclado; // Declarando a Classe para uso  
        teclado = new Scanner(System.in); // Criando o objeto em memória 
        int valor_ent_hr;
        int valor_ent_min;
        int valor_sai_hr;
        int valor_sai_min;
        int valor_ent;
        int valor_sai;
        int valor_dur_hr;
        int valor_dur_min;
        
        valor_ent_hr = teclado.nextInt(); 
        valor_ent_min = teclado.nextInt();      
        valor_sai_hr = teclado.nextInt();  
        valor_sai_min = teclado.nextInt(); 
        
        valor_ent = (valor_ent_hr * 60 ) + valor_ent_min ;
        valor_sai = (valor_sai_hr * 60 ) + valor_sai_min ;
         
        if (valor_sai <= valor_ent) {   
            valor_dur_hr = ((((24*60)-valor_ent)+valor_sai) / 60) ;  
            valor_dur_min = ((((24*60)-valor_ent)+valor_sai) % 60) ;
            System.out.println("O JOGO DUROU " + valor_dur_hr +  " HORA(S) E " + valor_dur_min + " MINUTO(S)" );
        } else if (valor_sai > valor_ent) {
            valor_dur_hr =  ((valor_sai - valor_ent)/60) ; 
            valor_dur_min =  ((valor_sai - valor_ent)%60) ; 
            System.out.println("O JOGO DUROU " + valor_dur_hr +  " HORA(S) E " + valor_dur_min + " MINUTO(S)" );
        } else if (valor_sai == valor_ent ) {
            valor_dur_hr =  24 ; 
            valor_dur_min =  0 ; 
            System.out.println("O JOGO DUROU " + valor_dur_hr +  " HORA(S) E " + valor_dur_min + " MINUTO(S)" );
        } 
    }
}    