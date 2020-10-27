package model;
public class MCS{

	//Constants
	public final static int MAX_SONGS = 50;
	public final static int MAX_PLAYLIST = 20;
	public final static int MAX_USER = 10;

	//Relationship
	private Playlist[] playlist;
	private User[] user;
	private Song[] song;


	public MCS(){
		song = new Song [MAX_SONGS];
		user = new User [MAX_USER];
		playlist = new Playlist [MAX_PLAYLIST];
	}
	//________________________________________
	//adds methods
	public Song findSong(String tittle){
		Song objSearch=null;
		boolean findSo=false;
		for (int i=0;i<MAX_SONGS && !findSo;i++){
			if (song[i]!=null && song[i].getTittle().equalsIgnoreCase(tittle)){
				objSearch=song[i];
				findSo=true;	
			}
		}
		return objSearch;
	}

	public User findUser(String nickname){
		User objSearch=null;
		boolean findUs=false;
		for (int i=0;i<MAX_USER && !findUs;i++){
			if (user[i]!=null && user[i].getNickname().equalsIgnoreCase(nickname)){
				objSearch=user[i];
				findUs=true;	
			}
		}
		return objSearch;
	}
	public Playlist findPlaylist(String name){
		Playlist objSearch=null;
		boolean findPl=false;
		for (int i=0;i<MAX_PLAYLIST && !findPl;i++){
			if (playlist[i]!=null && playlist[i].getName().equalsIgnoreCase(name)){
				objSearch=playlist[i];
				findPl=true;	
			}
		}
		return objSearch;
	}
    

	public String addUser (String nickname, int age, String password ){
		String message="";
		boolean addUs=false;
		User objSearch=findUser(nickname);
		if(objSearch!=null)
			message="Error. the user already exist";
		else{
			for (int i=0;i<MAX_USER && !addUs;i++){
				if (user[i]==null){
					user[i]= new User (nickname, age, password);
					addUs=true;
					message="The user has been registered";
				}
			}
			if (addUs==false)
				message="All users are already created";
		}
		return message;
	}
	public String addPlaylist(String name){
		String message="";
		boolean addPl=false;
		Playlist objSearch=findPlaylist(name);
		if(objSearch!=null)
			message="Error. the playlist already exist";
		else{
			for (int i=0;i<MAX_PLAYLIST && !addPl;i++){
				if (playlist[i]==null){
					playlist[i] = new Public(name);
					addPl=true;
					message="The playlist has been registered";
				}
			}
			if (addPl==false)
				message="All playlist are already created";
		}
		return message;
	}
	//___________________________________________________
	public String addPlaylist(String name, String name1){
		String message="";
		boolean addPl=false;
		User objuser = findUser(name1);
		Playlist objSearch=findPlaylist(name);
		if(objSearch!=null)
			message="Error. the playlist already exist";
		else{
			for (int i=0;i<MAX_PLAYLIST && !addPl;i++){
				if (playlist[i]==null){
					playlist[i]= new Private (name, objuser);
					addPl=true;
					message="The playlist has been registered";
				}
			}
			if (addPl==false)
				message="All playlist are already created";
		}
		return message;
	}
	//____________________________________________________
	public String addPlaylist(String name, String[] resuser){
		String message="";
		boolean addPl=false;

		Playlist objSearch=findPlaylist(name);
		if(objSearch!=null)
			message="Error. the playlist already exist";
		else{
			for (int i=0;i<MAX_PLAYLIST && !addPl;i++){
				if (playlist[i]==null){
					playlist[i]= new Restricted (name, restricted);
					addPl=true;
					message="The playlist has been registered";
				}
			}
			if (addPl==false)
				message="All playlist are already created";
		}
		return message;
	}

	//_________________________________________________________________________________________________

	public String addSong (int duration, String title,  String artist, String songGenre, String date ){
		String message="";
		boolean addSo=false;
		Song objSearch=findSong(title);
		if(objSearch!=null)
			message="Error. the song already exist";
		else{
			for (int i=0;i<MAX_SONGS && !addSo;i++){
				if (song[i]==null){
					song[i]=new Song (duration, title,  artist, songGenre, date);
					addSo=true;
					message="The song has been created";
				}
			}
			if (addSo==false)
				message="No more space to add songs";
		}
		return message;
	}
	public String addSongtoplaylist(String name, String nickname, String song){
		String message ="";
		boolean validate = true;
		Playlist objplay = findPlaylist(name);
		User objuser = findUser(nickname);
		Song objsong = findSong(song);

		if(objplay == null || objuser ==null || objsong ==null){

			validate = false;
			if(objplay == null){
				message +="no existe un playlist con ese nombre";
			}

			if(objuser == null){
				message += " no esxiste un usuario con ese nombre";
			}
			if(objsong == null){
				message += " no existe una cancion con ese nombre";
			}
		}
		if(validate == true){
			message += objplay.addSongtoplaylist(objsong, objuser);
		}
		return message;
	}
	

	
}

