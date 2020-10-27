package model;
public class Public extends Playlist{
	//Atributes
	private double[] calification; 

	public Public(double[] calification, String name){
		super(name);
		calification = new double[MCS.MAX_USER];
	}

}