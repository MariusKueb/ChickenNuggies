package de.bkbocholt.wwm;

public class tester 
{
	private static Spiel spiel;
	public static void main(String[] args) 
	{
		spiel = new Spiel();
		String ss = spiel.getRandomFrage();
		System.out.println(ss);
		System.out.println(spiel.getAntwort(ss));

	}

}
