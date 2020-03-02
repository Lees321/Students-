package entity;

public class StudentEntity {
	private int id;
	private String userName;
	private int age;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public StudentEntity(int id) {
		super();
		this.id = id;
	}
	public StudentEntity(int id, String userName, int age, String address) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.address = address;
	}
	public StudentEntity(String userName, int age, String address) {
		super();
		this.userName = userName;
		this.age = age;
		this.address = address;
	}
	public StudentEntity() {
		super();
	}
	
}
