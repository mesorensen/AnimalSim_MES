//Location class
public class Location {
	
	private int xCoord, yCoord;
	private Object location;
	
	public Location() {
		xCoord = 0;
		yCoord = 0;
		
	}//empty argument constructor
	
	public Location(int xCoord, int yCoord){
		try {
		if(xCoord < 0 || yCoord < 0) {
			throw new InvalidCoordinateException("Coordinate must be greater than 0.");
		}
		else {
			this.xCoord = xCoord;
			this.yCoord = yCoord;
		}
		}
		catch(InvalidCoordinateException e) {
			System.out.println(e);
		}
}//preferred constructor throws and catches InvalidCoordinateException
	public void update(int x, int y){
		System.out.println("	Location before movement " + this.xCoord + ", " + this.yCoord);
		try{
			if(x < 0 || y < 0) {
			throw new InvalidCoordinateException("Coordinates most be greater than 0.");
		}
			else {
				this.xCoord = x;
				this.yCoord = y;
			}
		}
		catch(InvalidCoordinateException e) {
			System.out.println(e);
		}
		System.out.println("	Location after movement " + this.xCoord + ", " + this.yCoord);
	}//update method. Handles InvalidCoordinateException.
	
	
	
	public String getCoordinates() {
		StringBuilder sb = new StringBuilder("New location " + this.xCoord + ", " + this.yCoord);
		String finished = sb.toString();
		return finished; 
	}//getCoordinates method returns coordinates to any array
	
	//getters and setters
	public int getXCoord() {
		return xCoord;
	}
	public void setXCoord(int xCoord) {
		this.xCoord = xCoord;
	}
	public int getYCoord() {
		return yCoord;
	}
	public void setYCoord(int yCoord) {
		this.yCoord = yCoord;
	}
	
	
	
}
