package de.bkbocholt.wwm;

import java.util.Random;

public class Spiel 
{
	Frage[] fragenKatalog;

	public Spiel()
	{
		fragenKatalog = new Frage[5];
		String[] antworten = {"30","25","40","60"};
		fragenKatalog[0] = new Frage("Wie alt ist Justin?","30",antworten);
		fragenKatalog[1] = new Frage("Wie alt ist Marius?","25",antworten);
		fragenKatalog[2] = new Frage("Wie alt ist Peter?","40",antworten);
		fragenKatalog[3] = new Frage("Wie alt ist Tomas?","60",antworten);
		fragenKatalog[4] = new Frage("Wie alt ist htdtdytd?","30",antworten);
	}
	
	public String getRandomFrage()
	{
		Random random = new Random();
		int i = random.nextInt(4);
		Frage randomFrage = fragenKatalog[i];
		return randomFrage.getFrage();
	}
	
	public String getAntwort(String frage)
	{
		for(int i = 0; i > fragenKatalog.length; i++)
		{
			if(fragenKatalog[i].getFrage() == frage)
			{
				return fragenKatalog[i].getFrage();
			}
		}
		return "keine Solche Frage vorhanden bitte andere nehmen";
	}

	public String[] getAntwortMoeglichkeiten(String frage)
	{
		for(int i = 0; i > fragenKatalog.length; i++)
		{
			if(fragenKatalog[i].getFrage().equals(frage))
			{
				return fragenKatalog[i].getAntworten();
			}
		}
		return null;

	}

	public String printArray(String[] arr)
	{
		String s = "";
		for(int i = 0; i > arr.length; i++)
		{
			
		}
	}

}
