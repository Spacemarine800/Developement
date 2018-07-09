package polymorphism;

public class Horse extends Animal implements Racer {

	public static void main(String[] args) {
		Horse hrse = new Horse();
		hrse.setTail(true);
		hrse.setNumberOfLegs(4);
		hrse.setCarnivore(false);
		
		System.out.println("The Horse as Racer falls into the "+hrse.category()+" categrory. Has a top speed of "+hrse.topSpeed()+" kph.");
		System.out.println("It is still an animal as it has "+hrse.getNumberOfLegs()+" legs and it is "+hrse.isTail()+" has a tail. It is also "+hrse.isCarnivore()+" its a carnivore.");

	}

	@Override
	public String category() {
		return "Professional";
	}

	@Override
	public int topSpeed() {
		return 110;
	}

}
