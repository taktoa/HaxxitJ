package haxxitj.world;

public class Location {
	private int x;
	private int y;
	
	public Location(int xloc, int yloc) {
		setX(xloc);
		setY(yloc);
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	
	public void setX(int xloc) { x = xloc; }
	public void setY(int yloc) { y = yloc; }
}
