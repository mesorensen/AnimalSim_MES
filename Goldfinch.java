public class Goldfinch extends Animal implements Walkable, Flyable{
	private double wingSpan;
	private int simID;
	private boolean full;
	private boolean rested;
	private Location l;
	
	public Goldfinch() {
		simID = 0;
		this.l = new Location();
		full = false;
		rested = true;
		wingSpan = 9.0;
	}//empty argument constructor
	
	public Goldfinch(int simID, Location l, double wingSpan) {
		
		this.simID = simID;
		this.location = this.l;
		setWingSpan(wingSpan);
	}//preferred constructor
	
	
	public void Walk(int direction) {
		int x = this.l.getXCoord();
		int y = this.l.getYCoord();
			
		if(direction == 1) {
			this.l.update(x +1 ,y);
		}
		else if(direction == 2){
			this.l.update(x - 1, y);
		}
		else if(direction == 3) {
			this.l.update(x,  y + 1);
		}
		else if(direction == 4) {
			this.l.update(x,  y - 1);
		}
	}//implementation of Walkable interface
	
	public void Fly(int x, int y ) {
		
		if(x>0 && y > 0) {
			l.update(x,y);
		}
	}	
	
	//getters and setters
	public double getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(double wingSpan){
		try {
		if(wingSpan < 5.0 || wingSpan > 11.0) {
			throw new InvalidWingspanException("Invalid Wingspan.");
		}
		else {
			this.wingSpan = wingSpan;
		}
		}
		catch(InvalidWingspanException e) {
			System.out.println(e);
		}//handles InvalidWingspanException
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
	public String getLocation() {
		return location.getCoordinates();
	}
	public void setLocation() {
		this.location = location;
	}
	
	
}
