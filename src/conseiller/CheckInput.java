package conseiller;

public class CheckInput {
	
	public static boolean checkPassword(String inputPassword, String password) {
		if(inputPassword == password) {
			return true;
		} else {
			return false;
		}
	}
}
