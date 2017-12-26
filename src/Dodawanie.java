
public class Dodawanie {
	private int liczbaA;

	public int getLiczbaA() {
		return liczbaA;
	}

	public void setLiczbaA(int liczbaA) {
		this.liczbaA = liczbaA;
	}

	public Dodawanie(int liczbaA) {
		this.liczbaA = liczbaA;
	}

	public Dodawanie() {

	}

	int suma = 0;

	public void dodawanie() {
		suma = suma + liczbaA;
	}
	
	public int wypisz() {
		return suma;
	}
}
