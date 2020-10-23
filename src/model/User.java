package model;
public class User {

	// Atributes
	private String nickname;
	private int age;
	private String password; 
	//Relatinship
	private Category categoryType;
	private Pool interface;

	public User(String nickname, int age, String password, String categoryType) {
		this.nickname = nickname;
		this.age = age;
		this.password = password;
		this.categoryType =Category.valueOf(categoryType);
		
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
	public String getCategoryType() {
	return categoryType;
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
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}	
}