package viikko8;

public class Country implements Comparable<Country> {

    private final String name;
    private final int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return this.name + ", population: " + this.population;
    }

	@Override
	public int compareTo(Country arg0) {
		if (this.getPopulation() < arg0.getPopulation()) {
            return -1;
        }
        if (arg0.getPopulation() < this.getPopulation()) {
            return 1;
        }
        return 0;
	}
}