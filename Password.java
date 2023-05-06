// Exam paper question 2015 paper (Vaild password checker)
// Adam Plesca
// 7/5/23

//code doesn't work properly but was a decent attempt in a short time frame
public class Password{
	//private data types
	private String pw;
	private boolean safe;
	//constructor assigning default values
	public Password(){
		pw = " ";
		safe = false;
	}
	//setters, they set the empty value that the constructor did, by getting input from the main class
	public void setPassword(String pw){
		this.pw = pw;
	}
	//compute mthod, this is where all the calculations are done for password safety
	public void compute(){
		int intPW = Integer.parseInt(pw);
		for(int i = 0; i < pw.length(); i++){ //loops through password to see if the user input fits the requirements
			if((pw.charAt(i) >= 8) && (pw.charAt(i) >= '0' || pw.charAt(i) >= '1'|| pw.charAt(i) >= '2'|| pw.charAt(i) >= '3'|| pw.charAt(i) >= '4'|| pw.charAt(i) >= '5'|| pw.charAt(i) >= '6'|| pw.charAt(i) >= '7'|| pw.charAt(i) >= '8'|| pw.charAt(i) >= '9')){
				safe = true; //if more than 8 characters and contains a number between 0-9
			}
			else if(pw.charAt(i) <= 8){ //if not loops terminates and declares boolean as not safe, if the user input's password (pw) isn't safe
				safe = false;
				break;
			}
			else if(pw.charAt(i) != '0' || pw.charAt(i) != '1'|| pw.charAt(i) != '2'|| pw.charAt(i) != '3'|| pw.charAt(i) != '4'|| pw.charAt(i) != '5'|| pw.charAt(i) != '6'|| pw.charAt(i) != '7'|| pw.charAt(i) != '8'|| pw.charAt(i) != '9'){
				safe = false;
				break;
			}
			else if(pw.charAt(i) <= 8){
				safe = false;
				break;
			}
		}
	}
	//getters, these return the values that were calculated to be used in the main method of this Application
	public String getPassword(){
		return pw;
	}
	public boolean getSafety(){
			return safe;
	}
}