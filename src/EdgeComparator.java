import java.util.*;
public class EdgeComparator implements Comparator<Edge> {

	@Override
	public int compare(Edge arg0, Edge arg1) {
		// TODO Auto-generated method stub
		return arg0.weight - arg1.weight;
		
	}
	
}
