package haxxitj.neural;

import java.util.ArrayList;

import haxxitj.neural.general.Node;

public class OutputNode extends Node {
	private ArrayList<Node> inputs;
	
	public void addInput(Node input) {
		inputs.add(input);
	}
	
	public double getValue() { return 0; }
	
	public double[] getValues() {
		ArrayList<Double> output = new ArrayList<Double>();
		for(Node n : inputs)
			output.add(n.getValue());
		Double[] out = new Double[output.size()];
		output.toArray(out);
		double[] result = new double[out.length];
		for(int i = 0; i < out.length; i++)
			result[i] = out[i];
		return result;
	}
}
