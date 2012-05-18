package haxxitj.genetic;

public interface Genome {
	public Genome combine(Genome g);
	public double fitness();
}
