abstract class Animal extends Location {
	
	protected int simID;
	protected boolean full, rested;
	Location location = new Location();
	public Animal() {
		simID = 0;
		full = false;
		rested = true;
	}// empty argument constructor
	
	public Animal(int simID, Location location) {
		this.simID = simID;
		this.full = false;
		this.rested = true;
		this.location = location;
	}//preferred constructor
	
	//getters and setters 
	public int getSimID() {
		return simID;
	}
	public void setSimID(int simID) {
		try {
			if(simID < 1) {
				throw new InvalidSimIDException("ID must be greater than 0.");
			}
			else {
				this.simID = simID;
			}}
			catch(InvalidSimIDException e) {
				System.out.println(e);
			}//handles InvalidSimIDException
	}
	
	public boolean getFull() {
		return full;
	}
	public void setFull(boolean full) {
		this.full = full;
	}
	public boolean getRested() {
		return rested;
	}
	public void setRested(boolean rested) {
		this.rested = rested;
	}
	public String getLocation() {
		return location.getCoordinates();
	}
	public void setLocation() {
		this.location = location;
	}
	
	public boolean eat() {
		double foodLevel = Math.random();
		
		if(foodLevel > 0.5) {
			this.full = true;
		}
		else {
			this.full = false;
		}
		
		return full;
	}//eat method decides if full or not
	
	public boolean sleep() {
		double sleepLevel = Math.random();
		
		if(sleepLevel < 0.5) {
			this.rested = false;
		}
		else {
			this.rested = true;
		}
		return rested;
	}//sleep method decides if rested or not
}
