package haxxitj.neural;

import haxxitj.neural.general.Node;

public class InputNode extends Node {
	private double value;
	
	public InputNode(double v) { setValue(v); }

	public double getValue() { return value; }
	public void setValue(double value) { this.value = value; }
}
