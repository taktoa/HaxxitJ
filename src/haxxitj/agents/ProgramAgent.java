package haxxitj.agents;

import haxxitj.agents.general.Agent;
import haxxitj.agents.general.AgentProperties;
import haxxitj.agents.general.AgentState;

public class ProgramAgent implements Agent {
	
	private AgentProperties properties;
	private AgentState currentState;
	
	public ProgramAgent(AgentProperties prop, AgentState state) {
		setProperties(prop);
		setCurrentState(state);
	}

	public AgentProperties getProperties() { return properties; }
	public AgentState getCurrentState() { return currentState; }
	
	public void setProperties(AgentProperties p) { properties = p;	}	
	public void setCurrentState(AgentState s) { currentState = s; }
}