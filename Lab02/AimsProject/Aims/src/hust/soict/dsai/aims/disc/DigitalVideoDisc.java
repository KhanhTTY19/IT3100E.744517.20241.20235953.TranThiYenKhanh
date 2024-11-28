package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private float cost;
	private String director;
	private int length;
	private static int nbDigitalVideoDisc = 0;
	private int id;
	
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

	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setTitle(String title) {
		this.title = title;
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
}
