package inheritence;

public class TheInheritenceTest extends TheInheritenceClass {

	private String variableOne = "";
	private int variableTwo = 0;
	
	public static void main(String[] args) {
		TheInheritenceTest inherit = new TheInheritenceTest();
		inherit.setVariableOne("String from TheInheritenceTest");
		inherit.setVariableTwo(1);
		inherit.setVariableThree("String from TheInheritenceClass");
		inherit.setVariableFour(2);
		
		System.out.println("The following values are printed from the sub and super class being inherited");
		System.out.println(inherit.getVariableOne());
		System.out.println(inherit.getVariableTwo());
		System.out.println(inherit.getVariableThree());
		System.out.println(inherit.getVariableFour());
		

	}

	public String getVariableOne() {
		return variableOne;
	}

	public void setVariableOne(String variableOne) {
		this.variableOne = variableOne;
	}

	public int getVariableTwo() {
		return variableTwo;
	}

	public void setVariableTwo(int variableTwo) {
		this.variableTwo = variableTwo;
	}
}
