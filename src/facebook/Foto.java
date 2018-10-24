package facebook;

import java.util.Scanner;

public class Foto {
	private String titolo;
	private Foto[] listafoto = new Foto[20];
	private int i = 0;
	private int t;
	Amico a = new Amico("", "", "");
	public static Amico[] listamici = new Amico[20];
	private String foto;
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Foto[] getListafoto() {
		return listafoto;
	}

	public void setListafoto(Foto[] listafoto) {
		this.listafoto = listafoto;
	}

	public Foto(String titolo) {
		this.titolo = titolo;
	}

	public void aggiungifoto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Titolo: ");
	    titolo=sc.nextLine();
		System.out.println("tag con: ");
		for (int i = 0; i < a.listamici.length; i++) {
			if (a.listamici[i] != null) {
				System.out.println(i+" "+a.listamici[i]);
			}
		}
			t=sc.nextInt();
			listafoto[i] = new Foto(titolo+" con tag di "+a.listamici[t]);		
			System.out.println("Foto postata!");
		i++;
	}

	@Override
	public String toString() {
		return "titolo: " + titolo + "";
	}

	public void stampafoto() {

		for (int i = 0; i < listafoto.length; i++) {
			if (listafoto[i] != null) {
				System.out.println(" " + listafoto[i]);
			}
		}
	}
}
