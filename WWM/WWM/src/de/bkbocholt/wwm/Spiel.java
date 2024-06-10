package de.bkbocholt.wwm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class Spiel 
{
	Frage[] fragenKatalog;
    int anzahlFragen = 0;
    int aktuellerScore = 0;
    int bearbeiteteFragen = 0;

	public Spiel()
	{
		fragenKatalog = new Frage[50];
        try 
        {
            this.dateiEinlesen();
        } catch (IOException e) 
        {
            throw new RuntimeException(e);
        }
	}
	
	public Frage getRandomFrage()
	{
		Random random = new Random();
		int i = random.nextInt(50);
		Frage randomFrage = fragenKatalog[i];
		return randomFrage;
	}

    public boolean checkAntwort(Frage frage, char c)
	{
        return frage.getRichtigeAntwort()==c;
	}

    public void dateiEinlesen() throws IOException
    {
        Path file = FileSystems.getDefault().getPath("fragen.txt");
        try
        {
            InputStream in = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = null;
            while ((line = reader.readLine()) != null)
            {
                frageHinzufuegen(zeilenEinlesen(line));
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    Frage zeilenEinlesen(String line)
    {
        String[] frageStruktur = line.split(";");
        Frage frage = new Frage();
        frage.setFrage(frageStruktur[0]);
        frage.setAntworten(new String[]{frageStruktur[1], frageStruktur[2], frageStruktur[3], frageStruktur[4]});
        frage.setRichtigeAntwort(frageStruktur[5].charAt(0));
        return frage;
    }

    public void spielerUpdaten(String spielerName)
    {
        Path p = Path.of(spielerName+".txt");
        try
        {
            Path filePath = Files.writeString(p,aktuellerScore+"/"+bearbeiteteFragen);
            String s = Files.readString(filePath);
            System.out.println(s);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void frageHinzufuegen(Frage frage)
    {
        if(anzahlFragen == fragenKatalog.length)
        {
            this.katalogErweitern();
        }
        fragenKatalog[anzahlFragen] = frage;
        anzahlFragen++;
    }

    public void katalogErweitern()
    {
        Frage[] neuefragen = new Frage[fragenKatalog.length+1];
        for(int i = 0; i < fragenKatalog.length; i++)
        {
            neuefragen[i] = fragenKatalog[i];
        }
        fragenKatalog = neuefragen;
    }
    

}
