package tdd.training.session1;

public class Coordinates {

	public Coordinates(int x_coordinate, int y_coordinate) {
		
		this.x_coordinate = x_coordinate;
		this.y_coordinate = y_coordinate;
	}
	/**
	 * @return the x_coordinate
	 */
	public int getX_coordinate() {
		return x_coordinate;
	}
	/**
	 * @param x_coordinate the x_coordinate to set
	 */
	public void setX_coordinate(int x_coordinate) {
		this.x_coordinate = x_coordinate;
	}
	/**
	 * @return the y_coordinate
	 */
	public int getY_coordinate() {
		return y_coordinate;
	}
	/**
	 * @param y_coordinate the y_coordinate to set
	 */
	public void setY_coordinate(int y_coordinate) {
		this.y_coordinate = y_coordinate;
	}
	
	int x_coordinate;
	int y_coordinate;
	
	public Coordinates getCoordinates(){
		return new Coordinates(getX_coordinate(), getY_coordinate());
	}

	public Coordinates setCoordinates(int x, int y){
		return new Coordinates(coordinates.setX_coordinate(x), coordinates.setY_coordinate(y));
	}
}

