public class Application {
	public static void main(String[] args) {
		
		System.out.println("*********************************************\nLocation Tests:\n              ");
			System.out.println("Location will be tested in Goldfinch and Brownbear tests:)");
		
		System.out.println("*********************************************\nAnimal Tests: \n                     ");
			//Animal puppy = new Animal();
			// this would prevent the program from compiling because Animal is an abstract class.
			System.out.println("Location will be tested in the goldfinch and brown bear tests. The brown bear tests will throw an exception.");
		System.out.println("*********************************************\nGoldfinch Tests: \n       ");
			
			//Create Goldfinch, Goldie.
			Goldfinch goldie = new Goldfinch();
			
			//SimID test
			goldie.setSimID(4);
			System.out.println("SimID: " + goldie.getSimID());
			//Wingspan test
			goldie.setWingSpan(8.0);
			
			//Eat test
			goldie.eat();
			System.out.println("Is Goldie full? " + goldie.isFull());
			
			//Sleep test
			goldie.sleep();
			System.out.println("Did Goldie get 8 hours of sleep last night? " + goldie.isRested());
			
			//Location tests
			
			//Walkable test
			System.out.println("Goldie walked one unit: ");
			goldie.Walk(3);
			
			
			//Flyable test
			System.out.println("Goldie flew to (20, 10).");
			goldie.Fly(20, 10);
			
			
			
			
		System.out.println("*********************************************\nBrownbear Tests: \n     ");
			BrownBear yogiBear = new BrownBear();
			
			//SimID test
			yogiBear.setSimID(1);
			System.out.println("SimID: " + yogiBear.getSimID());
			
			//Subspecies test
			yogiBear.setSubSpecies("Alaskan");
			System.out.println("Species: " + yogiBear.getSubSpecies());
			
			//Sleep test
			yogiBear.sleep();
			System.out.println("Did Yogi get 8 hours of sleep last night? " + yogiBear.isRested());
			
			//Eat test
			yogiBear.eat();
			System.out.println("Is Yogi full? " + yogiBear.isFull());
			
			//Walkable tests
			System.out.println("Yogi walked 3 units. ");
			yogiBear.Walk(4);
			
			//Swimmable tests
			System.out.println("Yogi sawm 2 units. ");
			yogiBear.swim(3);
			
	}	
}
