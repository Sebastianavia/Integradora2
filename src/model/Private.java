package model;
public class Private extends Playlist{

	private String name;
	//Relation
	private User propietary;

	/**
	 * constructor method <br>
	 * <b> pre: we need the atributes </b> 
	 * @param name playlist name
	 * @param propietary user propietary
	 */

	public Private(String name, User propietary){
		super(name);
		this.propietary = propietary;
	}


	/**
	 * check if the song could be created or not, depending on whether the data is correct<br>
	 * <b> pre: we need the information of the song already created and that it has gone through the "addsongtoplaylist" methods in the main and in the MCS </b> 
	 * @param objsong song information
	 * @param objuser user information
	 * @return a message that say, if the song add to playlist correctly or not
	 */
	public String addSongtoplaylist(Song objsong, User objuser){
		String message = "";
		if(objuser.getNickname().equals(propietary.getNickname())){

			message = super.addSongtoplaylist(objsong, objuser);
		}else {
			message = "The song could not be created in the playlist because the user is not the owner of the playlist";
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