package hust.soict.dsai.aims.media;

import java.util.*;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompactDisc(String director, int length) {
		super(director, length);
		// TODO Auto-generated constructor stub
	}
	public CompactDisc(String artist2, String cdTitle, String cdCategory, String cdDirector, float cdCost) {
		this.artist = artist2;
		this.title = cdTitle;
		this.category = cdCategory;
		this.director = cdDirector;
		this.cost = cdCost;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	
	public void addTrack(Track inputTrack) {
		if (!tracks.contains(inputTrack)) {
			tracks.add(inputTrack);
			System.out.println("This track is added to list.");
		}
		else {
			System.out.println("This track is already existed in list.");
		}
	}
	
	public void removeTrack(Track removeTrack) {
		if (!tracks.contains(removeTrack)) {
			System.out.println("This track is not existed in list.");
		}
		else {
			tracks.remove(removeTrack);
			System.out.println("This track is removed from list.");
		}
	}
	
	public int getLength() {
		int totalLength = 0;
		for (Track tr : tracks) {
			totalLength += tr.getLength();
		}
		return totalLength;
	}
	
	public void play() {
		for (Track tr : tracks) {
			tr.play();
		}
	}
}
