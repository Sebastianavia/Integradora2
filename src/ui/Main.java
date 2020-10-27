package ui;
import java.util.Scanner;
import model.MCS;

public class Main{

	private  Scanner sc;
	public MCS mcs;

	public  Main() {
		sc= new Scanner(System.in);
		mcs = new MCS();
	}	

	public static void main(String[] args) {
	System.out.println("************************");
	System.out.println("***  Welcome to MCS  ***");
	System.out.println("************************");
	Main ppal= new Main();

	int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		

	}

	public int showMenu() {
		int option=0;

		System.out.println(
				"Selec one option to start\n" +
				"(1) to create one user\n" +
				"(2) to create one song\n"+
				"(3) to create one playlist\n"+
				"(4) to add song to playlist\n" +  
				"(0) to get out"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			createUser() ;
			break;
		case 2:
			createSong();
			break;
		case 3:
			createPlaylist();
			break;
		case 4:
			addSongtoplaylist();
			break;
		default:
			System.out.println("Error, opción no válida");
		}
	}

	//user information
	private void createUser(){
		String nickname, password; 
		int age; 
		System.out.println("Write your nickname");
		nickname = sc.nextLine();
		System.out.println("Write your age");
		age = sc.nextInt();
		System.out.println("Write your password");
		password = sc.nextLine();
		String message = mcs.addUser(nickname,  age, password);
		System.out.println(message);

	}//end
	//__________________________________________________________________________________
	//song information
	private void createSong(){
		String name, artist, songGenre, date;
		int duration;
		System.out.println("Write down the song information");
		System.out.println("write the song name");
		name = sc.nextLine();		
		System.out.println("Write the artist name");
		artist = sc.nextLine();
		System.out.println("Write the song length");
		duration = sc.nextInt();sc.nextLine();
		System.out.println("Write the song genre (ROCK, HIP_HOP, CLASSIC, REGGAE, SALSA, METAL, POP)");
		songGenre = sc.nextLine().toUpperCase();
		System.out.println("Write the song¨S release date");
		date = sc.nextLine();

		String message =  mcs.addSong(duration, name, artist, songGenre, date);
		System.out.println(message);
	}//End
	//___________________________________________________________________________________
	//playlist information
	private void createPlaylist(){
		int length, numplay;
		String name; 
		System.out.println("Write the playlist information");
		System.out.println("Write the playlist name");
		name = sc.nextLine();
		System.out.println("Write (1) if the playlist is private \n" +
		"(2) if de playlist is public \n" +
		" or (3) if de playlist is restricted\n");
		numplay = sc.nextInt();

		switch(numplay) {
		case 1:
			System.out.println("Write user name");
			String name1 = sc.nextLine();
			mcs.addPlaylist(name, name1);
			break;
		case 2:
			mcs.addPlaylist(name);
			break;
		case 3:
			String[] resuser = new String[5];
			for(int i = 0; i<5; i++){
				System.out.println("Write user name");
				resuser[i] = sc.nextLine();
			}
			mcs.addPlaylist(name, resuser);
			
			break;
		default:
			System.out.println("Error, opción no válida");
		}
	}//End
	//____________________________________________________________________________________

	private void addSongtoplaylist(){
		String name, nickname, song;
		System.out.println("Write tne playlist name");
		name = sc.nextLine();
		System.out.println("Write the nickname");
		nickname = sc.nextLine();
		System.out.println("Write the name song");
		song = sc.nextLine();
		String message = mcs.addSongtoplaylist(name, nickname, song);
		System.out.println(message);
	}
}
