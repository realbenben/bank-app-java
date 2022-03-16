package conseiller;

public class Conseiller {
	private int idConseiller; 
	private String name; 
	private String firstName;
	private String password; 
	
	public Conseiller(int IdConseiller, String Name, String FirstName, String Password) {
		this.name = Name; 
		this.firstName = FirstName; 
		this.password = Password; 
	}

	
	public int getIdConseiller() {
		return idConseiller;
	}


	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
