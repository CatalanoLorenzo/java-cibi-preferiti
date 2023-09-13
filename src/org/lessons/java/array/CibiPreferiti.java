package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {

		// inizializzo array dio 5 elementi
		String[] CibiPreferiti = { "pizza", "sushi", "lasagna", "insalata", "pane" };

		// mostro a schermo la lunghezza della lista di cibi preferiti
		System.out.println(CibiPreferiti.length);

		// mostro a schemo il cibo in prima posizione
		System.out.println(CibiPreferiti[0]);

		// mostro a schermo il cibo all'ultima posizione
		System.out.println(CibiPreferiti[CibiPreferiti.length - 1]);

		// creo una condizione per poter prendere il cibo che sta al centro
		// se l'array è dispari
		if (CibiPreferiti.length % 2 != 0) {

			System.out.println(CibiPreferiti[(CibiPreferiti.length / 2)]);
			// se l'array e pari
		} else {
			System.out.println(CibiPreferiti[(CibiPreferiti.length / 2) + 1]);
		}
	}
}
