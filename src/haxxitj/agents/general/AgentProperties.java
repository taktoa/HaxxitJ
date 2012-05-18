package haxxitj.agents.general;
import java.awt.Color;


public class AgentProperties {
	private String name;
	private Color color;
	private Command[] commands;
	private int speed; 
	
	public AgentProperties(String name, Color color, Command[] com, int speed) {
		setName(name);
		setColor(color);
		setCommands(com);
		setSpeed(speed);
	}
	
	public String getName() { return name; }
	public Color getColor() { return color; }
	public Command[] getCommands() { return commands; } 
	public int getSpeed() { return speed; }
	
	public void setName(String n) { name = n; }
	public void setColor(Color c) { color = c; }
	public void setCommands(Command[] c) { commands = c; } 
	public void setSpeed(int s) { speed = s; }
}
