package haxxitj.world;

public class Grid {
	private Sector[][] grid;
	
	public Grid(int xsize, int ysize) {
		Sector[][] temp = new Sector[xsize][ysize];
		setGrid(temp);
	}

	public Sector[][] getGrid() { return grid; }
	private void setGrid(Sector[][] g) { grid = g; }
	
	public Sector getSector(Location loc) { return grid[loc.getX()][loc.getY()]; }
	public void setSector(Sector sector, Location loc) {
		grid[loc.getX()][loc.getY()] = sector;
	}
}
