package haxxitj;

import haxxitj.neural.InputNode;
import haxxitj.neural.LogisticConnectorNode;
import haxxitj.neural.general.Weight;

public class HaxxitRunner {
	public static void main(String[] args) throws Exception {
		if(args.length != 2) { throw new Exception("Invalid arguments!"); }
		double xvalue, yvalue;
		xvalue = Double.valueOf(args[0]);
		yvalue = Double.valueOf(args[1]);
		LogisticConnectorNode a, b, c, d;
		InputNode x, y;
		a = new LogisticConnectorNode(1.0);
		b = new LogisticConnectorNode(1.0);
		c = new LogisticConnectorNode(1.0);
		d = new LogisticConnectorNode(1.0);
		x = new InputNode(xvalue);
		y = new InputNode(yvalue);
		a.addInput(new Weight(0.5), x);
		a.addInput(new Weight(0.5), y);
		b.addInput(new Weight(0.5), x);
		b.addInput(new Weight(0.5), y);
		c.addInput(new Weight(1.0), a);
		c.addInput(new Weight(1.0), b);
		d.addInput(new Weight(0.3), c);
		System.out.println(d.getValue());
	}
}
