package facebook;
import java.util.*;
public class Amico {
	private String nome;
	private String cognome;
	private int eta;

	public Amico(String nome, String cognome, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	public void Aggiungiamico () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome");
		nome = sc.nextLine();
		ystem.out.println("Nome");
		cognome = sc.nextLine();
		eta = sc.nextInt();
		
	}
}
