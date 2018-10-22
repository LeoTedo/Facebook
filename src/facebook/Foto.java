package facebook;

import java.util.Scanner;

public class Foto {
	private String titolo;
	private Foto[] listafoto = new Foto[20];
	private int i = 0;

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
		listafoto[i] = new Foto(sc.nextLine());
		i++;
	}

	@Override
	public String toString() {
		return "Foto titolo=" + titolo + "";
	}

	public void stampafoto() {

		for (int i = 0; i < listafoto.length; i++) {
			if (listafoto[i] != null) {
				System.out.println(" " + listafoto[i]);
			}
		}
	}
}
