package viikko8;

public class Nelio extends Muoto {
 private double sivunPituus;
 
 public Nelio(double sivunPituus) {
		super("neli�");
		this.sivunPituus = sivunPituus;
	}

	@Override
	public double pintaAla() {
		double area = sivunPituus * sivunPituus;
		return area;
	}
}

