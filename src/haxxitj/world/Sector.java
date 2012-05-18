package haxxitj.world;

import haxxitj.agents.general.Agent;

public class Sector {
	private Agent contents;

	public Sector(Agent c) {
		setContents(c);
	}
	
	public Agent getContents() { return contents; }
	public void setContents(Agent c) { contents = c; }
	
	public void empty() { setContents(null); }
}
