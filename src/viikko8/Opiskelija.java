package viikko8;

public class Opiskelija extends Henkilo {
	
	private int points;
	
	public Opiskelija(String name, String address) {
		super(name, address);
		this.points = 0;
	}
	public void opiskele() {
		points ++;
	}
	public int opintopisteita() {
		return points;
	}
	@Override
	public String toString() {
		String start = super.toString();
		return (start + "\n  opintopisteitä " + points);
		
	}
}
