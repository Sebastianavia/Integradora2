package model;
public class Playlist {


	//Atributes
	
	private String name;

	//Relationships
	private Song[] songplay;
	private Genre[] genreplay;

	public Playlist(String name) {
	this.name = name;
	this.songplay = new Song[MCS.MAX_SONGS];
	this.genreplay = new Genre[7];
	}
	//getters 
	public String getName() {
	return name;
	}

	//and setters
	public void setName(String name) {

		this.name = name;
	}

	public String addSongtoplaylist(Song objsong, User objuser){
		String message = "";
		boolean addSong = false;
		for (int i= 0; i < MCS.MAX_SONGS && !addSong; i++){

			if(songplay[i] == null){
				addSong = true;

				songplay[i] = objsong;
				message = "Se añadio correctamente";
			}
		}

		if(addSong == false){
			message = "No se pudo crear la cancion en la playlist";
		}
		return message;
	}

	/*public String toString(){
	
		return 
		"\n *******Playlist********" +
		"\n Title: " + name +
		//"\n During : " + during+
		"\n Genre: " + categoryType+
		"\n *************************";
	}*/

}