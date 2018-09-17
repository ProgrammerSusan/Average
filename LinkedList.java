/* Hatem
 * https://github.com/ProgrammerSusan/Average
 * COSC 311
 * hw0911
 */

public class LinkedList {
	
	public static void main(String[] args) {
		
		double[] list = {2.6, 5.7, 10.2, 6.8, 2.3, 9.4};
		LinkedList numList = new LinkedList(); 
				
			for(int i = 0; i < list.length; i++) {
				numList.add(list[i]);
			}
		
		System.out.println("Your starting list: " + numList);
		
		double avg = numList.average();
		System.out.println("The average of the starting list is " + avg);
		
		numList.deleteHigh(avg);
		System.out.println("Your new list: " + numList);
	}

	public Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public LinkedList(double [] data) {
		head = null;
        for (int i = 0; i < data.length; i++) {
            head = new Node(data[i], head);
        }
	}
	
	public void add(double num) {
		Node position = head;
		   if(head == null) {
		      head = new Node(num,head);
		   }
		   else {
			   while(position.link != null) {
				   position = position.link;
			   }
		  position.link = new Node(num,null);
		} 
	}
	
	public double average() {
		Node temp = head;
		double avg = 0;
		int count = 0;
		while(temp != null) {
			count++;
			avg+= temp.getItem();
			temp = temp.link;
		}
		avg = avg/count;
		return avg;
	}
	
	public void deleteHigh(double a) {
		Node first = head;
		Node second = head.link;
		if(head.getItem() > a) {
			head = head.link;
			}
		while(second != null) {
			if(second.getItem() > a) {
				first.link = second.link;
				second = second.link;
			}
			else {
				first = first.link;
				second = second.link;
			}
		}
	}
	
	public String toString() {
		Node temp = head;
		String str = "";
		while(temp != null) {
			str += temp.toString();
			temp = temp.link;
		}
		return str;
	}
}


