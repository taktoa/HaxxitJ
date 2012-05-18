package haxxitj.neural;

import haxxitj.neural.general.Input;
import haxxitj.neural.general.Node;
import haxxitj.neural.general.Weight;

import java.util.ArrayList;


public abstract class ConnectorNode extends Node {
	private ArrayList<Input> inputs;
	
	public ConnectorNode() { inputs = new ArrayList<Input>(); }
	
	public void addInput(Weight w, Node input) {
		inputs.add(new Input(w, input));
	}

	public ArrayList<Input> getInputs() { return inputs; }
	
	public abstract double activationFunction(double input);
	
	public double getValue() {
		double result = 0;
		for(Input i : getInputs()) {
			result += i.getValue();
		}
		return activationFunction(result);
	}
}
