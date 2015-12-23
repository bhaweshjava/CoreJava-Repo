package ArrayList;

public class User implements Comparable<User> {
	int id;
	String password;
	public User() {
		super();
	}
	/**
	 * 
	 * Parameterised Constructor
	 *  Alt+shift+s
	 * Intialize the value of Object
	 */
	public User(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	/**
	 * Tostring Method
	 * Show Object Value
	 * Alt+shift+s
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + "]";
	}
	/**
	 * Setter and Getter for Intialized or GetVaoue from Object
	 * Alt+Shift+s
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	

}
