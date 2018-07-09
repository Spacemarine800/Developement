package abstraction;

public abstract class TheAbstractClass {

	private String text = "From the abstract class";
	
	abstract public void letsPrintSomeText(String txt);

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
