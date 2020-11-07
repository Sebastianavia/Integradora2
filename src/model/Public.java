package model;
public class Public extends Playlist{
	public static final int CALIFICATION =10;
	//Atributes
	
	private double[] calification= new double[CALIFICATION];

	public Public(String name){
		super(name);
		this.calification=calification;
	}
	public void setCalification(double acalification){
        boolean out=false;
        for(int i=0; i<CALIFICATION && out!=true; i++){
            if(calification[i]==0.0){
                calification[i]=acalification;
                out=true;
            }
        }
    }


	 public double calificationAverage(){
       double average=0;
       for(int i=0; i<CALIFICATION; i++){
           if(calification[i] != 0.0){
               average+=calification[i];
           }
       }
       return average/CALIFICATION;
     }

	/**
	 * add any song if it is already created, because it is public<br>
	 * <b> pre: we need the information of the song already created and that it has gone through the "addsongtoplaylist" methods in the main and in the MCS </b> 
	 * @param objsong song information
	 * @param objuser user information
	 * @return a message that say, if the song add to playlist correctly
	 */

	@Override
	public String addSongtoplaylist(Song objsong, User objuser){
		String message = "";
		message = message = super.addSongtoplaylist(objsong, objuser);
		return message;
	}

	@Override
	public String toString(){
	
	String message=
		"\n ******private Playlist*****" +
		"\n Title: " + getName() +
		"\n During : " +(sumDuration())+
		"\n Genre: " + totalGenre()+
		"** Calification: "+calificationAverage()+"\n"+
		"\n *************************";
		return message;
	}
}