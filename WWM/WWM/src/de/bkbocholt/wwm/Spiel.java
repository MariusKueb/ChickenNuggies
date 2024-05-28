package de.bkbocholt.wwm;

import java.util.Random;

public class Spiel 
{
	Frage[] fragenKatalog;

	public Spiel()
	{
		fragenKatalog = new Frage[50];
		fragenKatalog[0] = new Frage("Was ist die Hauptstadt von Frankreich?", new String[]{"a) London", "b) Paris", "c) Rom", "d) Madrid"},'b');
		fragenKatalog[1] = new Frage("Welche Farbe hat der Himmel?", new String[]{"a) Gr�n", "b) Blau", "c) Rot", "d) Gelb"}, 'b');
		fragenKatalog[2] = new Frage("Wie viele Kontinente gibt es?", new String[]{"a) 5", "b) 6", "c) 7", "d) 8"}, 'c');
		fragenKatalog[3] = new Frage("Was ist 2 + 2?", new String[]{"a) 3", "b) 4", "c) 5", "d) 6"}, 'b');
		fragenKatalog[4] = new Frage("Welche Sprache wird in Brasilien gesprochen?", new String[]{"a) Spanisch", "b) Portugiesisch", "c) Englisch", "d) Franz�sisch"}, 'b');
        fragenKatalog[5] = new Frage("Wie viele Planeten hat das Sonnensystem?", new String[]{"a) 7", "b) 8", "c) 9", "d) 10"}, 'b');
        fragenKatalog[6] = new Frage("Was ist die groesste Wueste der Welt?", new String[]{"a) Sahara", "b) Gobi", "c) Antarktis", "d) Kalahari"}, 'c');
        fragenKatalog[7] = new Frage("Welches Element hat das chemische Symbol O?", new String[]{"a) Gold", "b) Silber", "c) Sauerstoff", "d) Wasserstoff"}, 'c');
        fragenKatalog[8] = new Frage("Welcher Planet ist der sonnennaechste?", new String[]{"a) Venus", "b) Erde", "c) Mars", "d) Merkur"}, 'd');
        fragenKatalog[9] = new Frage("Wie viele Ringe sind auf der olympischen Flagge?", new String[]{"a) 4", "b) 5", "c) 6", "d) 7"}, 'b');
        fragenKatalog[10] = new Frage("Was ist die Hauptstadt von Deutschland?", new String[]{"a) M�nchen", "b) Frankfurt", "c) Berlin", "d) Hamburg"}, 'c');
        fragenKatalog[11] = new Frage("Welches Tier ist das groesste Landraubtier?", new String[]{"a) L�we", "b) Tiger", "c) Eisb�r", "d) Braunb�r"}, 'c');
        fragenKatalog[12] = new Frage("Wie viele Minuten hat eine Stunde?", new String[]{"a) 60", "b) 50", "c) 45", "d) 30"}, 'a');
        fragenKatalog[13] = new Frage("Welches ist das laengste Fliessgewaesser der Welt?", new String[]{"a) Amazonas", "b) Nil", "c) Yangtse", "d) Mississippi"}, 'b');
        fragenKatalog[14] = new Frage("Wer malte die Mona Lisa?", new String[]{"a) Vincent van Gogh", "b) Pablo Picasso", "c) Leonardo da Vinci", "d) Michelangelo"}, 'c');
        fragenKatalog[15] = new Frage("Wie viele Beine hat ein Insekt?", new String[]{"a) 6", "b) 8", "c) 10", "d) 12"}, 'a');
        fragenKatalog[16] = new Frage("Welches Element hat das chemische Symbol H?", new String[]{"a) Helium", "b) Wasserstoff", "c) Hafnium", "d) Kohlenstoff"}, 'b');
        fragenKatalog[17] = new Frage("Was ist das kleinste Land der Welt?", new String[]{"a) Monaco", "b) Nauru", "c) San Marino", "d) Vatikanstadt"}, 'd');
        fragenKatalog[18] = new Frage("Welches Land hat die meisten Einwohner?", new String[]{"a) Indien", "b) USA", "c) China", "d) Russland"}, 'c');
        fragenKatalog[19] = new Frage("Wie viele Bundeslaender hat Deutschland?", new String[]{"a) 14", "b) 15", "c) 16", "d) 17"}, 'c');
        fragenKatalog[20] = new Frage("Was ist das hoechste Gebaeude der Welt?", new String[]{"a) Shanghai Tower", "b) Abraj Al Bait Towers", "c) One World Trade Center", "d) Burj Khalifa"}, 'd');
        fragenKatalog[21] = new Frage("Welcher Planet ist der groesste im Sonnensystem?", new String[]{"a) Jupiter", "b) Saturn", "c) Uranus", "d) Neptun"}, 'a');
        fragenKatalog[22] = new Frage("Wie viele Zaehne hat ein erwachsener Mensch?", new String[]{"a) 28", "b) 30", "c) 32", "d) 34"}, 'c');
        fragenKatalog[23] = new Frage("Was ist das chemische Symbol fuer Gold?", new String[]{"a) Ag", "b) Au", "c) Gd", "d) Ga"}, 'b');
        fragenKatalog[24] = new Frage("Welches Land ist flaechenmaessig das groesste?", new String[]{"a) Kanada", "b) USA", "c) China", "d) Russland"}, 'd');
        fragenKatalog[25] = new Frage("Wie viele Herzen hat ein Oktopus?", new String[]{"a) 1", "b) 2", "c) 3", "d) 4"}, 'c');
        fragenKatalog[26] = new Frage("Welcher Vogel kann nicht fliegen?", new String[]{"a) Strau�", "b) Adler", "c) Spatz", "d) Taube"}, 'a');
        fragenKatalog[27] = new Frage("Was ist die Hauptstadt von Spanien?", new String[]{"a) Barcelona", "b) Madrid", "c) Valencia", "d) Sevilla"}, 'b');
        fragenKatalog[28] = new Frage("Wie viele Tasten hat ein Klavier?", new String[]{"a) 85", "b) 86", "c) 87", "d) 88"}, 'd');
        fragenKatalog[29] = new Frage("Welches Tier ist das groesste Saeugetier?", new String[]{"a) Elefant", "b) Blauwal", "c) Nashorn", "d) Flusspferd"}, 'b');
        fragenKatalog[30] = new Frage("Was ist die Hauptstadt von Italien?", new String[]{"a) Venedig", "b) Mailand", "c) Rom", "d) Neapel"}, 'c');
        fragenKatalog[31] = new Frage("Wie viele Ozeane gibt es?", new String[]{"a) 3", "b) 4", "c) 5", "d) 6"}, 'c');
        fragenKatalog[32] = new Frage("Welches Land hat die meisten Inseln?", new String[]{"a) Indonesien", "b) Kanada", "c) Norwegen", "d) Schweden"}, 'd');
        fragenKatalog[33] = new Frage("Was ist die Hauptstadt von Japan?", new String[]{"a) Osaka", "b) Tokio", "c) Kyoto", "d) Hiroshima"}, 'b');
        fragenKatalog[34] = new Frage("Wie viele Buchstaben hat das Alphabet?", new String[]{"a) 24", "b) 25", "c) 26", "d) 27"}, 'c');
        fragenKatalog[35] = new Frage("Welches ist das hoechste Gebirge der Welt?", new String[]{"a) Anden", "b) Rocky Mountains", "c) Himalaya", "d) Alpen"}, 'c');
        fragenKatalog[36] = new Frage("Wie viele Monate haben 28 Tage?", new String[]{"a) 1", "b) 2", "c) 12", "d) 6"}, 'c');
        fragenKatalog[37] = new Frage("Was ist das kleinste Knochen im menschlichen Koerper?", new String[]{"a) Steigbuegel", "b) Hammer", "c) Amboss", "d) Sesambein"}, 'a');
        fragenKatalog[38] = new Frage("Welches Tier legt Eier?", new String[]{"a) Kaninchen", "b) Kuh", "c) Hund", "d) Huhn"}, 'd');
        fragenKatalog[39] = new Frage("Was ist die Hauptstadt von Kanada?", new String[]{"a) Toronto", "b) Vancouver", "c) Ottawa", "d) Montreal"}, 'c');
        fragenKatalog[40] = new Frage("Welcher Planet wird als roter Planet bezeichnet?", new String[]{"a) Mars", "b) Venus", "c) Erde", "d) Merkur"}, 'a');
        fragenKatalog[41] = new Frage("Wie viele Knochen hat ein erwachsener Mensch?", new String[]{"a) 204", "b) 206", "c) 208", "d) 210"}, 'b');
        fragenKatalog[42] = new Frage("Was ist die Hauptstadt von Australien?", new String[]{"a) Sydney", "b) Melbourne", "c) Canberra", "d) Perth"}, 'c');
        fragenKatalog[43] = new Frage("Wie viele Beine hat eine Spinne?", new String[]{"a) 6", "b) 8", "c) 10", "d) 12"}, 'b');
        fragenKatalog[44] = new Frage("Welches Element hat das chemische Symbol Na?", new String[]{"a) Natrium", "b) Neon", "c) Nickel", "d) Niob"}, 'a');
        fragenKatalog[45] = new Frage("Was ist die Hauptstadt von Aegypten?", new String[]{"a) Kairo", "b) Alexandria", "c) Luxor", "d) Gizeh"}, 'a');
        fragenKatalog[46] = new Frage("Wie viele Augen hat eine Biene?", new String[]{"a) 2", "b) 4", "c) 5", "d) 6"}, 'c');
        fragenKatalog[47] = new Frage("Was ist die Hauptstadt von Russland?", new String[]{"a) Sankt Petersburg", "b) Kiew", "c) Moskau", "d) Minsk"}, 'c');
        fragenKatalog[48] = new Frage("Welches Land hat die groesste Bevoelkerung in Europa?", new String[]{"a) Deutschland", "b) Frankreich", "c) Vereinigtes Koenigreich", "d) Italien"}, 'a');
        fragenKatalog[49] = new Frage("Wie viele Zeitzonen hat Russland?", new String[]{"a) 9", "b) 10", "c) 11", "d) 12"}, 'c');
	}
	
	public String getRandomFrage()
	{
		Random random = new Random();
		int i = random.nextInt(50);
		Frage randomFrage = fragenKatalog[i];
		return randomFrage.getFrage();
	}
	
	public char getAntwort(int i)
	{
		return i < fragenKatalog.length ? fragenKatalog[i].getRichtigeAntwort() : "Fragenindex nicht vorhanden";
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
