package app.server.model;

public class Employee {
	private Long empID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String encodedPhoto;

	private byte[] photo;

	public Employee() {

	}

	public Employee getEmployee() {
		return this;
	}

	public Long getEmpID() {
		return empID;
	}

	public void setEmpID(Long empID) {
		this.empID = empID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getEncodedPhoto() {
		return encodedPhoto;
	}

	public void setEncodedPhoto(String encodedPhoto) {
		this.encodedPhoto = encodedPhoto;
	}

}
