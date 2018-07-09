package abstraction;

public class AbstractTest extends TheAbstractClass {

	public static void main(String[] args) {
		new AbstractTest().letsPrintSomeText();
	}

	@Override
	public void letsPrintSomeText() {
		System.out.println("This shows abstraction");
	}

}
