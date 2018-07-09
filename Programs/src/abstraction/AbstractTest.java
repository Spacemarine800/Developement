package abstraction;

public class AbstractTest extends TheAbstractClass {

	public static void main(String[] args) {
		AbstractTest abstractTest = new AbstractTest();
		abstractTest.setText("Set into the abstract class");
		abstractTest.letsPrintSomeText(abstractTest.getText());
	}

	@Override
	public void letsPrintSomeText(String txt) {
		System.out.println(txt);
		System.out.println("This shows abstraction");
	}

}
