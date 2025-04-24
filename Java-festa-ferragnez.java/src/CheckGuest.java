import java.util.Scanner;

public class CheckGuest{
    public static void main(String[] args) throws Exception {

        Scanner input= new Scanner (System.in);
        String[] invitati ={ "Dua Lipa", "Manuel Agnelli","Paris Hilton","J-Ax","Francesco Totti","Ilary Blasi","Bebe Vio","Luis","Pardis Zarei","Martina Maccherone","Rachel Zelic"};
     
        System.out.println("Dimmi il tuo nome e cognome per sapere se sei nella lista degli invitati:");
        String nomeUtente = input.nextLine();
       
        Boolean festa =  false;
        int i=0;

        // metodo 1 con ciclo for
    //     for (int i = 0; i < invitati.length ; i++){
    //     if (invitati[i].toUpperCase().equals(nomeUtente.toUpperCase())) {
    //         festa = true;
    //         System.out.println( "Sei invitato alla festa");
    //         break;
            
    //     } 
    //   
    // }
  
     
      
      
    //     input.close();
      
    
    // }
    
    while (i < invitati.length) {
		;
			if (invitati[i].toUpperCase().equals(nomeUtente.toUpperCase())) {
				festa=true;
				
			}
			i++;
		}
		
		
		if (festa) {
            festa = false;
			System.out.println("Sei invitato alla festa");
		}else {
			System.out.println("Non sei invitato alla festa");
		}
		
input.close();
    }
}
