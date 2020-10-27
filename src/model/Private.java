package model;
public class Private extends Playlist{
	//Relation
	private User propietary;

	public Private(User propietary, String name){
		super(name);
		this.propietary = propietary;
	}

	public String addSongtoplaylist(Song objsong, User objuser){
		String message = "";
		boolean addSong = false;

		if(objuser.getNickname().equals(propietary.getNickname())){
			addsong = true;
			message = super.addSongtoplaylist(objsong, objuser);
		}else {
			message = "The song could not be created in the playlist because the user is not the owner of the playlist";
		}

		return message;
	}

}