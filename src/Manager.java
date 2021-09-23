
public class Manager {

	private Stack<String> meldung = new Stack<String>();
	private Stack<String> fwdStack = new Stack<String>();
	String UserInput;
	
	public void setInput(String pInput) {
		meldung.push(pInput);
	}
	public String getStau() {
		 return meldung.top();
	}
	public boolean istLeer(Stack<String> pMeldung) {
		if(pMeldung.top() == null) {
			return true;
		}else {
			return false;
		}
	}
	public String vorherigeMeldung() {
		String temp = meldung.top();
		meldung.pop();
		if(istLeer(meldung)) {
			meldung.push(temp);
			return meldung.top();
		}else {
			fwdStack.push(temp);
			return fwdStack.top();
		}
		
	}
	public String forward() {
		
		String temp = fwdStack.top();
		fwdStack.pop();
		if(istLeer(fwdStack)) {
			fwdStack.push(temp);
			return fwdStack.top();
		}else {
			meldung.push(temp);
			return meldung.top();
		
		
	}
	}
	
}
