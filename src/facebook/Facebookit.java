package facebook;

import java.util.*;

public class Facebookit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Amico a = new Amico("", "", "");
	    Foto f = new Foto ("");
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
				a.aggiungiamico();
				break;
			case 2:
				f.aggiungifoto();
			case 3:
				a.stampamici();
				break;
			case 4:
				f.stampafoto();
				break;
		}
				
		
			
}
		while (m<=4);	
}
}
