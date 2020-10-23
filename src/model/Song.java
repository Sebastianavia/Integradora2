package model;
public class Song{

	//Atributes
	private int length;
	private String title;
	private String artist;
	//Relationship
	private Genre songGenre;
	private Date date; 
	
	public Song(int length, String title,  String artist, String songGenre) {
		this.length = length;
		this.title = title;
		this.artist = artist;
		this.songGenre = songGenre;
	}
	//getters 
		public int getLength(){
		return length;
		}
		public String getTitle() {
		return title;
		}
		public String getArtist() {
		return artist;
		}
		public String getSongGenre() {
		return songGenre;
		}

	//Setters 
		public void setLenght(int length){
			this.length = title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public void setSongGenre(String songGenre) {
			this.songGenre = songGenre;
		}
}