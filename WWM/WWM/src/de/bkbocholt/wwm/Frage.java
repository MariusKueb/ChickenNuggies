package de.bkbocholt.wwm;

public class Frage 
{

	private String frage, richtigeAntwort;
	private String[] antworten;

	public Frage(String frage, String richtigeAntwort, String[] antworten)
	{
		this.frage = frage;
		this.richtigeAntwort = richtigeAntwort;
		this.antworten = antworten;
	}

	public String getRichtigeAntwort()
	{
		return richtigeAntwort;
	}

	public String[] getAntworten()
	{
		return antworten;
	}

	public String getFrage()
	{
		return frage;
	}

}
