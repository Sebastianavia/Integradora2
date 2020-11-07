package model;
public class Restricted extends Playlist{
	//Atributes 
	private String[] restricted;
	public Restricted(String name, String[] restricted){
		super(name);
		this.restricted = restricted;
	}

	@Override
	public String addSongtoplaylist(Song objsong, User objuser){
		String message = "";
		boolean addSong = false;
        for (int i=0;i<5 && !addSong;i++){
		if(objuser.getNickname().equals(restricted[i])){
			addSong = true;
			message = super.addSongtoplaylist(objsong, objuser);
		}else {
			message = "No se pude crear la cancion en el playlist porque el usuario no es el propietario de la playlist";
		}
	   }

		return message;
	}
	@Override
	public String toString(){
	
	String message=
		"\n ******private Playlist*****" +
		"\n Title: " + getName() +
		"\n During : " +(sumDuration())+
		"\n Genre: " + totalGenre()+
		"\n *************************";
		return message;
	}



}