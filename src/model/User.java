package model;
public class User {

	// Atributes
	private String nickname;
	private int age;
	private String password; 
	private int categorynum;
	//Relatinship
	private Category categoryType;
	
	

	public User(String nickname, int age, String password) {
		this.nickname = nickname;
		this.age = age;
		this.password = password;
		this.categorynum = 0;
		this.categoryType =Category.NEWBIE;
		
	}
	//getters 
	public String getNickname() {
	return nickname;
	}
	public int getAge() {
	return age;
	}
	public String getPassword() {
	return password;
	}
	public Category getCategoryType() {
	return categoryType;
	}
	public int getCategorynum() {
	return categorynum;
	}
	//and setters
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setCategoryType(int categorynum) {
		this.categorynum = categorynum;
	}	
	public void setCategorynum(Category categoryType) {
		this.categoryType = categoryType;
	}	

	public String toString(){
	
		return 
		"\n **********User***********" +
		"\n Username: " + nickname +
		"\n Age: " + age +
		"\n Category: " + categoryType+
		"\n *************************";
	}

}