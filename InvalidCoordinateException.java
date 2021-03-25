/*Invalid coordinate exception throws when any xCoord or yCoord is < 0 in Location class.
 */
public class InvalidCoordinateException extends Exception{
	
	public InvalidCoordinateException() {
		
	}//empty constructor
	
	public InvalidCoordinateException(String message) {
		super(message);
	}//preferred constructor
	
}
