import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Dodawanie dod = new Dodawanie();
		int liczba = 1;
		
		while(liczba != 0) {
			
			liczba = in.nextInt();
			dod.setLiczbaA(liczba);
			dod.dodawanie();
		}
		System.out.println(dod.wypisz());


	}
}
