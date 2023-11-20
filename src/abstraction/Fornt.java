package abstraction;

public class Fornt {
private long  phone;
private String name;
private String password="Bhargav@123";
private String user_name="bhargav_asta";

	public long getPhone() {
		return phone;
		
	}
	public void setPhone(long num) {
		this.phone=num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getUser_name(){
		return user_name;
	}
	
	public void setUser_name(String user_name) {
		this.user_name=user_name;
	}

}
