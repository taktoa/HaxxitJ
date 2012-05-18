package haxxitj.agents.general;

public class Command {
	private String description;
	private int range;
	private double strength;
	
	public Command(String desc, int r, double s) {
		description = desc;
		range = r;
		strength = s;
	}
	
	public String getDescription() { return description; }
	public int getRange() { return range; }
	public double getStrength() { return strength; }
	
	public String toString() {
		return "Description: " + description + "\n" +
				"Range: " + range + "\n" +
				"Strength: " + strength;
	}
}
