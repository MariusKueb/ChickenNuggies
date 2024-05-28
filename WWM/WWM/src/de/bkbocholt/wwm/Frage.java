package de.bkbocholt.wwm;

public class Frage 
{

	private String frage;
	private char richtigeAntwort;
	private String[] antworten;

	public Frage(String frage, String[] antworten, char richtigeAntwort)
	{
		this.frage = frage;
		this.richtigeAntwort = richtigeAntwort;
		this.antworten = antworten;
	}

	public char getRichtigeAntwort()
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
