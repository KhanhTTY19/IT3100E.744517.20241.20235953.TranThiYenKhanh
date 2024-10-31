package app;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private float cost;
	private String director;
	private int length;
	
	public DigitalVideoDisc() {
		
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		this.length = length;
	}

	public DigitalVideoDisc(String title, String category, float cost, String director) {
		super();
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
	
}
