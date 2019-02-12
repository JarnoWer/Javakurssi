package Viikko5;

public class Agentti {
	 private String etunimi;
	    private String sukunimi;

	    public Agentti(String etunimi, String sukunimi) {
	        this.etunimi = etunimi;
	        this.sukunimi = sukunimi;
	    }

	    public String toString() {
	        return "My name is " + this.sukunimi + ", " + this.etunimi + " " + this.sukunimi;
	    }
	}