
public class Manager {

	private Stack<String> meldung = new Stack<String>();
	String UserInput;
	
	public void setInput(String pInput) {
		meldung.push(pInput);
	}
	public String getStau() {
		 return meldung.top();
	}
	public boolean istLeer() {
		if(meldung.top() == null) {
			return true;
		}else {
			return false;
		}
	}
	public String vorherigeMeldung() {
		String temp = meldung.top();
		meldung.pop();
		if(istLeer()) {
			meldung.push(temp);
			return meldung.top();
		}else {
			return meldung.top();
		}
		
	}
	
}
