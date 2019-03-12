package viikko8;

public class Henkilo {
	private String name;
	private String address;

	public Henkilo(String name, String address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return (this.name + "\n  " + this.address);
		
	}
}
