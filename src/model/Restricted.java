package model;
public class Restricted extends Playlist{
	//Atributes 


	public Restricted(String[] restricted, String name){
		super(name);
		this.restricted = restricted;
	}

	public String addSongtoplaylist(Song objsong, User objuser){
		String message = "";
		boolean addSong = false;

		if(objuser.getNickname().equals(restricted.getNickname())){
			addsong = true;
			message = super.addSongtoplaylist(objsong, objuser);
		}else {
			message = "No se pude crear la cancion en el playlist porque el usuario no es el propietario de la playlist";
		}

		return message;
	}

}