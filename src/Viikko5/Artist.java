package Viikko5;

public class Artist {
	private String name;
    private int yearOfBirth;

    public Artist(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        // Kirjoita t�m�n metodin toteutus
    	return this.name;
    }

    public void setName(String name) {
        // Kirjoita t�m�n metodin toteutus
    	this.name = name;
    }

    public int getYearOfBirth() {
        // Kirjoita t�m�n metodin toteutus
    	return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        // Kirjoita t�m�n metodin toteutus
    	this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return this.name;
    }
}