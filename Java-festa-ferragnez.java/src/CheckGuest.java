import java.util.Scanner;

public class CheckGuest{
    public static void main(String[] args) throws Exception {

        Scanner input= new Scanner (System.in);
        String[] invitati ={ "Dua Lipa", "Manuel Agnelli","Paris Hilton","J-Ax","Francesco Totti","Ilary Blasi","Bebe Vio","Luis","Pardis Zarei","Martina Maccherone","Rachel Zelic"};
     
        System.out.println("Dimmi il tuo nome e cognome per sapere se sei nella lista degli invitati:");
        String nomeUtente = input.nextLine();
       
        Boolean festa = false;
        for (int i = 0; i < invitati.length ; i++){
        if (invitati[i].toUpperCase().equals(nomeUtente.toUpperCase())) {
            festa = true;
            System.out.println( "Sei invitato alla festa");
            break;
            
        } 
     
    }
    if (!festa) {
        
        System.out.println("Non sei invitato alla festa");
       }

     
      
      
        input.close();
      
    
    }
}
