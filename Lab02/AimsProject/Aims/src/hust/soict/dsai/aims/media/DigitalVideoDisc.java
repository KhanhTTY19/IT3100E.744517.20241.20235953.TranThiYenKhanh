package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDisc = 0;
	public DigitalVideoDisc() {
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.nbDigitalVideoDisc++;
		this.id = this.nbDigitalVideoDisc;
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.nbDigitalVideoDisc++;
		this.id = this.nbDigitalVideoDisc;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.nbDigitalVideoDisc++;
		this.id = this.nbDigitalVideoDisc;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		this.length = length;
	}

	public DigitalVideoDisc(String title, String category, float cost, String director) {
		super();
		this.nbDigitalVideoDisc++;
		this.id = this.nbDigitalVideoDisc;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
	}

	public int getID() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "DVD " + getTitle() +" "+ getCategory() + " " + getDirector() +" "+ getLength() + ": " + getCost();
	}
	
	public boolean isMatchTitle(String name) {
		name.replace(',', ' ');
		String[] word = name.split(" ");
		for (String j : word) {
			if (this.getTitle().toLowerCase().contains(j)) {
				return true;
			}
		}
		return false;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("Track DVD: " + this.getLength());
	}
}
