/*recycled Node class from COSC 211
 *Coded by Susan Hatem (myself) 
 *Assisted by Dr. Ranjan Chaudhuri
 */

public class Node{

	double item;
	Node link;


	public Node(){
		item = 0;
		link = null;
	}
	
	public Node(double m) {
		item = m;
		link = null;
	}
	
	public Node(double x, Node p){
		item = x;
		link = p;
	}
	
	public double getItem() {
		return item;
	}

	public String toString() {
		String str = item + " ";
		return str;
	}
}
