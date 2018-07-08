import java.util.Scanner;

public class Deadlock {

//	Output
//	Fox: Wolf has bitten me!
//	Wolf: Fox has run away! I am still hungry 
//	Wolf: Fox has bitten me!
//	Fox: Wolf has run away! I am still hungry
	
	static class Animal {
		private final String name;

		public Animal(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public synchronized void bite(Animal bitter) {
			System.out.format("%s: %s has bitten me!%n", this.name,
					bitter.getName());
			bitter.runAway(this);
		}

		public synchronized void runAway(Animal bitter) {
			System.out.format("%s: %s has run away! I am still hungry %n", this.name,
					bitter.getName());
		}
	}

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);   
        String _name1;
        String _name2;
        try {
            _name1 = "Wolf";
            _name2 = "Fox";
        } catch (Exception e) {
            _name1 = null;
            _name2 = null;
        }	
        
		final Animal wolf = new Animal(_name1);
		final Animal fox = new Animal(_name2);

	
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				wolf.bite(fox);
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				fox.bite(wolf);
			}
		});
		
		//Added Code
/*		Thread thread3 = new Thread(new Runnable() {
			public void run() {
				System.exit(0);
			}
		});
		
		 thread2.start();
		 try {
			thread1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     thread1.start();
	    
	     try {
				
	    	 thread3.sleep(1000);
	    	 thread3.start();
			} catch (Exception e) {
				e.printStackTrace();
			}*/
	     //
	     
		thread2.start();
	    try {
			thread1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread1.start();
	     
	     
	     
	  }
	}

