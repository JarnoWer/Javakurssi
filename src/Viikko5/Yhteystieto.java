package Viikko5;

public class Yhteystieto {

	  private final String nimi;
	  private final String puhelinnumero;

	  public Yhteystieto(String nimi, String puhelinnumero) {
	    this.nimi = nimi;
	    this.puhelinnumero = puhelinnumero;
	  }

	  public String getNimi() {
	    return this.nimi;
	  }

	  public String getPuhelinnumero() {
	    return this.puhelinnumero;
	  }

	  @Override
	  public String toString() {
	    return "Nimi: " + this.nimi + ", puhelin: " + this.puhelinnumero;
	  }
	}