package hust.soict.dsai.aims.media;

public class Disc extends Media {
	protected String director;
	protected int length;
	
	public Disc() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Disc(String director, int length) {
		super();
		this.director = director;
		this.length = length;
	}

	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
}
