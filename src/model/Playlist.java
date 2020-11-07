package model;
public class Playlist {


	//Atributes
	
	private String name;

	//Relationships
	private Song[] songplay;
	private Genre[] genreplay;
	
	/**
	 * constructor method <br>
	 * <b> pre: we need the atributes </b> 
	 * @param name playlist name
	 */
	public Playlist(String name) {
	this.name = name;
	this.songplay = new Song[MCS.MAX_SONGS];
	this.genreplay = new Genre[7];
	}
	//getters 

	/**
	 * get method <br>
	 * <b> pre: constructor method </b> 
	 * @param name playlist name
	 * @return playlist name
	 */
	public String getName() {
	return name;
	}

	//and setters

	/**
	 * set constructor <br>
	 * <b> pre: constructor method </b> 
	 * @param name playlist
	 */
	public void setName(String name) {

		this.name = name;
	}

	/**
	 * is in charge of verifying if the song was added correctly<br>
	 * <b> pre: we need the information of the song already created and that it has gone through the "addsongtoplaylist" methods in the main and in the MCS </b> 
	 * @param objsong song information
	 * @param objuser user information
	 * @return a message that say, if the song add to playlist correctly or not
	 */

	public String addSongtoplaylist(Song objsong, User objuser){
		String message = "";
		boolean addSong = false;
		for (int i= 0; i < MCS.MAX_SONGS && !addSong; i++){

			if(songplay[i] == null){
				addSong = true;

				songplay[i] = objsong;
				message = "Se añadio correctamente";
			}
			return message;
		}

		if(addSong == false){
			message = "No se pudo crear la cancion en la playlist";
		}
		return message;
	}

	public String sumDuration(){
		int sum=0;
		int num=0,hor=0,min=0,seg=0;
        String message="";
		for (int i=0;i<songplay.length;i++){
			if (songplay[i] !=null)
				sum+=songplay[i].getDuration();
		}

        num=sum;
        min=num/60;
        seg=num-(min*60);
        message=(": "+min+"m "+seg+"s\n");
   		return message;
	}

	public String totalGenre(){
		String message="";
		for (int i=0;i<songplay.length;i++){
			
			if (songplay[i] !=null){
				
				message+=(songplay[i].getGenre()+"; ");
			}
		}
		return message;
	}

	public String toString(){
	
	String message=
		"\n *******Playlist********" +
		"\n Title: " + name +
		"\n During : " +(sumDuration())+
		"\n Genre: " + totalGenre()+
		"\n *************************";
		return message;
	}


}