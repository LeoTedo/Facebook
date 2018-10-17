package facebook;

import java.util.*;

public class Facebookit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=0;
		do {
			System.out.println("Premi 1 per aggiungere un amico");
			System.out.println("Premi 2 per postare una foto");
			System.out.println("Premi 3 per visualizzre la lista amici");
			System.out.println("Premi 4 per visualizzare la lista foto");
			System.out.println("Premi 5 per uscire");
			m = sc.nextInt();
			sc.nextLine();
			switch (m) {
			case 1:
				Amico a = new Amico(sc.nextLine(), sc.nextLine(), sc.nextLine());
				a.setNome();
				a.setCognome();
				a.setEta(); 
				a.Aggiungiamico();
		}
				
		
			
}
		while (m<=4);	
}
}
