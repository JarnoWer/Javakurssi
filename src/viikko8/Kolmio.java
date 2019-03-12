package viikko8;

public class Kolmio extends Muoto {
	private double pisinSivu;
	private double korkeus;
	
	public Kolmio(double pisinSivu, double korkeus) {
		super("kolmio");
		this.pisinSivu = pisinSivu;
		this.korkeus = korkeus;
	}

	@Override
	public double pintaAla() {
		double area = (this.pisinSivu * this.korkeus) / 2;
		return area;
	}
}
