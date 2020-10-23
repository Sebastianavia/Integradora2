package model;
public class Playlist {
	//Atributes
	private int Length;
	private String name;

	//Relationships
	private Genre playlistGenre;
	private Song song,

	public Playlist(int length, String name) {
	this.length = length;
	this.length = length;
	}
	//getters 
	public String getName() {
	return name;
	}

	//and setters
	public void setName(String name) {
		this.name = name;
	}

}