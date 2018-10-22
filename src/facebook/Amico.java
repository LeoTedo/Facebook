package facebook;

import java.util.*;

public class Amico {
	private String nome;
	private String cognome;
	private String eta;
	private Amico[] listamici = new Amico[20];;
	private int i = 0;

	public Amico(String nome, String cognome, String eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Amico nome = " + nome + ", cognome = " + cognome + ", eta = " + eta + "";
	}

	public String setNome() {
		return nome;
	}

	public String setCognome() {
		return cognome;
	}

	public String setEta() {
		return eta;
	}

	public void aggiungiamico() {
		Scanner sc = new Scanner(System.in);
		listamici[i] = new Amico(sc.nextLine(), sc.nextLine(), sc.nextLine());
		i++;
	}

	public void stampamici() {

		for (int i = 0; i < listamici.length; i++) {
			if (listamici[i] != null) {
				System.out.println(" " + listamici[i]);
			}
		}
	}
}
