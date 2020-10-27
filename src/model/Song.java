package model;
public class Song{

	//Atributes
	private int duration;
	private String tittle;
	private String artist;
	private String date;
	//Relationship
	private Genre songGenre;
	
	
	public Song(int duration, String tittle,  String artist, String songGenre, String date) {
		this.duration = duration;
		this.tittle = tittle;
		this.artist = artist;
		this.songGenre = Genre.valueOf(songGenre);
		this.date = date;
	}
	//getters 
		public int getDuration(){
		return duration;
		}
		public String getTittle() {
		return tittle;
		}
		public String getArtist() {
		return artist;
		}
		public Genre getSongGenre() {
		return songGenre;
		}
		public String getDate() {
		return date;
		}

	//Setters 
		public void setDuration(int duration){
			this.duration = duration;
		}
		public void setTittle(String tittle) {
			this.tittle = tittle;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		//public void setSongGenre(Genre songGenre) {
		//	this.songGenre = songGenre;
		//}
		public void setDate(String date) {
			this.date = date;
		}

		public String duration(){
		int num=0,hor=0,min=0,seg=0;
        String message="";
        num=duration;
        min=num/60;
        seg=num-(min*60);

    	message=(": "+min+"m "+seg+"s\n");
   		return message;

		}
}