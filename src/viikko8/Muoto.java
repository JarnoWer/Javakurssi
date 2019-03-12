package viikko8;

public abstract class Muoto {

    private String nimi;

    public Muoto(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return this.nimi;
    }

    public abstract double pintaAla();

    @Override
    public String toString() {
        return this.getNimi() + ": " + this.pintaAla();
    }
}