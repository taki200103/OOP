package hust.soict.itep.aims.media;

import hust.soict.itep.aims.exception.PlayerException;

public class Track implements Playable{
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength() + "seconds");
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Track track = (Track) obj;
	    return title != null && title.equals(track.title) && length == track.length;
	}
	
	public void play1() throws PlayerException {
	    if (getLength() <= 0) {
	        throw new PlayerException("Error: Track length is non-positive!");
	    }
	    System.out.println("Playing track: " + getTitle());
	    System.out.println("Track length: " + getLength());
	}
}
