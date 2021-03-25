public class BrownBear extends Animal implements Walkable, Swimmable{
	public String subSpecies;
	private int simID;
	private boolean full;
	private boolean rested;
	String[] subSpeciesList = {"Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian"};
	Location l = new Location();
	public BrownBear() {
		simID = 0;
		location = l;
		full = false;
		rested = true;
		subSpecies = "";
	}//empty argument constructor
	
	public BrownBear(String subSpecies, int simID, Location location, boolean full, boolean rested) {
		this.simID = simID;
		this.location = location;
		this.full = full;
		this.rested = rested;
		try {
			for(int i = 0; i < subSpeciesList.length; i++) {
				if(subSpecies.compareTo(subSpeciesList[i]) == 0){
					this.subSpecies = subSpecies;
				}
			else {
				throw new InvalidSubspeciesException("Not a subspecies.");
			}
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}//handles InvalidSubspeciesException
	}//preferred constructor
	
	
	public void Walk(int direction){
		int a = location.getXCoord();
		int b = location.getYCoord();
		
		if(direction == 1 ) {
			location.update(a +3, b);//move forwards 3
		}
		else if(direction == 2){
			location.update(a -3, b);//move backwards 3
		}
		else if(direction == 3) {
			location.update(a, b + 3);
		}
		else if(direction == 4) {
			location.update(a, b - 3);
		}
	}//implementation of Walkable interface
	
	public void swim(int direction) {
		int a = location.getXCoord();
		int b = location.getYCoord();
		
		if(direction == 1) {
			location.update(a + 2, b);//move forwards 2
		}
		else if(direction == 2) {
			location.update(a + 2, b);//move backwards 2
		}
		else if(direction == 3) {
			location.update(a - 2, b);
		}
		else if(direction == 4) {
			location.update(a, b - 2);
		}
		
	}//implementation of Swimmable interface
	
	//getters and setters
	public String getSubSpecies() {
		return subSpecies;
	}
	public void setSubSpecies(String subSpecies) {
		for(int i = 0; i < subSpeciesList.length; i++) {
			if(subSpecies.compareTo(subSpeciesList[i]) == 0){
				this.subSpecies = subSpecies;
			}
		}
	}
	public int getSimID() {
		return simID;
	}
	public void setSimID(int simID) {
		this.simID = simID;
	}
	public boolean isFull() {
		return full;
	}
	public void setFull(boolean full) {
		this.full = full;
	}
	public boolean isRested() {
		return rested;
	}
	public void setRested(boolean rested) {
		this.rested = rested;
	}
	public String[] getSubSpeciesList() {
		return subSpeciesList;
	}
	public void setSubSpeciesList(String[] subSpeciesList) {
		this.subSpeciesList = subSpeciesList;
	}

}
