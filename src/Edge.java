
public class Edge {
	@Override
    public String toString() {
        return "Edge [v=" + v + ", u=" + u + ", weight=" + weight + "]";
    }
    int v;
	int u;
	int weight;
	Edge(int p1, int p2, int p3)
	{
		v = p1;
		u = p2;
		weight = p3;
	}
}
