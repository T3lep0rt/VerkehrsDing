
public class Manager {

	private Stack<String> meldung = new Stack<String>();
	String UserInput;
	boolean istLeer = true;
	
	public void setInput(String pInput) {
		meldung.push(pInput);
	}
	public String getStau() {
		 return meldung.top();
	}
	public void istLeer() {
		if(meldung.top() == null) {
			istLeer = true;
		}else {
			istLeer = false;
		}
	}
	public String vorherigeMeldung() {
		
		if(istLeer) {
			return "Error 404";
		}else {
			meldung.pop();
			return meldung.top();
		}
		
	}
	
}
