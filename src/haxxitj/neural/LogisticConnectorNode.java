package haxxitj.neural;


public class LogisticConnectorNode extends ConnectorNode {
	private double beta;
	
	public LogisticConnectorNode(double b) { setBeta(b); }

	public double activationFunction(double input) {
		return (1 / (1 + Math.pow(Math.E, -2 * input * getBeta())));
	}

	public double getBeta() { return beta; }
	public void setBeta(double beta) { this.beta = beta; }
}
