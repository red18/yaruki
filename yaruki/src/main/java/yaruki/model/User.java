package yaruki.model;

public class User {

	private int id;
	private String name;
	private String email;
	private MemberType type;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the type
	 */
	public MemberType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(MemberType type) {
		this.type = type;
	}
}
