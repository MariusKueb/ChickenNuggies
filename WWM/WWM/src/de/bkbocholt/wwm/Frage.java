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

	public Frage()
	{

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

	public void setFrage(String frage) {this.frage = frage;}
	public void setRichtigeAntwort(char richtigeAntwort) {this.richtigeAntwort = richtigeAntwort;}
	public void setAntworten(String[] antworten) {this.antworten = antworten;}

}
