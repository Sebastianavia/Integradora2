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
		this.categorynum = categorynum;
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
	public void setCategorynum(int categorynum) {
		this.categorynum = categorynum;
	}	
	public void setCategoryType(Category categoryType) {
		this.categoryType = categoryType;
	}	

	public Category convert(String categoryType){
        Category myUserType = Category.valueOf(categoryType);
        return myUserType;

    }

	public String toString(){
	String message;
	message=
		"\n **********USER***********" +
		"\n Username: " + nickname +
		"\n Age: " + age +
		"\n Category: " + categoryType+
		"\n *************************";
		return message;
	}


/*
		public void categorynum(){
		categorynum++;
		}
	

	public void updateCategory(){
		

		if (categorynum <= 3){

			categorynum=Category().NEWBIE;

		}
			else if (categorynum > 3 && categorynum <=10){
				categorynum=Category().LITLECONTRIBUTOR;
		} else {
			if (categorynum > 10 && categorynum <=30)
					categorynum=Category().MILDCONTRIBUTOR;
		}else
					categorynum=Category().STARCONTRIBUTOR;

		}
		*/

}