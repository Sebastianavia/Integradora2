package ui;
import java.util.Scanner;
import model.*;

public class Main{

	private static Scanner sc;
	private static User user;
}
	
	public Main() {
		sc= new Scanner(System.in);
	}			
	public static void main(String[] args) {
	system.out.println("************************");
	system.out.println("***  Welcome to MCS  ***");
	system.out.println("************************");

	}
	//user information
	private void createUser(){
		String nickname, password, categoryType; 
		int age; 
		system.out.println("Write your nickname");
		nickname = sc.nextLine();
		system.out.println("Write your age");
		age = sc.nextInt();
		system.out.println("Write your password");
		password = sc.nextLine();
		
	}//end
	//__________________________________________________________________________________
	//song information
	private void createSong(){
		String name, artist, songGenre;
		int songlength;
		system.out.println("Write down the song information");
		system.out.println("write the song name");
		name = sc.nextLine();		
		system.out.println("Write the artist name");
		artist = sc.nextLine();
		system.out.println("Write the song length");
		songlength = sc.nextInt();
		system.out.println("Write te song genre (ROCK, HIP_HOP, CLASSIC, REGGAE, SALSA, METAL)");
		songGenre = sc.nextLine().toUpperCase();
	}//End
	//___________________________________________________________________________________
	//playlist information
	private void createPlaylist(){
		int length;
		String name; 
		system.out.println("Write the playlist information");
		system.out.println("Write the playlist name");
		name = sc.nextLine();
		//ystem.out.println("Ingres el tiempo");
		//length = sc.nextInt
	}//End
	//____________________________________________________________________________________

