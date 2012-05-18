package haxxitj.neural.general;


public class Input {
	private Weight weight;
	private Node node;
	
	public Input(Weight w, Node n) {
		setWeight(w);
		setNode(n);
	}
	
	public Weight getWeight() { return weight; }
	public void setWeight(Weight w) { weight = w; }
	
	public Node getNode() { return node; }
	public void setNode(Node n) { node = n; }
	
	public double getValue() { return weight.getWeight() * node.getValue(); }
}
