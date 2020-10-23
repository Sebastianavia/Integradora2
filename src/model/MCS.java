package model;
public class MCS{

	//Atributes
	private Playlist[] pool;
	//Relationship
	private User user; 
	private Song song;

	private MCS(Playlist[] pool){
		this.pool = pool;
	}

	//get
	public Playlist[] getPool(){
		return pool;
	} 
	//set
	public void setPool(){
		this.pool = pool;
	}


	//
	


}