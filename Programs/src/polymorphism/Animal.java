package polymorphism;

public class Animal {

	int numberOfLegs = 0;
	boolean tail = false;
	boolean carnivore = false;
	
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	public boolean isTail() {
		return tail;
	}
	public void setTail(boolean tail) {
		this.tail = tail;
	}
	public boolean isCarnivore() {
		return carnivore;
	}
	public void setCarnivore(boolean carnivore) {
		this.carnivore = carnivore;
	}
}
